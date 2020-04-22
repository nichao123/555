<%--
  Created by IntelliJ IDEA.
  User: 44401
  Date: 2020/4/11
  Time: 17:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户</title>
    <link href="css/index.css" rel="stylesheet"/>
</head>
<body>
<div class="dv">
    <form method="post" action="add">
        <table border="1"  align="center">
            <caption><h2>添加用户信息</h2></caption>
            <tr>
                <td>用户名</td>
                <td>
                    <input type="text" name="loginName" value=""/>
                </td>
            </tr>
            <tr>
                <td>密码</td>
                <td>
                    <input type="password" name="loginPass" value=""/>
                </td>
            </tr>
            <tr>
                <td>电话</td>
                <td>
                    <input type="text" name="phone" value=""/>
                </td>
            </tr>
            <tr>
                <td>姓名</td>
                <td>
                    <input type="text" name="realname" value=""/>
                </td>
            </tr>
            <tr>
                <td>余额</td>
                <td>
                    <input type="text" name="amount" value=""/>
                </td>
            </tr>

            <tr>
                <td>权限</td>
                <td>
                    <select name="admin">
                        <option value="0">0</option>
                        <option value="1">1</option>
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
