package model.entity;

public class Company {
    private String companyName;
    private String companyAddress;
    private String companyPhone;

    public Company(String companyName, String companyAddress, String companyPhone) {
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.companyPhone = companyPhone;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", companyAddress='" + companyAddress + '\'' +
                ", companyPhone='" + companyPhone + '\'' +
                '}';
    }
}
