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
  	function qx() {
  		$(".ck").attr('checked', true);
  	}
  	
  	function doAdd() {
  		location.href="toAdd";
  	}
  	
  	function xiangqing(gid) {
  		location.href="xiangqing?gid="+gid;
  	}
  	
  	function bianji(gid) {
  		location.href="toUpdate?gid="+gid;
  	}
  	
  	function doDeleteByIds() {
  		var ids = '';
  		
  		$("[name=ids]:checked").each(function() {
  			ids += "," + $(this).val();
  		})
  		
  		ids = ids.substring(1);
  		
  		if(ids == null || ids == '') {
  			alert("删除失败~!");
  		} else {
  			alert("你确定要删除:"+ids+"吗~?");
  			$.ajax({
  	  			url:'deletes',
  	  			type:'get',
  	  			data:{ids:ids},
  	  			dataType:'json',
  	  			success:function(flag) {
  	  				if(flag) {
  	  					alert("删除成功~!");
  	  	  				location.reload();
  	  				} else {
  	  					alert("删除失败~!");
  	  				}
  	  			}
  	  		})
  		}
  	}
  </script>
</head>
<body>
	<table>
		<thead>
			<tr>
				<td colspan="100">员工信息展示页面</td>
			</tr>
			<tr>
				<td colspan="2">
					<form action="list" method="post">
						商品名称:<input type="text" name="likeName" value="${param.likeName }">
						<input type="submit" value="查询">
					</form>
				</td>
				<td colspan="5"></td>
				<td><input type="button" onclick="doAdd()" value="新增"></td>
				<td><input type="button" onclick="doDeleteByIds()" value="批量删除"></td>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td><input type="button" onclick="qx()" value="全选"></td>
				<td>编号</td>
				<td>名称</td>
				<td>品牌</td>
				<td>分类</td>
				<td>价格</td>
				<td>发布时间</td>
				<td>操作</td>
				<td>操作</td>
			</tr>
			<c:forEach items="${info.list}" var="l" varStatus="count">
				<tr>
					<td><input type="checkbox" name="ids" class="ck" value="${l.gid}"></td>
					<td>${count.count }</td>
					<td>${l.gname }</td>
					<td>${l.bra.bname }</td>
					<td>${l.kin.kname }</td>
					<td>${l.price }</td>
					<td>${l.datea }</td>
					<td><input type="button" onclick="xiangqing(${l.gid})" value="详情"></td>
					<td><input type="button" onclick="bianji(${l.gid})" value="编辑"></td>
				</tr>
			</c:forEach>
		</tbody>
		<tfoot>
			<tr>
				<td colspan="100">
					<a href="list?pageNum=1">首页</a>
					<a href="list?pageNum=${info.prePage }">上一页</a>
					<a href="list?pageNum=${info.nextPage }">下一页</a>
					<a href="list?pageNum=${info.pages }">尾页</a>
				</td>
			</tr>
		</tfoot>
	</table>
</body>
</html>