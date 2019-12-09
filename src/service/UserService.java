package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.DBUtil;
import model.User;

public class UserService {

	public static User getLoginUser(String userName, String userPass) {
		// TODO Auto-generated method stub
		User user = new User();
		DBUtil db = new DBUtil();
		Connection con = db.getCon();
		String sql="select * from t_user where user_name=? and user_pass=?";
		try {
			PreparedStatement pre = con.prepareStatement(sql);
			pre.setString(1, userName);
			pre.setString(2, userPass);
			ResultSet rs = pre.executeQuery();
			if(rs.next()) {
				user.setUserName(rs.getString("user_name"));
				user.setUserPass(rs.getString("user_pass"));
				user.setUserId(rs.getInt("user_id"));
				return user;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static int regNewUser(User regUser) {
		// TODO Auto-generated method stub
		DBUtil db = new DBUtil();
		Connection con = db.getCon();
		String sql="insert into t_user values(null,?,?,?,?,?,0)";
		try {
			PreparedStatement pre = con.prepareStatement(sql);
			pre.setString(1, regUser.getUserName());
			pre.setString(2,regUser.getUserPass());
			pre.setInt(3, regUser.getUserAge());
			pre.setInt(4, regUser.getUserSex());
			pre.setString(5, regUser.getUserEmail());
			return(pre.executeUpdate());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public static boolean checkUserName(String userName) {
		// TODO Auto-generated method stub
		return false;
	}

}
