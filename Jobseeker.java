public class Jobseeker extends User{
    private String resume;
    public Jobseeker(String id,String name,String email,String password,String resume){
        super(id,name,email,password);
        this.resume=resume;
    }
    public String getResume(){
        return resume;
    }
}
