<%--
  Created by IntelliJ IDEA.
  User: 44401
  Date: 2020/4/15
  Time: 11:16
  To change this template use File | Settings | File Templates.
<%--
  Created by IntelliJ IDEA.
  User: 44401
  Date: 2020/4/11
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
    <link href="css/find.css" rel="stylesheet"/>
    <script type="text/javascript">
        function funDel(id){
            //判断
            if(window.confirm("您确定要删除吗？")){
                //跳转处理数据
                 window.location="del?userId="+id;
            }
        }
    </script>
</head>
<body>
<div class="dv">
    <a href="save.jsp">添加</a><p/>
    <p class="page">
    <form action ="list" method="post" >
        用户名：<input type="text"  name="loginName" value="${userinfo.loginName}"/>
        电话：<input type="text"  name="phone" value="${userinfo.phone}"/>
        权限:<select name="admin" onchange="funAdmin(${userinfo.admin})" id="admin">
            <%--下拉列表选中的数据不能没有--%>
               <option value="0" >0</option>
               <option value="1" >1</option>
            </select>
        <input type="submit" value="查询">
    </form>
    </p>
    <table border="1">
        <caption><h2>用户基本信息</h2></caption>
        <tr>
            <td>编号</td>
            <td>用户名</td>
            <td>密码</td>
            <td>电话</td>
            <td>姓名</td>
            <td>余额</td>
            <td>权限</td>
            <td>操作</td>
        </tr>

        <c:if test="${pageInfo.list.size()==0}">
        <tr><td colspan="8"> 没有您要查找的数据</td></tr>
        </c:if>

        <c:if test="${pageInfo.list.size()!=0}">
        <c:forEach var="user" items="${pageInfo.list}">
            <tr>
                <td>${user.userId}</td>
                <td>${user.loginName}</td>
                <td>${user.loginPass}</td>
                <td>${user.phone}</td>
                <td>${user.realname}</td>
                <td>${user.amount}</td>
                <td>${user.admin}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/find?userId=${user.userId}">详情</a>
                    <a href="${pageContext.request.contextPath}/edit?userId=${user.userId}">修改</a>
                    <a href="javascript:funDel(${user.userId})">删除</a></td>
            </tr>
        </c:forEach>

    </table>
        <p class="page">
            第${pageInfo.pageNum}/ ${pageInfo.pages}页 &nbsp; 共${pageInfo.total} 条  &nbsp;
            <a href="list?pageCurrent=1&loginName=${userinfo.loginName}&phone=${userinfo.phone}&admin=${userinfo.admin}">首页</a> &nbsp;

            <c:if test="${!pageInfo.isFirstPage}">
              <a href="list?pageCurrent=${pageInfo.prePage}&loginName=${userinfo.loginName}&phone=${userinfo.phone}&admin=${userinfo.admin}">上一页</a>&nbsp;
            </c:if>

            <a href="list?pageCurrent=${pageInfo.nextPage}&loginName=${userinfo.loginName}&phone=${userinfo.phone}&admin=${userinfo.admin}">下一页</a>&nbsp;
            <a href="list?pageCurrent=${pageInfo.pages}&loginName=${userinfo.loginName}&phone=${userinfo.phone}&admin=${userinfo.admin}">尾页</a>&nbsp;

            <c:forEach var="i" begin="1" end="${pageInfo.pages}">
            <a href="list?pageCurrent=${i}">${i}</a>&nbsp;
            </c:forEach>
        <p>
    </c:if>

</div>
</body>
</html>


<script type="text/javascript">
    function funAdmin(vl){
    //   document.getElementById("admin").value(vl);
    }
</script>