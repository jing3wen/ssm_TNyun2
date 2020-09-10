<%--
  Created by IntelliJ IDEA.
  User: shenjingwen
  Date: 2020/9/3
  Time: 20:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<footer class="sticky-footer">
    <div class="container">
        <div class="text-center">
            <small>感谢TN云团队的辛苦劳动.sjw,xz,kyq,wtj,ccx</small>
        </div>
    </div>
</footer>

<!-- 回到顶部-->
<a class="scroll-to-top rounded" href="#page-top">
    <i class="fa fa-angle-up"></i>
</a>





<!-- Bootstrap core JavaScript-->
<script src="https://cdn.jsdelivr.net/npm/jquery@3.4.1/dist/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- Core plugin JavaScript-->
<script type="text/javascript" src="${pageContext.request.contextPath}/vendor/jquery-easing/jquery.easing.min.js"></script>
<!-- Page level plugin JavaScript-->
<script type="text/javascript" src="${pageContext.request.contextPath}/vendor/chart.js/Chart.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/vendor/datatables/jquery.dataTables.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/vendor/datatables/dataTables.bootstrap4.js"></script>
<!-- Custom scripts for all pages-->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/后台js/sb-admin.min.js"></script>
<!-- Custom scripts for this page-->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/后台js/sb-admin-datatables.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/后台js/sb-admin-charts.min.js"></script>

<script>

    $(function () {
        var admin="${admin}";
        var si_admin="${SI_admin}";
        if(admin==""&&si_admin=="") {
            console.log("当前登录用户为空")
            window.location.href="${pageContext.request.contextPath}/login";
        }
        else return true;
    })


    $("#adminlogin_out").click(function () {
        $.ajax({
            type: "GET",
            url: "/login/adminloginout",
            contentType: "application/json; charset=utf-8",
            dataType:"text",
            async: "false",
            success: function (result) {
                console.log("服务器请求成功"+result);
                window.location.href="${pageContext.request.contextPath}/login"
            },
            error: function () {
                console.log("404 服务器请求失败");
            }
        })
    })
</script>