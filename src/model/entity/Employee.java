package model.entity;

public class Employee {

    private long id;
    private String name;
    private String age;
    private String gender;
    private String maritalStatus;
    private String address;
    private String phone;
    private String email;
    private String dayOfBirth;

    public Employee(long id, String name, String age, String gender, String maritalStatus, String address, String phone, String email, String dayOfBirth) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.dayOfBirth = dayOfBirth;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\''
                ;
    }
}
