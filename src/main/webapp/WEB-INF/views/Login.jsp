<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<%
	String joinroot = (String)session.getAttribute("joinroot");
%>
	<center>
		<form action="LoginProc.jsp" method="post">
			<table width="300">
				<tr height="100" bgcolor="lightgreen">
					<td align="center" colspan="3"><font size="6" color="gray">로그인</font></td>
				</tr>
				<tr height="40">
					<td width="120" align="center">아이디</td>
					<td width="180"><input type="text" name="id">
				</tr>
				<tr height="40">
					<td width="120" align="center">패스워드</td>
					<td width="180"><input type="password" name="pass">
				</tr>
				<tr height="40" align="center">
					<td colspan="2"><input type="submit" value="로그인">&nbsp;&nbsp;
		</form>
						<button type="button" onclick="location.href='<%=joinroot%>MemberJoin.jsp'">회원가입</button></td>
				</tr>
			</table>
	</center>
</body>
</html>