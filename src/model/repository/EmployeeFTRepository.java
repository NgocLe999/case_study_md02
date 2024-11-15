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
        employeeFulltime.add(new EmployeeFulltime(1, "Nguyen Van A", 30, "Male", "Married", "123 Main St", "0123456789", "nguyenvana@example.com", "1994-05-14", "Full-Time", "Đang làm việc", 1000, "Doctor", "2019-11-15", "2020-01-15", 2, 0));
        employeeFulltime.add(new EmployeeFulltime(2, "Tran Thi B", 28, "Female", "Single", "456 Elm St", "0123456790", "tranthib@example.com", "1996-03-20", "Full-Time", "Đang làm việc", 1200, "Nurse", "2019-01-15", "2019-03-10", 4, 0));
        employeeFulltime.add(new EmployeeFulltime(3, "Le Van C", 35, "Male", "Married", "789 Oak St", "0123456791", "levanc@example.com", "1989-07-22", "Full-Time", "Đang làm việc", 1500, "Surgeon", "2018-04-15", "2018-06-01", 4,0));
        employeeFulltime.add(new EmployeeFulltime(4, "Pham Thi D", 32, "Female", "Married", "321 Pine St", "0123456792", "phamthid@example.com", "1992-09-14", "Part-Time", "Đang làm việc", 800, "Technician", "2021-01-15", "2021-02-18", 7,0));
        employeeFulltime.add(new EmployeeFulltime(5, "Nguyen Van E", 40, "Male", "Single", "654 Cedar St", "0123456793", "nguyenvane@example.com", "1984-11-09", "Full-Time", "Đang làm việc", 2000, "Pharmacist", "2016-09-15", "2016-11-15", 7,0));
        employeeFulltime.add(new EmployeeFulltime(6, "Tran Thi F", 27, "Female", "Single", "987 Birch St", "0123456794", "tranthif@example.com", "1997-04-30", "Full-Time", "Đang làm việc", 900, "Lab Technician", "2022-03-15", "2022-05-05", 3,0));
        employeeFulltime.add(new EmployeeFulltime(7, "Le Van G", 34, "Male", "Married", "213 Spruce St", "0123456795", "levang@example.com", "1990-08-25", "Full-Time", "Nghỉ việc", 1400, "Doctor", "2017-07-15", "2017-09-10", 3,0));
        employeeFulltime.add(new EmployeeFulltime(8, "Pham Thi H", 31, "Female", "Single", "546 Walnut St", "0123456796", "phamthih@example.com", "1993-12-01", "Part-Time", "Nghỉ việc", 750, "Receptionist", "2023-01-15", "2023-01-20", 6,0));
        employeeFulltime.add(new EmployeeFulltime(9, "Nguyen Van I", 29, "Male", "Single", "879 Aspen St", "0123456797", "nguyenvani@example.com", "1995-10-14", "Full-Time", "Nghỉ việc", 1100, "Nurse", "2021-01-15", "2021-03-15", 8,0));
        employeeFulltime.add(new EmployeeFulltime(10, "Tran Thi J", 33, "Female", "Married", "159 Maple St", "0123456798", "tranthij@example.com", "1991-06-10", "Full-Time", "Nghỉ việc", 1300, "Doctor", "2018-06-15", "2018-08-01", 8,0));
    }

    public List<EmployeeFulltime> getAll() {
        return employeeFulltime;
    }

    public void save(EmployeeFulltime employee) {
        employeeFulltime.add(employee);
//        IOFile.writeFile(students, false);
    }

    public EmployeeFulltime findEmployeeFulltime(int id) {
        List<EmployeeFulltime> employees = getAll();
        for (EmployeeFulltime employee : employees) {
            if (id == employee.getId()) {
                return employee;
            }
        }
        return null;
    }

    public void deleteEmployeeFulltime(int id) {
        List<EmployeeFulltime> employees = getAll();
        EmployeeFulltime employee = findEmployeeFulltime(id);
//        if (employee == null) {
////            System.out.println("Student" + employee.getName() + " đã bị xóa trước đó!)");
//        }
        employees.removeIf(employeeFulltime -> id == employeeFulltime.getId());
//        System.out.println("Đã xóa thành công student có id: " + id + " và có tên là : " + employee.getName());

    }

    public List<EmployeeFulltime>  searchByName (String name){
        List<EmployeeFulltime> employees = getAll();
        List<EmployeeFulltime> temp = new ArrayList<>();
        for (EmployeeFulltime employee : employees) {
            if (employee.getName().contains(name)) {
                temp.add(employee);
                return temp;
            }
        }
        return null;
    }


//
    public void updateEmployeeFT(int id, EmployeeFullTimeDTO employeeFullTimeDTO) {
        EmployeeFulltime employee = findEmployeeFulltime(id);
        if (employee == null) {
            System.out.println("Emplpoyee" + employee.getName() + " đã bị xóa trước đó!)");
        }
        employee.setName(employeeFullTimeDTO.getName());
        employee.setAge(employeeFullTimeDTO.getAge());
        employee.setGender(employeeFullTimeDTO.getGender());
        employee.setMaritalStatus(employeeFullTimeDTO.getMaritalStatus());
        employee.setAddress(employeeFullTimeDTO.getAddress());
        employee.setPhone(employeeFullTimeDTO.getPhone());
        employee.setEmail(employeeFullTimeDTO.getEmail());
        employee.setDayOfBirth(employeeFullTimeDTO.getDayOfBirth());
        employee.setStatusWork(employeeFullTimeDTO.getStatusWork());
        employee.setSalary(employeeFullTimeDTO.getSalary());
//        List<Student> students = getAll();
//        IOFile.writeFile(students, false);
    }
}


