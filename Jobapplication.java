import java.io.Serializable;
public class Jobapplication implements Serializable{
    private String applicationid;
    private String jobid;
    private String jobseekerid;
    private String status;
    public Jobapplication(String applicationid,String jobid,String jobseekerid){
        this.applicationid=applicationid;
        this.jobid=jobid;
        this.jobseekerid=jobseekerid;
        this.status="Pending...!";
    }
    public String getApplicationid(){
        return applicationid;
    }
    public String getJobid(){
        return jobid;
    }
    public String getJobseekerid(){
        return jobseekerid;
    }
    public String getStatus(){
        return status;
    }
    public void updatestatus(String newstatus){
        this.status=newstatus;
    }
}
