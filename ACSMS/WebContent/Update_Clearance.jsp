<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<html>
    <head>
        <title>JINSERT Operation</title>
        <script>
            function checkBox(chk) {
                if ( chk=="on" ) {
                    return "1";
                }
                else{
                	return "0";
                }
            }
        </script>
    </head>
    <body>
    	        
        <sql:setDataSource var="dbsource" driver="com.mysql.jdbc.Driver"
        				url="jdbc:mysql://localhost/acsms" 
        				user="root" password="admin"/>
        				
        <sql:update dataSource="${dbsource}" var="result" >
        	UPDATE custom_clearance SET bill_of_lading = ?,
        								commercial_invoice = ?,
        								certificate_of_origin = ?,
        								canada_customs_invoice = ?
        	WHERE orderid = ?;
        	<c:choose>
        		<c:when test="${param._bill_of_lading=='on'}">
        			<sql:param value="1"/>
        		</c:when>
        		<c:otherwise>
        			<sql:param value="0"/>
        		</c:otherwise>
        	</c:choose>
        	<c:choose>
        		<c:when test="${param._commercial_invoice=='on'}">
        			<sql:param value="1"/>
        		</c:when>
        		<c:otherwise>
        			<sql:param value="0"/>
        		</c:otherwise>
        	</c:choose>
        	<c:choose>
        		<c:when test="${param._certificate_of_origin=='on'}">
        			<sql:param value="1"/>
        		</c:when>
        		<c:otherwise>
        			<sql:param value="0"/>
        		</c:otherwise>
        	</c:choose>
        	<c:choose>
        		<c:when test="${param._canada_customs_invoice=='on'}">
        			<sql:param value="1"/>
        		</c:when>
        		<c:otherwise>
        			<sql:param value="0"/>
        		</c:otherwise>
        	</c:choose>
        	<sql:param value="${param.orderid}"/>        	       
        </sql:update>
        <c:if test="${result>=1}">
            <font size="5" color='green'> Congratulations ! Data inserted
            successfully.</font>
 
            <c:redirect url="OrderSearch_Clearance.jsp" >
                <c:param name="susMsg" value="Congratulations ! Data inserted
            successfully." />
            </c:redirect>
        </c:if> 
    </body>
</html>