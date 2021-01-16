<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>

<!doctype html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport"
              content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>下载</title>
    </head>

    <body>
        <div align="center" >
            <div style="border: 3px #ccaadd solid;width: 300px;height: 250px;">
                <h1>文件下载</h1>
                <form action="${path}/free/download" method="post" enctype="multipart/form-data">
                    <input type="radio" name="download" value="index.jsp">下载1
                    <input type="radio" name="download" value="index.jsp">下载2
                    <input type="submit" value="下载"/>
                </form>
            </div>
        </div>
    </body>
</html>
