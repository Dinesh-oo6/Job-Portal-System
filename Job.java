import java.io.Serializable;
public class Job implements Serializable{
    private String jobid;
    private String companyname;
    private String title;
    private String description;
    private double salary;
    public Job(String jobid,String companyname,String title,String description,double salary){
        this.jobid=jobid;
        this.companyname=companyname;
        this.title=title;
        this.description=description;
        this.salary=salary;
    }
    public String getJobid(){
        return jobid;
    }
    public String getCompanyname(){
        return companyname;
    }
    public String getTitle(){
        return title;
    }
    public String getDescription(){
        return description;
    }
    public double getSalary(){
        return salary;
    }
}
