<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>

<!doctype html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport"
              content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Document</title>
        <script>
            function imgfileChange() {
                var upload_tip = document.getElementById("upload-tip");
                var img_show = document.getElementById("img-show");
                var imgfile = document.getElementById("imgfile");

                var freader = new FileReader();
                freader.readAsDataURL(imgfile.files[0]);
                freader.onload = function (e) {
                    img_show.src = e.target.result;
                    img_show.style.display = "inline";
                    upload_tip.style.display = "none";
                };
            }
        </script>
    </head>

    <%--<div id="upload-tip">+</div>
    <img src="" alt="" id="img-show" style="display: none">
    <input type="file" id="imgfile" name="file" style="display: none" onchange="imgfileChange()">--%>

    <body>
        <div align="center" >
            <div style="border: 3px #ccaadd solid;width: 300px;height: 250px;">
                <h1>文件上传</h1>
                <form action="${path}/free/upload" method="post" enctype="multipart/form-data">

                        <input type="file" name="upload"/><br/>
                        <input type="submit" value="上传"/>

                </form>
            </div>
        </div>
    </body>
</html>
