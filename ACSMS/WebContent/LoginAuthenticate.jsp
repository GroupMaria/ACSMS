<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Authentication page</title>
	</head>
	<body>
		<c:if test="${ empty param.username or empty param.password}">
      		<c:redirect url="Login.jsp" >
            	<c:param name="errMsg" value="Please Enter UserName and Password" />
      		</c:redirect>       
    	</c:if>
    	<c:if test="${not empty param.username and not empty param.password}">
    		<s:setDataSource var="ds" driver="com.mysql.jdbc.Driver"
    						url="jdbc:mysql://localhost/acsms"
    						user="root" password="admin"/>
    		<s:query dataSource="${ds}" var="selectQ">
    			SELECT userid as userid,sum(role) AS userrole, COUNT(*) AS kount FROM user 
    			WHERE username= ? AND password= ?
    			<sql:param value="${param.username}"/>
    			<sql:param value="${param.password}"/>
    		</s:query>
    		<c:forEach items="${selectQ.rows}" var="r">
    			<c:choose>
    				<c:when test="${r.kount gt 0}">
    					<c:set scope="session" 
    							var="loginUser"
    							value="${r.userid}"/>
    				   	<c:set scope="session" 
    							var="UserRole"
    							value="${r.userrole}"/>
    							
    					<c:redirect url="index.jsp"/>
    				</c:when>
    				<c:otherwise>
    					<c:redirect url="Login.jsp">
    						<c:param name="errMsg" value="Username and password don't match."/>
    					</c:redirect>
    				</c:otherwise>
    			</c:choose>
    		</c:forEach>
    	</c:if>
	</body>
</html>