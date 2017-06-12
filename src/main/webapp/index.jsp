<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="proPath" value="${pageContext.request.contextPath}" />
<html>
<head>
    <title>main jsp</title>
    <script type="text/javascript">
       function onCC() {
           alert("${pageContext.request.contextPath}")
       }
    </script>
</head>
<body>
<form action="/test/ford" method="post">
    <div>
    <input type="text" name="bookId" placeholder="请输入要借书的编号">

    </div>
    <div>
        <input type="submit" value="点我提交" onclick="onCC()">
    </div>
</form>
</body>
</html>
