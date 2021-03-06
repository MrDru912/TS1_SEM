package mamaeand;

public class CompanyForm {
    private String name;
    private String email;
    private String phoneNumber;
    private String company;
    private String companySize;
    private String country;

    public CompanyForm(String name, String email, String phoneNumber, String company, String companySize, String country) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.company = company;
        this.companySize = companySize;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCompany() {
        return company;
    }

    public String getCompanySize() {
        return companySize;
    }

    public String getCountry() {
        return country;
    }
}
