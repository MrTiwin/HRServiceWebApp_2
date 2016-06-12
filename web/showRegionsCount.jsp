<%--
  Created by IntelliJ IDEA.
  User: GrupoUTP
  Date: 11/06/2016
  Time: 20:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="service" class="pe.edu.utp.hrserviceapp.models.ServiceBean" scope="session"/>
<html>
<head>
    <title>Show Regions Count</title>
</head>
<body>
    <p>Regions Count: <jsp:getProperty name="service" property="regionsCount"/></p>
</body>
</html>
