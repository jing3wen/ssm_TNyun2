<%--
  Created by IntelliJ IDEA.
  User: shenjingwen
  Date: 2020/9/3
  Time: 20:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>TN云</title>
    <!-- Bootstrap core CSS-->
    <link href="${pageContext.request.contextPath}/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <!-- Custom fonts for this template-->
    <link href="${pageContext.request.contextPath}/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <!-- Page level plugin SS-->
    <link href="${pageContext.request.contextPath}/vendor/datatables/dataTables.bootstrap4.css" rel="stylesheet">
    <!-- Custom styles for this template-->
    <link href="${pageContext.request.contextPath}/css/后台css/sb-admin.css" rel="stylesheet">

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
                <a class="nav-link" href="${pageContext.request.contextPath}/back">
                    <i class="fa fa-fw fa-dashboard"></i>
                    <span class="nav-link-text">所有功能</span>
                </a>
            </li>
            <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Tables">
                <a class="nav-link" href="${pageContext.request.contextPath}/charts">
                    <i class="fa fa-fw fa-table"></i>
                    <span class="nav-link-text">用户使用统计</span>
                </a>
            </li>
            <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Components">
                <a class="nav-link nav-link-collapse collapsed" data-toggle="collapse" href="#collapseStatistics" data-parent="#exampleAccordion">
                    <i class="fa fa-fw fa-area-chart"></i>
                    <span class="nav-link-text">用户申请</span>
                </a>
                <ul class="sidenav-second-level collapse" id="collapseStatistics">
                    <li>
                        <a href="${pageContext.request.contextPath}/ServerOrder/ServerOrderlist">购买服务订单</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/SIApplylist/siapplylist">入驻申请</a>
                    </li>
                </ul>
            </li>
            <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Components">
                <a class="nav-link nav-link-collapse collapsed" data-toggle="collapse" href="#collapseComponents" data-parent="#exampleAccordion">
                    <i class="fa fa-fw fa-wrench"></i>
                    <span class="nav-link-text">用户管理</span>
                </a>
                <ul class="sidenav-second-level collapse" id="collapseComponents">
                    <li>
                        <a href="${pageContext.request.contextPath}/Customerlist/customerlist" >用户列表</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/SIAdminlist/siadminlist">开发商列表</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/adminlist/adminlist">管理员列表</a>
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
                <c:if test="${admin!=null}">
                    <a class="nav-link">
                        <i class="fa fa-fw"></i>欢迎运营商,${admin.a_name}
                    </a>
                </c:if>
                <c:if test="${SI_admin!=null}">
                    <a class="nav-link">
                        <i class="fa fa-fw"></i>欢迎开发商,${SI_admin.SI_name}
                    </a>
                </c:if>
            </li>
            <li class="nav-item">
                <a class="nav-link" data-toggle="modal" data-target="#exampleModal">
                    <i class="fa fa-fw fa-sign-out" ></i>登出
                </a>
            </li>
        </ul>
    </div>
</nav>



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
                <button class="btn btn-secondary" type="button" id="adminlogin_out">立马退出</button>
            </div>
        </div>
    </div>
</div>





