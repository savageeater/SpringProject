<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
<title></title>


</head>
<body>
	<%
		String id = (String) session.getAttribute("id");
		String root = (String)session.getAttribute("root");
		String joinroot=(String)session.getAttribute("joinroot");
		if (id == null) {
			id = "GUEST";
		}
	%>
	<table width="100%">
		<tr height="70">
			<td colspan="4"><a href="Main"
				style="text-decoration: none"> <img alt="로고출력자리"
					src="img/LOGO.jpg" height="65">
			</a></td>
			<td align="center" width="200"><%=id%>님
			<%
				if(id.equals("GUEST")){
					%>
			<button onclick="location.href='Main?center=Login.jsp'">로그인</button>
					<%
				}else{
					%>
				<button onclick="location.href='Logout.jsp'">로그아웃</button>	
					<%
				}
			%>
			
			</td>
		</tr>
		</table>
		
			<div class="col-md-3" align="center" style="height:50px; background-color: #99CCFF;"><a
				href="Main.jsp?center=CarReserveMain.jsp"
				style="text-decoration: none"><font color="white" size="5">지역별 펜션</font></a>
			</div>
			<div class="col-md-3" align="center"  style="height:50px; background-color: #99CCFF"><a href="Main.jsp?center=ReserveView.jsp"
				style="text-decoration: none"><font color="white" size="5">빈 방 검색</font></a>

			</div>
			<div class="col-md-3"  align="center"  style="height:50px; background-color: #99CCFF"><a href="<%=root%>BoardList.jsp"
				style="text-decoration: none"><font color="white" size="5">옵션별 검색</font></a>
			</div>
			<div class="col-md-3"  align="center"   style="height:50px; background-color: #99CCFF"><a href="Main.jsp?center=BatchForm.jsp"
				style="text-decoration: none"><font color="white" size="5">예약 확인 및 취소</font></a>
			</div>

</body>
</html>