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
            <li class="breadcrumb-item active">用户统计及相关请求</li>
            <li class="breadcrumb-item active">购买服务订单</li>
        </ol>

        <!-- 全部系统服务表格-->
        <div class="card mb-3">
            <div class="card-header">
                <i class="fa fa-table"></i>用户列表
            </div>
            <div class="card-body">
                <div class="table-responsive">
                    <table class="table table-bordered" id="ServerOrderlist">
                        <thead>
                        <tr>
                            <th>时间</th>
                            <th>用户姓名</th>
                            <th>子系统名称</th>
                            <th>到期时间</th>
                            <th>状态</th>
                            <th>操作</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${ServerOrderlist}" var="plist">
                            <tr class="text-c">
                                <td >${plist.time}</td>
                                <td>${plist.c_name}</td>
                                <td>${plist.s_name}</td>
                                <td>${plist.rent_time}</td>

                                <td>
                                    <c:if test="${plist.agree=='1'}">未激活</c:if>
                                    <c:if test="${plist.agree=='2'}">已激活</c:if>
                                    <c:if test="${plist.agree=='3'}">已过期</c:if>
                                </td>
                                <td>
                                    <a buyLink="true"
                                       href="/ServerOrder/setagree2?c_id=${plist.c_id}&s_id=${plist.s_id}" class="ml-5">
                                        <button type="button" class="btn icon ion-checkmark-circled btn-outline-info" id="test2">激活</button>
                                    </a>
                                    <a overLink="true"
                                       href="/ServerOrder/setagree3?c_id=${plist.c_id}&s_id=${plist.s_id}" class="ml-5">
                                        <button type="button" class="btn icon ion-close-circled btn-outline-info" id="test3">停用</button>
                                    </a>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
                <input type="button" value="另存为 Excel" onClick="javascript:tableToExcel('ServerOrderlist','订单表格')"/>
            </div>
            <div class="card-footer small text-muted">更新时间：
                <script>document.write(new Date().toLocaleString('chinese', { hour12: false }))</script>
            </div>

        </div>
    </div>
    <!-- /.container-fluid-->

    <!--尾栏标签-->
    <%@include file="backPublic/backFooter.jsp"%>


</div>



//导出为Excel
<script type="text/javascript" src="${pageContext.request.contextPath}/js/导出文件js/excel2.js"></script>

</body>

</html>
