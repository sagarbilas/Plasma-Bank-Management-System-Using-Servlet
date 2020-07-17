package Dao;
import Models.NewPlasmaSeeker;
import Models.Login;
import Models.PlasmaRequest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PlasmaSeekerDao {

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/plasmabankmanagementsystem", "root", "");

        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }

    	public static int saveNewPlasmaSeeker(NewPlasmaSeeker p, Login lg){
		int status=0, status2=0;
		try{
			Connection con = PlasmaSeekerDao.getConnection();              							
			PreparedStatement ps = con.prepareStatement("insert into plasma_seeker(Name, Location, Address, Nid, MobileNo, Password) values (?,?,?, ?, ?, ?)");
			ps.setString(1,p.getName());
			ps.setString(2,p.getLocation());
			ps.setString(3,p.getAddress());
			ps.setString(4,p.getNid());
                        ps.setString(5,p.getMobileNo());
                        ps.setString(6,p.getPassword());
			
			status = ps.executeUpdate();
                        
                        PreparedStatement ps2 = con.prepareStatement("insert into logintable(name, user_name, password, role) values (?,?,?, ? )");
			ps2.setString(1,lg.getName());
                        ps2.setString(2,lg.getName());
                        ps2.setString(3,lg.getPassword());
                        ps2.setString(4,"plasma-seeker");
                        status2 = ps2.executeUpdate();
			
			con.close();
		}catch(Exception ex){ex.printStackTrace();}
		
		return status;
	}
        
        
        
            	public static int saveNewPlasmaRequest(PlasmaRequest pr){
		int status=0;
		try{
			Connection con = PlasmaSeekerDao.getConnection();              							
			PreparedStatement ps = con.prepareStatement("insert into plasma_requests(plasma_seeker_id, Name, location, address, nid, plasma_type, number_of_bags_of_plasma, contact_number) values (?,?,?, ?, ?, ?, ?, ?)");
			ps.setInt(1,pr.getPlasma_seeker_id());
                        ps.setString(2,pr.getName());
			ps.setString(3,pr.getLocation());
			ps.setString(4,pr.getAddress());
			ps.setString(5,pr.getNid());
                        ps.setString(6,pr.getPlasma_type());
                        ps.setInt(7,pr.getNumber_of_bags_of_plasma());
                        ps.setString(8,pr.getContact_number());
			
			status = ps.executeUpdate();
			
			con.close();
		}catch(Exception ex){ex.printStackTrace();}
		
		return status;
	}
        

}
