package mamaeand;

public class GetInTouchForm {
    private String name;
    private String email;
    private String phoneNumber;
    private String company;
    private String website;
    private String country;
    private String interestedIn;
    private String message;

    public GetInTouchForm(String name, String email, String phoneNumber, String company, String website, String country, String interestedIn, String message) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.company = company;
        this.website = website;
        this.country = country;
        this.interestedIn = interestedIn;
        this.message = message;
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

    public String getWebsite() {
        return website;
    }

    public String getCountry() {
        return country;
    }

    public String getInterestedIn() {
        return interestedIn;
    }

    public String getMessage() {
        return message;
    }
}
