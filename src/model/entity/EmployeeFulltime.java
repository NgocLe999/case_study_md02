package model.entity;

public class EmployeeFulltime extends Employee {
    private String type;
    private boolean statusWork;
    private double salary;
    private String position;
    private String dateToCompany;
    private String dateSignContract;
    private String companyName;
    private long departmentId;

    public EmployeeFulltime(int id, String name, int age, String gender, String maritalStatus, String address, String phone, String email, String dayOfBirth, String type, boolean statusWork, double salary, String position, String dateToCompany, String dateSignContract, String companyName, long departmentId) {
        super(id, name, age, gender, maritalStatus, address, phone, email, dayOfBirth);
        this.type = type;
        this.statusWork = statusWork;
        this.salary = salary;
        this.position = position;
        this.dateToCompany = dateToCompany;
        this.dateSignContract = dateSignContract;
        this.companyName = companyName;
        this.departmentId = departmentId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStatusWork() {
        return statusWork;
    }

    public void setStatusWork(boolean statusWork) {
        this.statusWork = statusWork;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDateToCompany() {
        return dateToCompany;
    }

    public void setDateToCompany(String dateToCompany) {
        this.dateToCompany = dateToCompany;
    }

    public String getDateSignContract() {
        return dateSignContract;
    }

    public void setDateSignContract(String dateSignContract) {
        this.dateSignContract = dateSignContract;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }
}
