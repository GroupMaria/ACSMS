<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<c:if test="${empty sessionScope['loginUser']}">
    <c:redirect url="Login.jsp" />
</c:if>