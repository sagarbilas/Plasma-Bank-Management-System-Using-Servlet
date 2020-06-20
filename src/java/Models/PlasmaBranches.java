
package Models;

public class PlasmaBranches {
    
    private int branch_id;
    private String branch_name, branch_location, branch_user_name, password, role, contact_number;

    public int getBranch_id() {
        return branch_id;
    }

    public void setBranch_id(int branch_id) {
        this.branch_id = branch_id;
    }

    public String getBranch_name() {
        return branch_name;
    }

    public void setBranch_name(String branch_name) {
        this.branch_name = branch_name;
    }

    public String getBranch_location() {
        return branch_location;
    }

    public void setBranch_location(String branch_location) {
        this.branch_location = branch_location;
    }

    public String getBranch_user_name() {
        return branch_user_name;
    }

    public void setBranch_user_name(String branch_user_name) {
        this.branch_user_name = branch_user_name;
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
    
    public String getContact_number() {
        return branch_user_name;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }


}
