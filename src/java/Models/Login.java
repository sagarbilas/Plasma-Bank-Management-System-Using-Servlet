
package Models;

public class Login {
    private int user_id;
    private String name, user_name, password, role;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserame() {
        return user_name;
    }

    public void setUserName(String user_name) {
        this.user_name = user_name;
    }
      
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
   
}
