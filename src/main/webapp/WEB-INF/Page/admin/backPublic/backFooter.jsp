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

<!-- 退出系统模态框，点击登出时会弹出-->
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">确定要退出 TN云 吗?</h5>
                <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">×</span>
                </button>
            </div>
            <div class="modal-body">如果要退出当前系统，请点击下面的退出</div>
            <div class="modal-footer">
                <button class="btn btn-secondary" type="button" data-dismiss="modal">我再想想</button>
                <a class="btn btn-primary" href="login.html">立马退出</a>
            </div>
        </div>
    </div>
</div>



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