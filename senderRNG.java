package MSGRNG;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class senderRNG {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sqlrng();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static int sqlrng() throws SQLException {
		
		Connection con = null;
		final String URL = "jdbc:mysql://database-1.clbujp5dtees.ap-northeast-2.rds.amazonaws.com/";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, "admin", "singapore");

		} catch (ClassNotFoundException e) {
			System.out.println("fail");
		}
		
		int i;
		String sql = "insert into Test.msgtable values(?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		// sender가 test
		for (i = 1000; i <= 1050; i++) {

			pstmt.setInt(1, i);
			pstmt.setString(2, "test");
			

			Date now = Calendar.getInstance().getTime();
			SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
			String formatedNow = formatter.format(now);
			pstmt.setString(3, formatedNow);
			
			String context = "안녕하세요. 저는 test입니다";
			pstmt.setString(4, context);
			pstmt.setInt(5, -1);
			
			System.out.println(i);

			pstmt.executeUpdate();
			
		}

		return 0;
	}
}
