<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="backPublic/backHeader.jsp"%>

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
                                            class="btn icon ion-edit btn-outline-success"
                                            data-toggle="modal"
                                            data-target="#modifyModal"
                                            onclick="showDialog(this)"
                                            id="modifysubsystem">编辑
                                    </button>

                                    <a deleteLink="true" href="/Projectlist/del_subsystem?s_id=${subsystem.s_id}"
                                       class="my-lg-5" style="text-decoration:underline">
                                        <button type="button" class="btn icon ion-trash-a btn-outline-warning" >删除</button>
                                        <!--span style="font-min-size:6px " class="label label-danger radius">删除</span-->
                                    </a>
                                    <button type="button" class="btn icon icon ion-loop btn-outline-primary" onclick="ping_test()" >测试</button>


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
                                            <button type="button" class="btn btn-primary" >服务ID</button>
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
            <div class="card-footer small text-muted">更新时间：
                <script>document.write(new Date().toLocaleString('chinese', { hour12: false }))</script></div>
        </div>
    </div>
    <!-- /.container-fluid-->

    <!--尾栏标签-->
    <%@include file="backPublic/backFooter.jsp"%>
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
        $("#modify_id").val($(tds.eq(0)).text());
        $("#modify_introduction").val($(tds.eq(3)).text());
        $("#modify_price").val($(tds.eq(4)).text());
        $("#modify_website1").val($(tds.eq(5)).text());
        $("#modify_website2").val($(tds.eq(6)).text());

    }

    $("#update_s_introduction").click(function () {
        const subsystem = {
            "s_id": $("#modify_id").val(),
            "s_introduction": $("#modify_introduction").val(),
        };

        var confirmInsert=confirm("确定修改介绍？")
        if(confirmInsert)
        {
            $.ajax({
                type: "POST",
                url: "/Projectlist/update_s_introduction",
                contentType: "application/json; charset=utf-8",
                data: JSON.stringify(subsystem),
                dataType:"json",
                async: "false",
                success: function (result) {

                    console.log("服务器请求成功");
                    if(result=="success"){
                        alert("修改介绍成功")
                        $('#modifyModal').modal('hide');
                        windows.location.reload();
                    }
                    else {
                        alert(result);
                    }

                },
            });
            $('#modifyModal').modal('hide');
            windows.location.reload();
        }
    });
    $("#update_s_price").click(function () {
        const subsystem = {
            "s_id": $("#modify_id").val(),
            "s_price": $("#modify_price").val(),
        };

        var confirmInsert=confirm("确定修改价格？")
        if(confirmInsert)
        {
            $.ajax({
                type: "POST",
                url: "/Projectlist/update_s_price",
                contentType: "application/json; charset=utf-8",
                data: JSON.stringify(subsystem),
                dataType:"json",
                async: "false",
                success: function (result) {

                    console.log("服务器请求成功");
                    if(result=="success"){
                        alert("修改价格成功")
                        $('#modifyModal').modal('hide');
                        windows.location.reload();
                    }
                    else {
                        alert(result);
                    }
                },
            });
            //$('#modifyModal').modal('hide');
            //windows.location.reload();
        }
    });

    $("#update_s_website1").click(function () {
        const subsystem = {
            "s_id": $("#modify_id").val(),
            "s_website1": $("#modify_website1").val(),
        };

        var confirmInsert=confirm("确定修改前端站点？")
        if(confirmInsert)
        {
            $.ajax({
                type: "POST",
                url: "/Projectlist/update_s_website1",
                contentType: "application/json; charset=utf-8",
                data: JSON.stringify(subsystem),
                dataType:"json",
                async: "false",
                success: function (result) {

                    console.log("服务器请求成功");
                    if(result=="success"){
                        alert("修改前端站点成功")
                        $('#modifyModal').modal('hide');
                        windows.location.reload();
                    }
                    else {
                        alert(result);
                    }
                },
            });
            $('#modifyModal').modal('hide');
            windows.location.reload();
        }
    });
    $("#update_s_website2").click(function () {
        const subsystem = {
            "s_id": $("#modify_id").val(),
            "s_website2": $("#modify_website2").val(),

        };

        var confirmInsert=confirm("确定修改后端站点？")
        if(confirmInsert)
        {
            $.ajax({
                type: "POST",
                url: "/Projectlist/update_s_website2",
                contentType: "application/json; charset=utf-8",
                data: JSON.stringify(subsystem),
                dataType:"json",
                async: "false",
                success: function (result) {

                    console.log("服务器请求成功");
                    if(result=="success"){
                        alert("修改后端站点成功")
                        $('#modifyModal').modal('hide');
                        windows.location.reload();
                    }
                    else {
                        alert(result);
                    }

                },
            });
            $('#modifyModal').modal('hide');
            windows.location.reload();
        }
    });

    function ping_test() {
        url="http://pagespeed.webkaka.com/";
        alert("即将前往"+url+"进行测试");
        window.location.href=url;
    }




</script>

</body>

</html>
