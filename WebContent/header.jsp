<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Header</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/uikit-2.25.0/css/uikitme.css"
	type="text/css">
<%-- <link rel="stylesheet"
	href="${pageContext.request.contextPath}/uikit-2.25.0/css/uikit.min.css"
	type="text/css"> --%>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/uikit-2.25.0/css/bootstrap.min.css"
	type="text/css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/uikit-2.25.0/css/components/accordion.min.css"
	type="text/css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/uikit-2.25.0/css/mir.css" type="text/css">
<script src="https://code.jquery.com/jquery.js"></script>
<script
	src="${pageContext.request.contextPath}/uikit-2.25.0/js/components/accordion.min.js"></script>
<script
	src="${pageContext.request.contextPath}/uikit-2.25.0/js/uikit.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
</head>
<body>
	    <div class="uk-container uk-clearfix">
        <div class="uk-grid">
            <div class="uk-width-1-10">
            </div>
            <div class="uk-width-8-10">
                <nav class="uk-nav uk-navbar-nav">
                    <ul class="uk-navbar-nav uk-visible@m">
                        <!-- <li><a class="uk-logo" href="https://innovacreation.studio/">
                                <img src="./images/mirage.jpeg" width="50px">
                            </a></li> -->
                        <li><a href="${pageContext.request.contextPath}/index.action">首页</a></li>
                        <li><a href="#">作品</a></li>
                        <li><a href="#">动态</a></li>
                        <li><a href="#">关于</a></li>
                    </ul>
                    <div class="uk-navbar-content uk-hidden-small">
                        <form class="uk-form uk-margin-remove uk-display-inline-block">
                            <input class="uk-form-width-small" type="text" placeholder="Search">
                            <button class="uk-button uk-button-primary">Submit</button>
                        </form>
                    </div>
                </nav>
                <!-- <div class="uk-navbar-flip">
                    <ul class="uk-nav uk-navbar-nav">
                        <li><a href="#">登录</a></li>
                        <li><a href="#">注册</a></li>
                    </ul>
                </div> -->
            </div>
            <div class="uk-width-1-10">
            </div>
        </div>
    </div>