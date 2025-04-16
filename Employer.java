public class Employer extends User{
    private String companyname;
    public Employer(String id,String name,String email,String password,String companyname){
        super(id,name,email,password);
        this.companyname=companyname;
    }
    public String getCompanyname(){
        return companyname;
    }
}
