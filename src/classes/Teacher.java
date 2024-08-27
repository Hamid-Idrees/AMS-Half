
package classes;


public class Teacher {
    
    private String username;
    private String password;

    public Teacher() {
        // Default constructor
    }

    public Teacher(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    // Getter and Setter methods
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
