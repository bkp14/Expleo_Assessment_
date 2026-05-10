package assessment4;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class updatedata {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    Connection con = dbconnection.getConnection();
    String updateSql = "UPDATE fine f " +"JOIN BORROW b ON f.borrow_id = b.borrow_id " +
            "JOIN MEMBERS m ON f.member_id = m.member_id " +
            "SET f.fine_amount = 500 " +
            "WHERE m.membership_type = 'Basic' AND b.status = 'Overdue'";
    PreparedStatement st = con.prepareStatement(updateSql);
    int rowsUpdated = st.executeUpdate();
    if(rowsUpdated > 0) {
		System.out.println("Data updated successfully!");
	}
    else {
    			System.out.println("No matching record found to update.");
    }
	}
	

}
