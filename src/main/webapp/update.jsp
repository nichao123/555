<%--
  Created by IntelliJ IDEA.
  User: 44401
  Date: 2020/4/11
  Time: 17:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>修改用户</title>
    <link href="css/index.css" rel="stylesheet"/>
</head>
<body>
<div class="dv">
    <form method="post" action="/update">
        <table border="1"  align="center">
            <caption><h2>修改用户信息</h2></caption>
            <tr>
                <td>用户名</td>
                <td>
                    <input type="text" name="loginName" value="${user.loginName}"/>
                    <%--隐藏域 存放ID--%>
                    <input type="hidden" name="userId" value="${user.userId}"/>
                </td>
            </tr>
            <tr>
                <td>密码</td>
                <td>
                    <input type="password" name="loginPass" value="${user.loginPass}"/>
                </td>
            </tr>
            <tr>
                <td>电话</td>
                <td>
                    <input type="text" name="phone" value="${user.phone}"/>
                </td>
            </tr>
            <tr>
                <td>姓名</td>
                <td>
                    <input type="text" name="realname" value="${user.realname}"/>
                </td>
            </tr>
            <tr>
                <td>余额</td>
                <td>
                    <input type="text" name="amount" value="${user.amount}"/>
                </td>
            </tr>

            <tr>
                <td>权限</td>
                <td>
                    <!-- 必须进行判断数据选中 -->
                    <select name="admin">
                        <option value="0"  <c:if test="${user.admin==0}">selected</c:if> >0</option>
                        <option value="1"  <c:if test="${user.admin==1}">selected</c:if> >1</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="提交"/>
                    &nbsp;    &nbsp;  &nbsp;<a href="list">返回</a>
                </td>
            </tr>
        </table>

    </form>
</div>
</body>
</html>
