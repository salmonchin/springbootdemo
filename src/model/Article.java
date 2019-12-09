package model;

import java.util.Date;

public class Article {
	private int articleID;
	private int cateID;
	private String articleName;
	private String articleContent;
	private String articleWriter;
	private Date articleDate;
	private String articlePicUrl;
	private String articleText;
	private String cateName;
	public Article(String cateName) {
		super();
		this.cateName = cateName;
	}

	public String getCateName() {
		return cateName;
	}

	public void setCateName(String cateName) {
		this.cateName = cateName;
	}

	public Article(int articleID, int cateID, String articleName, String articleContent, String articleWriter,
			Date articleDate, String articlePicUrl, String articleText) {
		super();
		this.articleID = articleID;
		this.cateID = cateID;
		this.articleName = articleName;
		this.articleContent = articleContent;
		this.articleWriter = articleWriter;
		this.articleDate = articleDate;
		this.articlePicUrl = articlePicUrl;
		this.articleText = articleText;
	}

	@Override
	public String toString() {
		return "Article [cateName=" + cateName + "]";
	}

	public int getArticleID() {
		return articleID;
	}

	public void setArticleID(int articleID) {
		this.articleID = articleID;
	}

	public int getCateID() {
		return cateID;
	}

	public void setCateID(int cateID) {
		this.cateID = cateID;
	}

	public String getArticleName() {
		return articleName;
	}

	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}

	public String getArticleContent() {
		return articleContent;
	}

	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
	}

	public String getArticleWriter() {
		return articleWriter;
	}

	public void setArticleWriter(String articleWriter) {
		this.articleWriter = articleWriter;
	}

	public Date getArticleDate() {
		return articleDate;
	}

	public void setArticleDate(Date articleDate) {
		this.articleDate = articleDate;
	}

	public String getArticlePicUrl() {
		return articlePicUrl;
	}

	public void setArticlePicUrl(String articlePicUrl) {
		this.articlePicUrl = articlePicUrl;
	}

	public String getArticleText() {
		return articleText;
	}

	public void setArticleText(String articleText) {
		this.articleText = articleText;
	}

	public Article() {
		// TODO Auto-generated constructor stub
	}
	
}
