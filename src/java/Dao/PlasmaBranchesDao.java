package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Models.PlasmaBranches;

import java.util.*;
import java.sql.*;

public class PlasmaBranchesDao {

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/plasmabankmanagementsystem", "root", "root");

        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }

    	public static int save(PlasmaBranches p){
		int status=0;
		try{
			Connection con = PlasmaBranchesDao.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into plasma_branches(branch_name, branch_location, branch_user_name, password, role, contact_number) values (?,?,?, ?, ?, ?)");
			ps.setString(1,p.getBranch_location());
			ps.setString(2,p.getBranch_name());
			ps.setString(3,p.getBranch_user_name());
                        
			ps.setString(4,p.getPassword());
                        ps.setString(5,p.getRole());
                        ps.setString(6,p.getContact_number());
			
			status = ps.executeUpdate();
			
			con.close();
		}catch(Exception ex){ex.printStackTrace();}
		
		return status;
	}

        
    public static List<PlasmaBranches> getAllPlasmaBranches() {
        List<PlasmaBranches> list = new ArrayList<PlasmaBranches>();

        try {
            Connection con = PlasmaBranchesDao.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from plasma_branches");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PlasmaBranches pbranch = new PlasmaBranches();
                pbranch.setBranch_id(rs.getInt(1));
                pbranch.setBranch_location(rs.getString(2));
                pbranch.setBranch_name(rs.getString(3));
                pbranch.setBranch_user_name(rs.getString(4));
                list.add(pbranch);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

}
