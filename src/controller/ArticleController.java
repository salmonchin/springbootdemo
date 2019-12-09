package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Article;
import model.ArticleCate;
import service.ArticleService;
import service.HomeService;

/**
 * Servlet implementation class ArticleController
 */
@WebServlet("/content/getArticleByID.action")
public class ArticleController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ArticleController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String path = request.getServletPath();
		if(path.equals("/content/getArticleByID.action")) {
			response.setContentType("text/json;charset=utf-8");
			String articleID=request.getParameter("articleID");
			String cateID=request.getParameter("cateID");
			ArticleCate cateName=new ArticleCate();
			List<Article> articletext=ArticleService.getArticleByID(articleID);
			cateName=ArticleService.getCategoryName(articleID);
 			request.setAttribute("Aritext",articletext);
 			request.setAttribute("AriCate",cateName);// 文章内面包屑导航内种类分类条
			request.getRequestDispatcher("/content/ArticleContent.jsp").forward(request, response);
		}
			
			
			
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
