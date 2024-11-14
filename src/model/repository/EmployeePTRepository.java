package model.repository;

import model.entity.EmployeeFulltime;
import model.entity.EmployeePartime;

import java.util.ArrayList;
import java.util.List;

public class EmployeePTRepository {
    private static List<EmployeePartime> employeeParttime = new ArrayList<>();
    static {
        employeeParttime.add(new EmployeePartime(12, "Pham Thi L", 36, "Female", "Married", "951 Fir St", "0123456700", "phamthil@example.com", "1988-02-14", "Part-Time", true, 900.0, "Technician", "2019-10-15", "2019-12-18", "Hospital A", 11,0));
        employeeParttime.add(new EmployeePartime(13, "Nguyen Van M", 42, "Male", "Single", "963 Hemlock St", "0123456701", "nguyenvanm@example.com", "1982-01-10", "Full-Time", true, 2200.0, "Pharmacist", "2015-08-15", "2015-10-15", "Hospital A", 12,0));
        employeeParttime.add(new EmployeePartime(14, "Tran Thi N", 26, "Female", "Single", "357 Redwood St", "0123456702", "tranthin@example.com", "1998-09-22", "Full-Time", true, 950.0, "Lab Technician", "2022-06-15", "2022-08-05", "Hospital A", 15,0));
        employeeParttime.add(new EmployeePartime(15, "Le Van O", 39, "Male", "Married", "159 Maple St", "0123456703", "levano@example.com", "1985-07-15", "Full-Time", true, 1700.0, "Doctor", "2016-03-15", "2016-05-10", "Hospital A", 20,0));
        employeeParttime.add(new EmployeePartime(16, "Pham Thi P", 30, "Female", "Single", "753 Cedar St", "0123456704", "phamthip@example.com", "1994-10-20", "Part-Time", true, 800.0, "Receptionist", "2023-01-15", "2023-02-15", "Hospital A", 17,0));
        employeeParttime.add(new EmployeePartime(17, "Nguyen Van Q", 28, "Male", "Single", "789 Oak St", "0123456705", "nguyenvanq@example.com", "1996-05-14", "Full-Time", true, 1150.0, "Nurse", "2020-09-15", "2020-11-10", "Hospital A", 16,0));
    }
}