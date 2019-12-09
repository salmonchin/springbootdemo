package model;

public class ArticleCate {
		private int cateID;
		private String cateName;
		private String catePic;
		private int parentID;
		private String cateDesc;
		public int getCateID() {
			return cateID;
		}
		public void setCateID(int cateID) {
			this.cateID = cateID;
		}
		public String getCateName() {
			return cateName;
		}
		public void setCateName(String cateName) {
			this.cateName = cateName;
		}
		public String getCatePic() {
			return catePic;
		}
		public void setCatePic(String catePic) {
			this.catePic = catePic;
		}
		public int getParentID() {
			return parentID;
		}
		public void setParentID(int parentID) {
			this.parentID = parentID;
		}
		public String getCateDesc() {
			return cateDesc;
		}
		public void setCateDesc(String cateDesc) {
			this.cateDesc = cateDesc;
		}
		@Override
		public String toString() {
			return "ArticleCate [cateID=" + cateID + ", cateName=" + cateName + ", catePic=" + catePic + ", parentID="
					+ parentID + ", cateDesc=" + cateDesc + "]";
		}
		public ArticleCate(int cateID, String cateName, String catePic, int parentID, String cateDesc) {
			super();
			this.cateID = cateID;
			this.cateName = cateName;
			this.catePic = catePic;
			this.parentID = parentID;
			this.cateDesc = cateDesc;
		}
		public ArticleCate() {
			// TODO Auto-generated constructor stub
		}
		
}
