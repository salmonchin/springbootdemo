package service;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DBUtil;
import model.Article;
import model.ArticleCate;
import model.Picture;

public class ArticleService {
	//  获取文章内容和所附图片
	public static List<Article> getArticleByID(String articleID) {
		List<Article> ArticleContent = new ArrayList<Article>();
		DBUtil db = new DBUtil();
		Connection con = db.getCon();
		String sql = "select * from t_article where article_id=?";
		try {
			PreparedStatement pre = con.prepareStatement(sql);
			pre.setString(1, articleID);
			ResultSet rs = pre.executeQuery();
			if (rs.next()) {
				Article article = new Article();
				article.setArticleID(rs.getInt("article_id"));
				article.setArticleName(rs.getString("article_name"));
				article.setArticleContent(rs.getString("article_content"));
				article.setArticleDate(rs.getDate("article_date"));
				article.setArticleWriter(rs.getString("article_writer"));
				article.setArticlePicUrl(rs.getString("article_pic"));
				article.setArticleText(rs.getString("article_text"));
				article.setCateName(rs.getString("cate_name"));
				ArticleContent.add(article);
			}
			sql = "select * from t_pic where article_id=?";
			PreparedStatement pre1 = con.prepareStatement(sql);
			pre1.setString(1, articleID);
			ResultSet rs1 = pre1.executeQuery();
			List<Picture> pics = new ArrayList<Picture>();
			while (rs.next()) {
				Picture pic = new Picture();
				pic.setPicID(rs1.getInt("pic_id"));
				pic.setPicUrl(rs1.getString("pic_url"));
				pics.add(pic);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ArticleContent;

	}
	//  获取文章所对应cate_ID的种类名称和图片
	public static ArticleCate getCategoryName(String cateID) {
		ArticleCate cateName=new ArticleCate();
		DBUtil db=new DBUtil();
		Connection con=db.getCon();
		String sql="select * from t_article,t_articlecate where t_article.cate_id=t_articlecate.cate_id";
		try {
			PreparedStatement pre=con.prepareStatement(sql);
			ResultSet rs = pre.executeQuery();
			while(rs.next()) {
				ArticleCate cate=new ArticleCate();
				cate.setCateName(rs.getString("cate_name"));
				cate.setCateID(rs.getInt("cate_id"));
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cateName;

	}

}