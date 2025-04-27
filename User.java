import java.io.Serializable;

public class User implements Serializable {
    protected String email;
    protected String password;
    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public boolean validatePassword(String password) {
        return this.password.equals(password);
    }
}
