public class Users {
    private String firstName;
    private String lastName;
    private String passWord;
    private String email;
    private String creditCardNumber;
    private double AnnualFee;

    public Users(String firstName, String lastName, String passWord, String email, String creditCardNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passWord = passWord;
        this.email = email;
        this.creditCardNumber = creditCardNumber;
        this.AnnualFee = 0;
    }
    public Users(String firstName,String lastName,String email) {
        this.firstName = firstName;
        this.lastName=lastName;
        this.email=email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public double getAnnualFee() {
        return AnnualFee;
    }

    public void setAnnualFee(double AnnualFee) {
        this.AnnualFee = AnnualFee;
    }

    public void AnnualFee(int periodOfTimeWhileMembership, double monthlyFee) {
        double sum=periodOfTimeWhileMembership * monthlyFee;
        this.AnnualFee=sum ;
    }

}