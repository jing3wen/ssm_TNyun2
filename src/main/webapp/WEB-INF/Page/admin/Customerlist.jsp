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
            <li class="breadcrumb-item active">服务项目管理</li>
            <li class="breadcrumb-item active">项目列表</li>
        </ol>

        <!-- 全部系统服务表格-->
        <div class="card mb-3">
            <div class="card-header">
                <i class="fa fa-table"></i>用户列表
                <button type="button"
                        style="float:right"
                        class="icon icon ion-plus-round btn btn-outline-dark"
                        data-toggle="modal"
                        data-target="#myModal"
                        id="insert_subsystem1">修改
                </button>
                <div class="modal fade" id="myModal">
                    <div class="modal-dialog">
                        <div class="modal-content">

                            <!-- 模态框头部 -->
                            <div class="modal-header">
                                <h4 class="modal-title">请输入用户信息</h4>
                                <button type="button" class="close" data-dismiss="modal">&times;</button>
                            </div>

                            <!-- 模态框主体 -->
                            <div class="modal-body">

                                <div class="input-group mb-3 input-group-sm">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text">用户ID</span>
                                    </div>
                                    <input type="text" class="form-control" placeholder="用户ID" id="id" name="id">
                                </div>
                                <div class="input-group mb-3 input-group-sm">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text">用户姓名</span>
                                    </div>
                                    <input type="text" class="form-control" placeholder="用户姓名" id="name" name="name">
                                </div>
                                <div class="input-group mb-3 input-group-sm">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text">电话</span>
                                    </div>
                                    <input type="text" class="form-control" placeholder="电话" id="phone" name="phone">
                                </div>
                                <div class="input-group mb-3 input-group-sm">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text">邮箱</span>
                                    </div>
                                    <input type="text" class="form-control" placeholder="邮箱" id="email" name="email">
                                </div>
                            </div>

                            <!-- 模态框底部 -->
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
                                <button type="button" class="btn btn-primary" id="submit_insert_customerlist">提交</button>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
            <div class="card-body">
                <div class="table-responsive">
                    <table class="table table-bordered" id=:"customerlist">
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
                                    <a deleteLink="true" href="/Customerlist/del_customer?id=${cust.id}"
                                       class="ml-5" style="...">
                                        <span class="label label-success radius">删除</span>
                                    </a>

                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                    <input type="button" value="另存为 Excel" onClick="javascript:method1('customerlist')">
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
        $("#modify_name").val($(tds.eq(3)).text());
        $("#modify_phone").val($(tds.eq(4)).text());
        $("#modify_email").val($(tds.eq(5)).text());

    }

    $("#update_s_name").click(function () {
        const subsystem = {
            "s_id": $("#modify_id").val(),
            "s_introduction": $("#modify_name").val(),
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
            windows.location.reload();
        }
    });
    $("#update_s_phone").click(function () {
        const subsystem = {
            "s_id": $("#modify_id").val(),
            "s_price": $("#modify_phone").val(),
        };

        var confirmInsert=confirm("确定修改价格？")
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
            windows.location.reload();
        }
    });

    $("#update_s_email").click(function () {
        const subsystem = {
            "s_id": $("#modify_id").val(),
            "s_website1": $("#modify_email").val(),
        };

        var confirmInsert=confirm("确定修改前端站点？")
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
            windows.location.reload();
        }
    });


</script>

//导出为Excel
<script type="text/javascript" language="javascript">
        var idTmr;
        function  getExplorer() {
            var explorer = window.navigator.userAgent ;
            //ie
            if (explorer.indexOf("MSIE") >= 0) {
                return 'ie';
            }
            //firefox
            else if (explorer.indexOf("Firefox") >= 0) {
                return 'Firefox';
            }
            //Chrome
            else if(explorer.indexOf("Chrome") >= 0){
                return 'Chrome';
            }
            //Opera
            else if(explorer.indexOf("Opera") >= 0){
                return 'Opera';
            }
            //Safari
            else if(explorer.indexOf("Safari") >= 0){
                return 'Safari';
            }
        }
        function method1(tableid) {//整个表格拷贝到EXCEL中
            if(getExplorer()=='ie')
            {
                var curTbl = document.getElementById(tableid);
                var oXL = new ActiveXObject("Excel.Application");
                 
                //创建AX对象excel
                var oWB = oXL.Workbooks.Add();
                //获取workbook对象
                var xlsheet = oWB.Worksheets(1);
                //激活当前sheet
                var sel = document.body.createTextRange();
                sel.moveToElementText(curTbl);
                //把表格中的内容移到TextRange中
                sel.select();
                //全选TextRange中内容
                sel.execCommand("Copy");
                //复制TextRange中内容 
                xlsheet.Paste();
                //粘贴到活动的EXCEL中      
                oXL.Visible = true;
                //设置excel可见属性
 
                try {
                    var fname = oXL.Application.GetSaveAsFilename("Excel.xls", "Excel Spreadsheets (*.xls), *.xls");
                } catch (e) {
                    print("Nested catch caught " + e);
                } finally {
                    oWB.SaveAs(fname);
 
                    oWB.Close(savechanges = false);
                    //xls.visible = false;
                    oXL.Quit();
                    oXL = null;
                    //结束excel进程，退出完成
                    //window.setInterval("Cleanup();",1);
                    idTmr = window.setInterval("Cleanup();", 1);
 
                }
            }
            else
            {
                tableToExcel(tableid)
            }
        }
        function Cleanup() {
            window.clearInterval(idTmr);
            CollectGarbage();
        }
        var tableToExcel = (function() {
              var uri = 'data:application/vnd.ms-excel;base64,',
              template = '<html xmlns:o="urn:schemas-microsoft-com:office:office" xmlns:x="urn:schemas-microsoft-com:office:excel" xmlns="http://www.w3.org/TR/REC-html40"><head><!--[if gte mso 9]><xml><x:ExcelWorkbook><x:ExcelWorksheets><x:ExcelWorksheet><x:Name>{worksheet}</x:Name><x:WorksheetOptions><x:DisplayGridlines/></x:WorksheetOptions></x:ExcelWorksheet></x:ExcelWorksheets></x:ExcelWorkbook></xml><![endif]--></head><body><table>{table}</table></body></html>',
                base64 = function(s) { return window.btoa(unescape(encodeURIComponent(s))) },
                format = function(s, c) {
                    return s.replace(/{(\w+)}/g,
                    function(m, p) { return c[p]; }) }
                return function(table, name) {
                if (!table.nodeType) table = document.getElementById(table)
                var ctx = {worksheet: name || 'Worksheet', table: table.innerHTML}
                window.location.href = uri + base64(format(template, ctx))
              }
            })()
</script>

</body>

</html>
