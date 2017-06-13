<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>main jsp</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/test/login" method="post">
    <div>
    <input type="text" name="bookId" placeholder="请输入要借书的编号">

    </div>
    <div>
        <input type="submit" value="点我提交" >
    </div>
</form>
</body>
</html>
