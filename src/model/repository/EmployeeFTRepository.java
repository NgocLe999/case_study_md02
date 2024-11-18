package model.repository;


import model.entity.DTO.EmployeeFullTimeDTO;
import model.entity.EmployeeFulltime;
import model.entity.EmployeePartime;

import java.util.ArrayList;
import java.util.List;

public class EmployeeFTRepository {

    private static final String COMPANY_NAME = "HOSPITAL A";
    private static  List<EmployeeFulltime> employeeFulltime = new ArrayList<>();

    static {
        employeeFulltime.add(new EmployeeFulltime(1, "Nguyen Van A", "30", "Male", "Married", "123 Main St", "0123456789", "nguyenvana@example.com", "1994-05-14", "Full-Time", "Đang làm việc", 1000, "Doctor", "2024-01-15", "2024-12-18", 2, 0));
        employeeFulltime.add(new EmployeeFulltime(2, "Tran Thi B", "28", "Female", "Single", "456 Elm St", "0123456790", "tranthib@example.com", "1996-03-20", "Full-Time", "Đang làm việc", 1200, "Nurse", "2024-03-10", "2026-03-10", 4, 0));
        employeeFulltime.add(new EmployeeFulltime(3, "Le Van C", "35", "Male", "Married", "789 Oak St", "0123456791", "levanc@example.com", "1989-07-22", "Full-Time", "Đang làm việc", 1500, "Surgeon", "2024-06-01", "2025-06-01", 4,0));
        employeeFulltime.add(new EmployeeFulltime(4, "Pham Thi D", "32", "Female", "Married", "321 Pine St", "0123456792", "phamthid@example.com", "1992-09-14", "Part-Time", "Đang làm việc", 800, "Technician", "2024-02-18", "2025-02-18", 7,0));
        employeeFulltime.add(new EmployeeFulltime(5, "Nguyen Van A", "40", "Male", "Single", "654 Cedar St", "0123456793", "nguyenvane@example.com", "1984-11-09", "Full-Time", "Đang làm việc", 2000, "Pharmacist", "2024-11-15", "2025-11-15", 7,0));
        employeeFulltime.add(new EmployeeFulltime(6, "Tran Thi F", "27", "Female", "Single", "987 Birch St", "0123456794", "tranthif@example.com", "1997-04-30", "Full-Time", "Đang làm việc", 900, "Lab Technician", "2024-05-05", "2025-05-05", 3,0));
        employeeFulltime.add(new EmployeeFulltime(7, "Le Van G", "34", "Male", "Married", "213 Spruce St", "0123456795", "levang@example.com", "1990-08-25", "Full-Time", "Nghỉ việc", 1400, "Doctor", "2024-09-10", "2025-09-10", 3,0));
        employeeFulltime.add(new EmployeeFulltime(8, "Pham Thi H", "31", "Female", "Single", "546 Walnut St", "0123456796", "phamthih@example.com", "1993-12-01", "Part-Time", "Nghỉ việc", 750, "Receptionist", "2024-01-20", "2025-01-20", 6,0));
        employeeFulltime.add(new EmployeeFulltime(9, "Nguyen Van I", "29", "Male", "Single", "879 Aspen St", "0123456797", "nguyenvani@example.com", "1995-10-14", "Full-Time", "Nghỉ việc", 1100, "Nurse", "2024-03-15", "2025-03-15", 8,0));
        employeeFulltime.add(new EmployeeFulltime(10, "Tran Thi J", "33", "Female", "Married", "159 Maple St", "0123456798", "tranthij@example.com", "1991-06-10", "Full-Time", "Nghỉ việc", 1300, "Doctor", "2024-08-01", "2025-08-01", 8,0));
    }

    public static List<EmployeeFulltime> getAll() {
        return employeeFulltime;
    }

    public void save(EmployeeFulltime employee) {
        employeeFulltime.add(employee);
    }

    public static EmployeeFulltime findEmployeeFulltime(long id) {
        List<EmployeeFulltime> employees = getAll();
        for (EmployeeFulltime employee : employees) {
            if (id == employee.getId()) {
                return employee;
            }
        }
        return null;
    }

    public static void deleteEmployeeFulltime(long id) {
        List<EmployeeFulltime> employees = getAll();
        EmployeeFulltime employee = findEmployeeFulltime(id);
//        if (employee == null) {
////            System.out.println("Student" + employee.getName() + " đã bị xóa trước đó!)");
//        }
        employees.removeIf(employeeFulltime -> id == employeeFulltime.getId());
//        System.out.println("Đã xóa thành công student có id: " + id + " và có tên là : " + employee.getName());

    }

    public static List<EmployeeFulltime>  searchByName (String name){
        List<EmployeeFulltime> employees = getAll();
        List<EmployeeFulltime> temp = new ArrayList<>();
        for (EmployeeFulltime employee : employees) {
                String nameInput = name.toLowerCase();
                String nameEmployee = employee.getName().toLowerCase();
               if (nameEmployee.contains(nameInput)) {
                   temp.add(employee);
               }
        }
        return temp;
    }



// TRƯỜNG HỢP UPDATE TOÀN BỘ THÔNG TIN
    public static void updateEmployeeFT(long id, EmployeeFullTimeDTO employeeFullTimeDTO) {
        EmployeeFulltime employee = findEmployeeFulltime(id);
        if (employee == null) {
            System.out.println("Emplpoyee" + employee.getName() + " đã bị xóa trước đó!)");
        }

        if(employeeFullTimeDTO.getName().equals("")){
            employee.setName(employee.getName());
        }else {
            employee.setName(employeeFullTimeDTO.getName());
        }

        if(employeeFullTimeDTO.getAge().equals("")){
            employee.setAge(employee.getAge());
        }else {
            employee.setAge(employeeFullTimeDTO.getAge());
        }

        if(employeeFullTimeDTO.getGender().equals("")){
            employee.setGender(employee.getGender());
        }else {
            employee.setGender(employeeFullTimeDTO.getGender());
        }

        if(employeeFullTimeDTO.getAddress().equals("")){
            employee.setAddress(employee.getAddress());
        }else {
            employee.setAddress(employeeFullTimeDTO.getAddress());
        }

        if(employeeFullTimeDTO.getPhone().equals("")){
            employee.setPhone(employee.getPhone());
        }else {
            employee.setPhone(employeeFullTimeDTO.getPhone());
        }

        if(employeeFullTimeDTO.getEmail().equals("")){
            employee.setEmail(employee.getEmail());
        }else {
            employee.setEmail(employeeFullTimeDTO.getEmail());
        }

        if(employeeFullTimeDTO.getDayOfBirth().equals("")){
            employee.setAddress(employee.getDayOfBirth());
        }else {
            employee.setAddress(employeeFullTimeDTO.getDayOfBirth());
        }

        if(employeeFullTimeDTO.getStatusWork().equals("")){
            employee.setStatusWork(employee.getStatusWork());
        }else{
            employee.setStatusWork(employeeFullTimeDTO.getStatusWork());
        }

        if (employeeFullTimeDTO.getMaritalStatus().equals("")){
            employee.setMaritalStatus(employee.getMaritalStatus());
        }else {
            employee.setMaritalStatus(employeeFullTimeDTO.getMaritalStatus());
        }

        if(employeeFullTimeDTO.getSalary() == 0){
            employee.setSalary(employee.getSalary());
        }else {
            employee.setSalary(employeeFullTimeDTO.getSalary());
        }

    }

    public static String getDateContract(long id ){
        EmployeeFulltime employeeFulltime = findEmployeeFulltime(id);
        return employeeFulltime.getDateExpireContract();
    }

}


