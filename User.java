import java.io.Serializable;
public class User implements Serializable{
    protected String id;
    protected String name;
    protected String email;
    protected String password;
    public User(String id,String name,String email,String password){
        this.id=id;
        this.name=name;
        this.email=email;
        this.password=password;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public boolean validatepassword(String Password){
        return this.password.equals(Password);
    }
}
