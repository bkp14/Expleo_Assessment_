package assessment4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class dataaccess {
	public static void main(String[] args) throws Exception {
  Connection con =  dbconnection.getConnection();
  String sql = "SELECT * FROM books";
  PreparedStatement st = con.prepareStatement(sql);
	ResultSet rs = st.executeQuery();
	while(rs.next()) {
		int id = rs.getInt("book_id");
		String title = rs.getString("title");
		String author = rs.getString("author");
		String isbn = rs.getString("isbn");
		int pub_year = rs.getInt("pub_year");
		double price = rs.getDouble("price");
		int total_copies = rs.getInt("total_copies");
		int category_id = rs.getInt("category_id");
		
		 String output = "Book #%d: Title=%s, Author=%s, ISBN=%s, Publisher=%s, Year=%d, Price=%.2f, Copies=%d,"
		 		+ " CategoryID=%d";
		System.out.println(String.format(output, id, id, title, author, isbn, pub_year, price, total_copies,
				category_id));
	}
	con.close();
	rs.close();
	st.close();
}
	
}