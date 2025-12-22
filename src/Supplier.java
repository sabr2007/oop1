public class Supplier extends BaseEntity {


    private String companyName;
    private String phone;
    private String country;

    public Supplier(int id, String companyName, String phone, String country){
        super(id);
        this.companyName = companyName;
        this.phone = phone;
        this.country = country;
    }


    public String getCompanyName(){
        return companyName;
    }
    public String getPhone(){
        return phone;
    }
    public String getCountry(){
        return country;
    }

    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }

    @Override
    public String toString(){
    return "Company: " + companyName + " " + "Phone: " + phone + " " +  "Country: " + country;
    }

    @Override
    public String shortInfo() {
        return "Supplier: " + companyName + " (" + country + ")";
    }
}
