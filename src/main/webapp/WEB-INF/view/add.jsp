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
  	
  	function a() {
  		alert("添加成功~!");
  	}
  	
  	$(function() {
  		$.ajax({
  			url:'kindList',
  			type:'get',
  			dataType:'json',
  			success:function(arr) {
  				for ( var i in arr) {
					$('.a').append("<option value='"+arr[i].kid+"'>"+arr[i].kname+"</option>");
				}
  			}
  		})
  	})
  </script>
</head>
<body>
	<form:form action="doAdd" method="post" modelAttribute="goods">
		<center>
			<h1 style="font-size: 28px; color: blue;">新增页面</h1>
			<hr>
			名称:<form:input path="gname"/><br><br>
			品牌:<form:select path="bra.bid">
				<form:option value="0">-- 请选择 --</form:option>
				<form:options items="${brands }" itemValue="bid" itemLabel="bname"/>
			</form:select><br><br>
			分类:<select name="kin.kid" id="a">
				<option value="0">-- 请选择 --</option>
				<c:forEach items="${kinds}" var="k">
					<option value="${k.kid }">${k.kname }</option>
				</c:forEach>
			</select><br><br>
			价格:<form:input path="price"/><br><br>
			<input type="submit" value="保存" onclick="a()">
			<input type="button" onclick="guanbi()" value="关闭">
		</center>
	</form:form>
</body>
</html>