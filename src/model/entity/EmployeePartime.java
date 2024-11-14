package model.entity;

public class EmployeePartime extends EmployeeFulltime {
    public EmployeePartime(int id, String name, int age, String gender, String maritalStatus, String address, String phone, String email, String dayOfBirth, String type, boolean statusWork, double salary, String position, String dateExpireContract, String dateSignContract, String companyName, long departmentId, int dateOfLeave) {
        super(id, name, age, gender, maritalStatus, address, phone, email, dayOfBirth, type, statusWork, salary, position, dateExpireContract, dateSignContract, companyName, departmentId, dateOfLeave);
    }
}
