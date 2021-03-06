<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="backPublic/backHeader.jsp"%>

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

        <!-- 全部系统服务表格-->
        <div class="card mb-3">
            <div class="card-header">
                <i class="fa fa-table"></i>用户列表
            </div>
            <div class="card-body">
                <div class="table-responsive">
                    <table class="table table-bordered" id="customerlist">
                        <thead>
                        <tr>
                            <th>用户ID</th>
                            <th>用户姓名</th>
                            <th>电话</th>
                            <th>邮箱</th>
                            <th>状态</th>
                            <th>操作</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${customerlist}" var="cust">
                            <tr class="text-c">
                                <td>${cust.id}</td>
                                <td>${cust.name}</td>
                                <td>${cust.phone}</td>
                                <td>${cust.email}</td>
                                <td>
                                    <c:if test="${cust.status==1}">可用</c:if>
                                    <c:if test="${cust.status==0}">不可用</c:if>
                                </td>
                                <td>
                                    <button type="button" class="btn icon ion-edit btn-outline-success"
                                            data-toggle="modal"
                                            data-target="#modifyModal"
                                            onclick="showDialog(this)"
                                            id="modifysubsystem">修改
                                    </button>

                                    <a deleteLink="true" href="/Customerlist/del_customer?id=${cust.id}"
                                       class="ml-5" style="...">
                                        <button type="button" class="btn icon ion-trash-a btn-outline-warning" id="">删除</button>
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
                                            <button type="button" class="btn btn-primary" >用户ID</button>
                                        </div>
                                        <div class="input-group mb-3 input-group-sm">
                                            <input type="text" class="form-control"  id="modify_name" name="modify_name">
                                            <button type="button" class="btn btn-primary" id="update_s_name">修改用户名称</button>
                                        </div>
                                        <div class="input-group mb-3 input-group-sm">
                                            <input type="text" class="form-control"  id="modify_phone" name="modify_phone">
                                            <button type="button" class="btn btn-primary" id="update_s_phone">修改电话</button>
                                        </div>
                                        <div class="input-group mb-3 input-group-sm">
                                            <input type="text" class="form-control"  id="modify_email" name="modify_email">
                                            <button type="button" class="btn btn-primary" id="update_s_email">修改邮箱</button>
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
                <input type="button" value="另存为 Excel" onClick="javascript:tableToExcel('customerlist','用户表格')">
            </div>
            <div class="card-footer small text-muted">更新时间：
                <script>document.write(new Date().toLocaleString('chinese', { hour12: false }))</script></div>
        </div>
    </div>
    <!-- /.container-fluid-->

    <!--尾栏标签-->
    <%@include file="backPublic/backFooter.jsp"%>


</div>


<!--导出为Excel-->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/导出文件js/excel2.js"></script>
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

        })

    });

    function showDialog(obj){
        //点击更新按钮后展示模态框
        $('#modifyModal').modal('show');
        //获取当前行的所有列
        var tds= $(obj).parent().parent().find('td');
        //(".id"):通过class属性获取当前需要填写数据的输入框
        //$(tds.eq(0)).text():通过下标取得对应列中的值
        $("#modify_id").val($(tds.eq(0)).text());
        $("#modify_name").val($(tds.eq(1)).text());
        $("#modify_phone").val($(tds.eq(2)).text());
        $("#modify_email").val($(tds.eq(3)).text());

    }

    $("#update_s_name").click(function () {
        const subsystem = {
            "id": $("#modify_id").val(),
            "name": $("#modify_name").val(),
        };

        var confirmInsert=confirm("确定修改名字？")
        if(confirmInsert)
        {
            $.ajax({
                type: "POST",
                url: "/Customerlist/update_s_name",
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
                        $('#modifyModal').modal('hide');
                    }else {
                        alert("shibai");
                        alert(result.msg);
                    }

                },
            });
            $('#modifyModal').modal('hide');
            setTimeout(function(){ window.location.href="customerlist"; }, 1000);
        }
    });
    $("#update_s_phone").click(function () {
        const subsystem = {
            "id": $("#modify_id").val(),
            "phone": $("#modify_phone").val(),
        };

        var confirmInsert=confirm("确定修改电话？")
        if(confirmInsert)
        {
            $.ajax({
                type: "POST",
                url: "/Customerlist/update_s_phone",
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
                        $('#modifyModal').modal('hide');
                    }else {
                        alert("shibai");
                        alert(result.msg);
                    }

                },
            });
            $('#modifyModal').modal('hide');
            setTimeout(function(){ window.location.href="customerlist"; }, 1000);
        }
    });

    $("#update_s_email").click(function () {
        const subsystem = {
            "id": $("#modify_id").val(),
            "email": $("#modify_email").val(),
        };

        var confirmInsert=confirm("确定修改邮箱？")
        if(confirmInsert)
        {
            $.ajax({
                type: "POST",
                url: "/Customerlist/update_s_email",
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
                        $('#modifyModal').modal('hide');
                    }else {
                        alert("shibai");
                        alert(result.msg);
                    }

                },
            });
            $('#modifyModal').modal('hide');
            setTimeout(function(){ window.location.href="customerlist"; }, 1000);
        }
    });


</script>



</body>

</html>
