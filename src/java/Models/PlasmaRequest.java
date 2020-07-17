package Models;

public class PlasmaRequest {
							
    private int plasma_request_id, plasma_seeker_id, number_of_bags_of_plasma;
    private String name, location, address, nid, plasma_type, contact_number;

    public int getPlasma_request_id() {
        return plasma_request_id;
    }

    public void setPlasma_request_id(int plasma_request_id) {
        this.plasma_request_id = plasma_request_id;
    }
    
    public int getPlasma_seeker_id() {
        return plasma_seeker_id;
    }

    public void setPlasma_seeker_id(int plasma_seeker_id) {
        this.plasma_seeker_id = plasma_seeker_id;
    }
    
    public int getNumber_of_bags_of_plasma() {
        return number_of_bags_of_plasma;
    }

    public void setNumber_of_bags_of_plasma(int number_of_bags_of_plasma) {
        this.number_of_bags_of_plasma = number_of_bags_of_plasma;
    }
      
    public String getPlasma_type() {
        return plasma_type;
    }

    public void setPlasma_type(String plasma_type) {
        this.plasma_type = plasma_type;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }
    
    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }
    

    
    
}
