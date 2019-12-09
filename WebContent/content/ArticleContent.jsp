<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="../header.jsp"%>
<div class="uk-sticky-placeholder" hidden="" style="height: 80px; margin: 0px;"></div>
<div class="container"></div>
    <main>
        <div>
            <div class="uk-container">
                <div class="uk-grid uk-clearfix">
                    <div class="uk-width-1-10"></div>
                    <div class="uk-width-8-10">
                        <div class="uk-section-large uk-flex">
                        <c:forEach items="${Aritext }" var="AriT">
                            <article class="uk-article">
                                <h1 class="uk-article-title">
                                    ${AriT.articleName }
                                </h1>
                                <ul class="breadcrumb" style="background-color: #fff">
                                    <li><a href="#">首页</a></li>
                                    <li><a href="#">${AriT.articleID}</a></li>
                                    
                                    <li><a href="#">${AriT.cateName}</a></li>   
                                    
                                     <li><a href="#">${AriT.articleName }</a></li>
                                </ul>
                                <p class="uk-h5 uk-article-meta">
                                    由 <strong>${AriT.articleWriter }</strong> 发表于 <strong>${AriT.articleDate }</strong>
                                </p>
                                <hr class="uk-article-divider">
                                <div class="uk-block">
                                <p class="uk-text-left uk-text-break uk-column-1-3 uk-h4 clearfix"> 
                                    ${AriT.articleText }
                                    <div class="uk-clearfix">
                                    <img src="${pageContext.request.contextPath}${AriT.articlePicUrl}"alt="" class="uk-align-medium-right">
                                	</div>
                                </p>
                            </div>
                            </article>
                            </c:forEach>
                        </div>
                    </div>
                    <div class="uk-width-1-10"></div>
                </div>
            </div>
        </div>
    </main>
    <%@include file="../footer.jsp"%>