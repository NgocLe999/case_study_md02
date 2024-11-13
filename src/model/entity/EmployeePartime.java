package model.entity;

public class EmployeePartime extends EmployeeFulltime {

    public EmployeePartime(int id, String name, int age, String gender, String maritalStatus, String address, String phone, String email, String dayOfBirth, String type, boolean statusWork, double salary, String position, String dateToCompany, String dateSignContract, String companyName, long departmentId) {
        super(id, name, age, gender, maritalStatus, address, phone, email, dayOfBirth, type, statusWork, salary, position, dateToCompany, dateSignContract, companyName, departmentId);
    }
}
