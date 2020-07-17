package Models;

public class NewPlasmaSeeker {
    
    private int plasma_seeker_id;
    private String Name, Location, Address, Nid, MobileNo, Password;

    public int getplasma_seeker_id() {
        return plasma_seeker_id;
    }

    public void setplasma_seeker_id(int plasma_seeker_id) {
        this.plasma_seeker_id = plasma_seeker_id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
      
   
    public String getNid() {
        return Nid;
    }

    public void setNid(String Nid) {
        this.Nid = Nid;
    }
    
    public String getMobileNo() {
        return MobileNo;
    }

    public void setMobileNo(String MobileNo) {
        this.MobileNo = MobileNo;
    }
    
    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

}
