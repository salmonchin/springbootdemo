package service;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.DBUtil;
import model.Article;


public class HomeService{
	public static List getArticleComments() {
		List<Article> ArticleComments=new ArrayList<Article>();
		DBUtil db = new DBUtil();
		String sql="select * from t_article where istoday=1 limit 0,2";
		Connection con=db.getCon();
		try {
			PreparedStatement pre=con.prepareStatement(sql);
			ResultSet rs = pre.executeQuery();
			while(rs.next()) {
				Article article=new Article();
				article.setArticleID(rs.getInt("article_id"));
				article.setArticleName(rs.getString("article_name"));
				article.setArticleContent(rs.getString("article_content"));
				article.setArticleDate(rs.getDate("article_date"));
				article.setArticleWriter(rs.getString("article_writer"));
				article.setArticlePicUrl(rs.getString("article_pic"));
				article.setArticleText(rs.getString("article_text"));
				ArticleComments.add(article);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ArticleComments;
		
	}
}
