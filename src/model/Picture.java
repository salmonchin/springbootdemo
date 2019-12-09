package model;

public class Picture {
		private int picID;
		private int articleID;
		private String picUrl;
		public int getPicID() {
			return picID;
		}
		public void setPicID(int picID) {
			this.picID = picID;
		}
		public int getArticleID() {
			return articleID;
		}
		public void setArticleID(int articleID) {
			this.articleID = articleID;
		}
		public String getPicUrl() {
			return picUrl;
		}
		public void setPicUrl(String picUrl) {
			this.picUrl = picUrl;
		}
		@Override
		public String toString() {
			return "Picture [picID=" + picID + ", articleID=" + articleID + ", picUrl=" + picUrl + "]";
		}
		public Picture(int picID, int articleID, String picUrl) {
			super();
			this.picID = picID;
			this.articleID = articleID;
			this.picUrl = picUrl;
		}
		public Picture() {
			// TODO Auto-generated constructor stub
		}
}
