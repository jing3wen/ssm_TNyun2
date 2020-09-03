<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>TN云</title>
    <!-- Bootstrap core CSS-->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom fonts for this template-->
    <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <!-- Page level plugin CSS-->
    <link href="vendor/datatables/dataTables.bootstrap4.css" rel="stylesheet">
    <!-- Custom styles for this template-->
    <link href="css/后台css/sb-admin.css" rel="stylesheet">

    <!--icon图标库css-->
    <link rel="stylesheet" type="text/css" media="screen" href="https://cdn.staticfile.org/ionicons/2.0.1/css/ionicons.min.css">
</head>

<body class="fixed-nav sticky-footer bg-dark" id="page-top">

<!--*****上部和侧边导航栏，大家需要截取的地方****-->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top" id="mainNav">
    <a class="navbar-brand" href="back">TN云平台</a>
    <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav navbar-sidenav" id="exampleAccordion">
            <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Dashboard">
                <a class="nav-link" href="back">
                    <i class="fa fa-fw fa-dashboard"></i>
                    <span class="nav-link-text">所有功能</span>
                </a>
            </li>
            <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Charts">
                <a class="nav-link" href="charts">
                    <i class="fa fa-fw fa-area-chart"></i>
                    <span class="nav-link-text">用户使用统计</span>
                </a>
            </li>
            <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Tables">
                <a class="nav-link" href="tables">
                    <i class="fa fa-fw fa-table"></i>
                    <span class="nav-link-text">已购系统</span>
                </a>
            </li>
            <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Components">
                <a class="nav-link nav-link-collapse collapsed" data-toggle="collapse" href="#collapseComponents" data-parent="#exampleAccordion">
                    <i class="fa fa-fw fa-wrench"></i>
                    <span class="nav-link-text">用户管理</span>
                </a>
                <ul class="sidenav-second-level collapse" id="collapseComponents">
                    <li>
                        <a href="Customerlist">用户列表</a>
                    </li>
                    <li>
                        <a href="customerpurchase">用户购买</a>
                    </li>
                    <li>
                        <a href="customerpurchase">入驻申请</a>
                    </li>
                </ul>
            </li>
            <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Example Pages">
                <a class="nav-link nav-link-collapse collapsed" data-toggle="collapse" href="#collapseExamplePages" data-parent="#exampleAccordion">
                    <i class="fa fa-fw fa-file"></i>
                    <span class="nav-link-text">服务项目管理</span>
                </a>
                <ul class="sidenav-second-level collapse" id="collapseExamplePages">
                    <li>
                        <a href="${pageContext.request.contextPath}/Projectlist/subsystemlist">项目列表</a>
                    </li>
                    <li>
                        <a href="#">未分配</a>
                    </li>
                    <li>
                        <a href="#">未分配</a>
                    </li>
                    <li>
                        <a href="#">未分配</a>
                    </li>
                </ul>
            </li>
            <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Menu Levels">
                <a class="nav-link nav-link-collapse collapsed" data-toggle="collapse" href="#collapseMulti" data-parent="#exampleAccordion">
                    <i class="fa fa-fw fa-sitemap"></i>
                    <span class="nav-link-text">其他功能</span>
                </a>
                <ul class="sidenav-second-level collapse" id="collapseMulti">
                    <li>
                        <a href="#">Second Level Item</a>
                    </li>
                    <li>
                        <a href="#">Second Level Item</a>
                    </li>
                    <li>
                        <a href="#">Second Level Item</a>
                    </li>
                    <li>
                        <a class="nav-link-collapse collapsed" data-toggle="collapse" href="#collapseMulti2">Third Level</a>
                        <ul class="sidenav-third-level collapse" id="collapseMulti2">
                            <li>
                                <a href="#">Third Level Item</a>
                            </li>
                            <li>
                                <a href="#">Third Level Item</a>
                            </li>
                            <li>
                                <a href="#">Third Level Item</a>
                            </li>
                        </ul>
                    </li>
                </ul>
            </li>
            <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Link">
                <a class="nav-link" href="#">
                    <i class="fa fa-fw fa-link"></i>
                    <span class="nav-link-text">Link</span>
                </a>
            </li>
        </ul>
        <ul class="navbar-nav sidenav-toggler">
            <li class="nav-item">
                <a class="nav-link text-center" id="sidenavToggler">
                    <i class="fa fa-fw fa-angle-left"></i>
                </a>
            </li>
        </ul>
        <ul class="navbar-nav ml-auto">
            <li class="nav-item">
                <a class="nav-link">
                    <i class="fa fa-fw"></i>欢迎用户</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" data-toggle="modal" data-target="#exampleModal">
                    <i class="fa fa-fw fa-sign-out"></i>登出</a>
            </li>
        </ul>
    </div>
