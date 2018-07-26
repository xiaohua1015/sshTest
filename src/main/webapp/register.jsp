<%--
  Created by IntelliJ IDEA.
  User: lsh134667
  Date: 2018/7/24
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>User Register Page</title>
</head>
<body>
    <s:form action="register">
        <s:textfield name="stu.stuName" label="用户名"></s:textfield>
        <s:password name="stu.password" label="密码"></s:password>
        <s:select list="#{1 : '男', 0 : '女'}" listKey="key" listValue="value"
                  name="stu.gender" label="性别" value="1"></s:select>
        <s:submit value="注册"></s:submit>
    </s:form>
</body>
</html>
