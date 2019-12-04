<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fm"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%
	String path=request.getContextPath();
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" type="text/css" href="<%=path%>/css/index_work.css"/> 
  <script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
  <script type="text/javascript">
  	function guanbi() {
  		location.href="list";
  	}
  </script>
</head>
<body>
	<center>
		<h1 style="font-size: 28px; color: blue;">详情页面</h1>
		<hr>
		名称:${good.gname }<br>
		品牌:${good.bra.bname }<br>
		分类:${good.kin.kname }<br>
		价格:${good.price }<br>
		发布:${good.datea }<br>
		<input type="button" onclick="guanbi()" value="关闭">
	</center>
</body>
</html>