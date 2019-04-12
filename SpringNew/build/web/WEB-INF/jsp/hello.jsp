<%-- 
    Document   : hello
    Created on : 12 Apr, 2019, 4:23:33 AM
    Author     : ahish
--%>
<%@include file="/WEB-INF/jsp/include.jsp" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
  <head><title>Title</title></head>

  <body>

    <h1>Heading</h1>

    <p>Greetings, it is now<c:out value="${model.now}"/></p>

    <h3>Products</h3>

    <c:forEach items="${model.products}" var="prod">

      <c:out value="${prod.description}"/> <i>$<c:out value="${prod.price}"/></i><br><br>

    </c:forEach>
    <br>

    <a href="<c:url value="priceincreaseform.htm"/>">Increase Prices</a>

    <br>
  </body>
</html>
