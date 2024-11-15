package model.entity;

public class EmployeeFulltime extends Employee {
    private String type;
    private String statusWork;
    private double salary;
    private String position;
    private String dateExpireContract;
    private String dateSignContract;
    private final String companyName = "HOSPITAL A";
    private long departmentId;
    private int dateOfLeave;

    public EmployeeFulltime(int id, String name, int age, String gender, String maritalStatus, String address, String phone, String email, String dayOfBirth, String type, String statusWork, double salary, String position, String dateExpireContract, String dateSignContract, long departmentId, int dateOfLeave) {
        super(id, name, age, gender, maritalStatus, address, phone, email, dayOfBirth);
        this.type = type;
        this.statusWork = statusWork;
        this.salary = salary;
        this.position = position;
        this.dateExpireContract = dateExpireContract;
        this.dateSignContract = dateSignContract;
        this.departmentId = departmentId;
        this.dateOfLeave = dateOfLeave;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatusWork() {
        return statusWork;
    }

    public void setStatusWork(String statusWork) {
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

    public String getDateExpireContract() {
        return dateExpireContract;
    }

    public void setDateExpireContract(String dateExpireContract) {
        this.dateExpireContract = dateExpireContract;
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

    public long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }

    public int getDateOfLeave() {
        return dateOfLeave;
    }

    public void setDateOfLeave(int dateOfLeave) {
        this.dateOfLeave = dateOfLeave;
    }

    @Override
    public String toString() {
        String employee = super.toString();
        return
                "EmployeeFulltime{" + employee + '\'' +
                "type='" + type + '\'' +
                ", statusWork='" + statusWork + '\'' +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                ", dateExpireContract='" + dateExpireContract + '\'' +
                ", dateSignContract='" + dateSignContract + '\'' +
                ", companyName='" + companyName + '\'' +
                ", departmentId=" + departmentId +
                ", dateOfLeave=" + dateOfLeave +
                '}';
    }
}
