<%@page import="java.time.LocalDateTime"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.time.LocalDate"%>

<html>
   <head>
      <title>JSTL fmt:dateNumber Tag</title>
   </head>

   <body>
      <h3>Number Format:</h3>
      <c:set var = "now" value = "<%= LocalDateTime.now() %>" />
      <c:out value="${now}"></c:out>
      <br/><br/>
      
      <fmt:parseDate value="${now}" pattern="yyyy-MM-dd'T'HH:mm:ss" var="parsedDateTime" type="both" />
      <fmt:formatDate pattern="EEEE dd-MM-yyyy hh:mm:ss a" value="${ parsedDateTime }" />
      
      <br/><br/>
      <fmt:parseDate value="${now}" type="BOTH" dateStyle="FULL" timeStyle="FULL" pattern="yyyy-MM-dd"/>
      
      <fmt:formatDate value="${parsedDate}" var="newParsedDate" type="date" pattern="dd.MM.yyyy" />
      <c:out value="${newParsedDate}"></c:out>    
   </body>   
</html>