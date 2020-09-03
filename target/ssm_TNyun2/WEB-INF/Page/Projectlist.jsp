<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <link href="../../vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom fonts for this template-->
    <link href="../../vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <!-- Page level plugin SS-->
    <link href="../../vendor/datatables/dataTables.bootstrap4.css" rel="stylesheet">
    <!-- Custom styles for this template-->
    <link href="../../css/后台css/sb-admin.css" rel="stylesheet">

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
                        <a href="../Customerlist">用户列表</a>
                    </li>
                    <li>
                    <a href="Customerlist">用户购买</a>
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
            <li class="breadcrumb-item active">服务项目管理</li>
            <li class="breadcrumb-item active">项目列表</li>
        </ol>

        <!-- 全部系统服务表格-->
        <div class="card mb-3">
            <div class="card-header">
                <i class="fa fa-table"></i> 系统服务列表
                <button type="button"
                        style="float:right"
                        class="icon icon ion-plus-round btn btn-outline-dark"
                        data-toggle="modal"
                        data-target="#myModal"
                        id="insert_subsystem1">添加
                </button>
                <div class="modal fade" id="myModal">
                    <div class="modal-dialog">
                        <div class="modal-content">

                            <!-- 模态框头部 -->
                            <div class="modal-header">
                                <h4 class="modal-title">请输入服务信息</h4>
                                <button type="button" class="close" data-dismiss="modal">&times;</button>
                            </div>

                            <!-- 模态框主体 -->
                            <div class="modal-body">

                                <div class="input-group mb-3 input-group-sm">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text">服务名称</span>
                                    </div>
                                    <input type="text" class="form-control" placeholder="服务名称" id="s_name" name="s_name">
                                </div>
                                <div class="input-group mb-3 input-group-sm">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text">服务商ID</span>
                                    </div>
                                    <input type="text" class="form-control" placeholder="服务商ID" id="si_id" name="si_id">
                                </div>
                                <div class="input-group mb-3 input-group-sm">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text">介  绍</span>
                                    </div>
                                    <input type="text" class="form-control" placeholder="介绍" id="s_introduction" name="s_introduction">
                                </div>
                                <div class="input-group mb-3 input-group-sm">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text">价     格</span>
                                    </div>
                                    <input type="text" class="form-control" placeholder="价格" id="s_price" name="s_price">
                                </div>
                                <div class="input-group mb-3 input-group-sm">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text">前端站点</span>
                                    </div>
                                    <input type="text" class="form-control" placeholder="前端站点" id="s_website1" name="s_website1">
                                </div>
                                <div class="input-group mb-3 input-group-sm">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text">后端站点</span>
                                    </div>
                                    <input type="text" class="form-control" placeholder="后端站点" id="s_website2" name="s_website2">
                                </div>
                                <div class="input-group mb-3 input-group-sm">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text">服务状态</span>
                                    </div>
                                    <input type="text" class="form-control" placeholder="1" id="s_status" name="s_status">
                                </div>


                            </div>

                            <!-- 模态框底部 -->
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
                                <button type="button" class="btn btn-primary" id="submit_insert_subsystem">提交</button>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
            <div class="card-body">
                <div class="table-responsive">
                    <table class="table table-bordered">
                        <thead>
                        <tr>
                            <th>服务ID</th>
                            <th>服务名称</th>
                            <th>服务商ID</th>
                            <th>介绍</th>
                            <th>价格</th>
                            <th>前端站点</th>
                            <th>后端站点</th>
                            <th>服务状态</th>
                            <th>操作</th>
                        </tr>
                        </thead>
                        <tbody>
                        <!--
                        <tr>
                            <td>03</td>
                            <td>超市子系统</td>
                            <td>云超市，是一种社区电子商务的交易形式，即网上预定和下单、线下快速到货的一种超市形式</td>
                            <td>
                            销售云解决方案可以为客户提供情境化且个性化的全渠道购物体验。给用户带来真实的体验
                            32</td>
                            <td><button type="button" class="icon icon ion-gear-b btn btn-outline-dark">编辑</button>
                                <button type="button" class="icon ion-trash-a btn btn-outline-dark">删除</button>
                            </td>
                        </tr>
                        -->
                        <c:forEach items="${subsystemlist}" var="subsystem">
                            <tr class="text-c">
                                <td>${subsystem.s_id}</td>
                                <td>${subsystem.s_name}</td>
                                <td>${subsystem.si_id}</td>
                                <td>${subsystem.s_introduction}</td>
                                <td>${subsystem.s_price}</td>
                                <td>${subsystem.s_website1}</td>
                                <td>${subsystem.s_website2}</td>
                                <td>
                                    <c:if test="${subsystem.s_status==1}">可用</c:if>
                                    <c:if test="${subsystem.s_status==0}">不可用</c:if>
                                </td>
                                <td>
                                    <!--<a title="编辑" href="javascript:;"
                                       onclick="bianjifuwu(this,${subsystem.s_id},${subsystem.s_website1})">
                                       class="ml-5" style="text-decoration:underline ">
                                        <span style="font-min-size:6px " class="label label-primary radius">编辑</span>
                                    </a>-->
                                    <button type="button"
                                            class="btn btn-primary radius"
                                            data-toggle="modal"
                                            data-target="#modifyModal"
                                            onclick="showDialog(this)"
                                            id="modifysubsystem">编辑
                                    </button>

                                    <a deleteLink="true" href="/Projectlist/del_subsystem?s_id=${subsystem.s_id}"
                                       class="my-lg-5" style="text-decoration:underline">
                                        <button type="button" class="btn btn-danger radius" id="">删除</button>
                                        <!--span style="font-min-size:6px " class="label label-danger radius">删除</span-->
                                    </a>

                                </td>
                            </tr>
                        </c:forEach>
                        <div class="modal fade" id="modifyModal">
                            <div class="modal-dialog">
                                <div class="modal-content">

                                    <!-- 模态框头部 -->
                                    <div class="modal-header">
                                        <h4 class="modal-title">请输入修改信息</h4>
                                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                                    </div>

                                    <!-- 模态框主体 -->
                                    <div class="modal-body">
                                        <div class="input-group mb-3 input-group-sm">
                                            <input type="text" class="form-control"  id="modify_id" name="modify_id">
                                        </div>
                                        <div class="input-group mb-3 input-group-sm">
                                            <input type="text" class="form-control"  id="modify_introduction" name="modify_intorduction">
                                            <button type="button" class="btn btn-primary" id="update_s_introduction">修改 介绍</button>
                                        </div>
                                        <div class="input-group mb-3 input-group-sm">
                                            <input type="text" class="form-control"  id="modify_price" name="modify_price">
                                            <button type="button" class="btn btn-primary" id="update_s_price">修改 价格</button>
                                        </div>
                                        <div class="input-group mb-3 input-group-sm">
                                            <input type="text" class="form-control"  id="modify_website1" name="modify_website1">
                                            <button type="button" class="btn btn-primary" id="update_s_website1">修改站点1</button>
                                        </div>
                                        <div class="input-group mb-3 input-group-sm">
                                            <input type="text" class="form-control"  id="modify_website2" name="modify_website2">
                                            <button type="button" class="btn btn-primary" id="update_s_website2">修改站点2</button>
                                        </div>
                                    </div>
                                    <!-- 模态框底部 -->
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
                                    </div>

                                </div>
                            </div>
                        </div>
                        </tbody>
                    </table>
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
    <script src="../../vendor/jquery/jquery.min.js"></script>
    <script src="../../vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
    <!-- Core plugin JavaScript-->
    <script src="../../vendor/jquery-easing/jquery.easing.min.js"></script>
    <!-- Page level plugin JavaScript-->
    <script src="../../vendor/chart.js/Chart.min.js"></script>

    <script src="../../vendor/datatables/jquery.dataTables.min.js"></script>

    <script src="../../vendor/datatables/dataTables.bootstrap4.js"></script>

    <script type="text/javascript" src="../../vendor/datatables/jquery.dataTables.js"></script>


    <!-- Custom scripts for all pages-->
    <script src="../../js/后台js/sb-admin.min.js"></script>
    <!-- Custom scripts for this page-->
    <script src="../../js/后台js/sb-admin-datatables.min.js"></script>
    <script src="../../js/后台js/sb-admin-charts.min.js"></script>
