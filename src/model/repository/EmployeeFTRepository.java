package model.repository;


import model.entity.EmployeeFulltime;
import model.entity.EmployeePartime;

import java.util.ArrayList;
import java.util.List;

public class EmployeeFTRepository {

    private static  List<EmployeeFulltime> employeeFulltime = new ArrayList<>();

    static {
        employeeFulltime.add(new EmployeeFulltime(1, "Nguyen Van A", 30, "Male", "Married", "123 Main St", "0123456789", "nguyenvana@example.com", "1994-05-14", "Full-Time", true, 1000.0, "Doctor", "2019-11-15", "2020-01-15", "Hospital A", 2, 0));
        employeeFulltime.add(new EmployeeFulltime(2, "Tran Thi B", 28, "Female", "Single", "456 Elm St", "0123456790", "tranthib@example.com", "1996-03-20", "Full-Time", true, 1200.0, "Nurse", "2019-01-15", "2019-03-10", "Hospital A", 4, 0));
        employeeFulltime.add(new EmployeeFulltime(3, "Le Van C", 35, "Male", "Married", "789 Oak St", "0123456791", "levanc@example.com", "1989-07-22", "Full-Time", true, 1500.0, "Surgeon", "2018-04-15", "2018-06-01", "Hospital A", 4,0));
        employeeFulltime.add(new EmployeeFulltime(4, "Pham Thi D", 32, "Female", "Married", "321 Pine St", "0123456792", "phamthid@example.com", "1992-09-14", "Part-Time", true, 800.0, "Technician", "2021-01-15", "2021-02-18", "Hospital A", 7,0));
        employeeFulltime.add(new EmployeeFulltime(5, "Nguyen Van E", 40, "Male", "Single", "654 Cedar St", "0123456793", "nguyenvane@example.com", "1984-11-09", "Full-Time", true, 2000.0, "Pharmacist", "2016-09-15", "2016-11-15", "Hospital A", 7,0));
        employeeFulltime.add(new EmployeeFulltime(6, "Tran Thi F", 27, "Female", "Single", "987 Birch St", "0123456794", "tranthif@example.com", "1997-04-30", "Full-Time", true, 900.0, "Lab Technician", "2022-03-15", "2022-05-05", "Hospital A", 3,0));
        employeeFulltime.add(new EmployeeFulltime(7, "Le Van G", 34, "Male", "Married", "213 Spruce St", "0123456795", "levang@example.com", "1990-08-25", "Full-Time", true, 1400.0, "Doctor", "2017-07-15", "2017-09-10", "Hospital A", 3,0));
        employeeFulltime.add(new EmployeeFulltime(8, "Pham Thi H", 31, "Female", "Single", "546 Walnut St", "0123456796", "phamthih@example.com", "1993-12-01", "Part-Time", true, 750.0, "Receptionist", "2023-01-15", "2023-01-20", "Hospital A", 6,0));
        employeeFulltime.add(new EmployeeFulltime(9, "Nguyen Van I", 29, "Male", "Single", "879 Aspen St", "0123456797", "nguyenvani@example.com", "1995-10-14", "Full-Time", true, 1100.0, "Nurse", "2021-01-15", "2021-03-15", "Hospital A", 8,0));
        employeeFulltime.add(new EmployeeFulltime(10, "Tran Thi J", 33, "Female", "Married", "159 Maple St", "0123456798", "tranthij@example.com", "1991-06-10", "Full-Time", true, 1300.0, "Doctor", "2018-06-15", "2018-08-01", "Hospital A", 8,0));
        employeeFulltime.add(new EmployeeFulltime(11, "Le Van K", 38, "Male", "Single", "753 Poplar St", "0123456799", "levank@example.com", "1986-05-25", "Full-Time", true, 1600.0, "Surgeon", "2017-07-15", "2017-07-20", "Hospital A", 9,0));
    }
}


