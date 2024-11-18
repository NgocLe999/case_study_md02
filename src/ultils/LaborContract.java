package ultils;

import service.Interface.Contract;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;

public class LaborContract implements Contract {

    @Override
    public int termContract(String date) {
        try{
            LocalDate contractEndDate = LocalDate.parse(date);
            LocalDate currentDate = LocalDate.now();
            Period period = Period.between(currentDate, contractEndDate);
            if (currentDate.isAfter(contractEndDate)){
                System.out.println("Hợp đồng đã hết hạn.");
            }else {
                int monthsRemaining = period.getMonths() + period.getYears() * 12;
                return monthsRemaining;
//                System.out.println("Còn " + monthsRemaining + " tháng nữa là hết hợp đồng.");
            }

        }catch (DateTimeParseException e){
            System.out.println("Định dạng ngày tháng không hợp lệ: ");
        }
        return 0;
    }

    @Override
    public int updateDayOfLeave(String date) {
      int day = 12 - termContract(date);
        return day;
    }
}