</div>
<script type="text/javascript">
    $(function () {
        $("a").click(function () {
            var deleteLink = $(this).attr("deleteLink");
            console.log(deleteLink);
            if("true"==deleteLink){
                var confirmDelete=confirm("确定要删除");
                if(confirmDelete)
                    return true;
                return false;
            }
            windows.location.reload();
        })

    });

    $("#submit_insert_subsystem").click(function () {
        const subsystem = {

            "s_name": $("#s_name").val(),
            "si_id": $("#si_id").val(),
            "s_introduction": $("#s_introduction").val(),
            "s_price": $("#s_price").val(),
            "s_website1": $("#s_website1").val(),
            "s_website2": $("#s_website2").val(),
            "s_status": $("#s_status").val()
        };

        var confirmInsert=confirm("确定添加")
        if(confirmInsert)
        {
            $.ajax({
                type: "POST",
                url: "/Projectlist/submit_insert_subsystem",
                contentType: "application/json; charset=utf-8",
                data: JSON.stringify(subsystem),
                dataType:"json",
                async: "false",
                success: function (result) {

                    result=JSON.parse(result);
                    alert(result);
                    if(result.code==1){
                        alert("chenggong");
                        console.log(result.msg);
                        alert(result.msg);
                        loadMess(1);
                        $('#myModal').modal('hide');
                    }else {
                        alert("shibai");
                        alert(result.msg);
                    }

                },
                /*error: function (result) {
                    result=JSON.parse(result);
                    alert(result);
                    alert("失败");
                    console.log("404 服务器请求失败");
                }*/
            });
            $('#myModal').modal('hide');
            windows.location.reload();
        }
    });

    function showDialog(obj){
        //点击更新按钮后展示模态框
        $('#modifyModal').modal('show');
        //获取当前行的所有列
        var tds= $(obj).parent().parent().find('td');
        //(".id"):通过class属性获取当前需要填写数据的输入框
        //$(tds.eq(0)).text():通过下标取得对应列中的值
        alert($(tds.eq(3)).text());
        $("#modify_id").val($(tds.eq(0)).text());
        $("#modify_introduction").val($(tds.eq(3)).text());
        $("#modify_price").val($(tds.eq(4)).text());
        $("#modify_website1").val($(tds.eq(5)).text());
        $("#modify_website2").val($(tds.eq(6)).text());

    }
    $("#update_s_introduction").click(function () {
        const subsystem = {
            "s_id": $("#s_id").val(),
            "s_introduction": $("#modify_introduction").val(),
            /*"s_price": $("#s_price").val(),
            "s_website1": $("#s_website1").val(),
            "s_website2": $("#s_website2").val(),
            "s_status": $("#s_status").val()*/
        };

        var confirmInsert=confirm("确定添加")
        if(confirmInsert)
        {
            $.ajax({
                type: "POST",
                url: "/Projectlist/submit_insert_subsystem",
                contentType: "application/json; charset=utf-8",
                data: JSON.stringify(subsystem),
                dataType:"json",
                async: "false",
                success: function (result) {

                    result=JSON.parse(result);
                    alert(result);
                    if(result.code==1){
                        alert("chenggong");
                        console.log(result.msg);
                        alert(result.msg);
                        loadMess(1);
                        $('#myModal').modal('hide');
                    }else {
                        alert("shibai");
                        alert(result.msg);
                    }

                },
                /*error: function (result) {
                    result=JSON.parse(result);
                    alert(result);
                    alert("失败");
                    console.log("404 服务器请求失败");
                }*/
            });
            $('#myModal').modal('hide');
            windows.location.reload();
        }
    });

</script>

</body>

</html>