</nav>

<!-- 主体部分-->
<div class="content-wrapper">
    <div class="container-fluid">

        <!-- 主体部分导航标签-->
        <ol class="breadcrumb">
            <li class="breadcrumb-item">
                <a href="#">所有功能</a>
            </li>
            <li class="breadcrumb-item active">用户管理</li>
            <li class="breadcrumb-item active">用户列表</li>
        </ol>

        <!-- 用户列表-->
        <div class="card mb-3">
            <div class="card-header">
                <i class="fa fa-table"></i>用户列表</div>
            <div class="card-body">
                <div class="table-responsive">
                    <table id ="tab" class="table table-bordered">
                        <thead>
                        <tr>
                            <th>账号ID</th>
                            <th>姓名</th>
                            <th>电话</th>
                            <th>邮箱</th>
                            <th>状态</th>
                        </tr>
                        </thead>
                    </table>
                    <div class="pagination pagination-centered">
                       <button type="button" class="icon icon ion-gear-b btn btn-outline-dark" data-toggle="modal" id="list">list</button>
                       </div>
                </div>

            </div>
            <div class="card-footer small text-muted">更新时间</div>
        </div>
    </div>
    <!-- /.container-fluid-->

    <!--尾栏标签-->
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
    <script src="../../../vendor/jquery/jquery.min.js"></script>
    <script src="../../../vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
    <!-- Core plugin JavaScript-->
    <script src="../../../vendor/jquery-easing/jquery.easing.min.js"></script>
    <!-- Page level plugin JavaScript-->
    <script src="../../../vendor/chart.js/Chart.min.js"></script>
    <script src="../../vendor/datatables/jquery.dataTables.js"></script>
    <script src="../../vendor/datatables/dataTables.bootstrap4.js"></script>
    <!-- Custom scripts for all pages-->
    <script src="../../../js/后台js/sb-admin.min.js"></script>
    <!-- Custom scripts for this page-->
    <script src="../../../js/后台js/sb-admin-datatables.min.js"></script>
    <script src="../../../js/后台js/sb-admin-charts.min.js"></script>

</div>
</body>

    <script>
            $(function () {
                $.ajax({
                    type: "POST",
                    url: "/customer/customerlist",
                    contentType: "application/json; charset=utf-8",
                    dataType: "json",
                    async: "false",
                    success: function (result) {
                        console.log("服务器请求成功");
                        console.log("there are " + result.length + " customers");
                        if (result == "") alert("There are not customer !");
                        console.log(result);
                        var num = 5;
                        var tr=null;
                        if (result.length <= 5) num = result.length;
                        for (i = 0; i <= num; i++) {
                        tr = "<tr ><td>"+result[i].id+"</td><td>"+result[i].name+"</td><td>"
                        					+result[i].phone+"</td><td>"+result[i].email+"</td><td>"
                        					+result[i].status+"</td></tr>";
                        $("#tab").append(tr);
                        }
                    },
                    error: function () {
                        console.log("404 服务器请求失败");
                    }
                })
            });

    </script>

</html>
