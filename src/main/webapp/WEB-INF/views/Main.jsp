<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");
	String center = request.getParameter("center");
	session.setMaxInactiveInterval(60*60*24);

	if(center==null){
		center = "Center.jsp";
	}
%>
<table width="100%">
	<tr height="140" align="center">
		<td align="center"><jsp:include page="Top.jsp"/>
		</td>
	</tr>

	<tr height="140" align="center">
		<td align="center"><jsp:include page="<%=center %>"/>
		</td>
	</tr>

	<tr height="2">
	<td bgcolor="lightgreen"></td>
	</tr>
	<tr height="110" align="center">
		<td align="center"><jsp:include page="Bottom.jsp"/>
		</td>
	</tr>
</table>
</body>
</html>