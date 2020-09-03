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
        <li class="breadcrumb-item active">用户使用统计</li>
      </ol>

      <!-- 折线图-->
      <div class="card mb-3">
        <div class="card-header">
          <i class="fa fa-area-chart"></i> 最近一周用户使用（人/次）</div>
        <div class="card-body">
          <canvas id="myAreaChart" width="100%" height="30"></canvas>
        </div>
        <div class="card-footer small text-muted">更新时间：
          <script>document.write(new Date().toLocaleString('chinese', { hour12: false }))</script></div>
      </div>
      <div class="row">
        <div class="col-lg-8">
          <!-- Example Bar Chart Card-->
          <div class="card mb-3">
            <div class="card-header">
              <i class="fa fa-bar-chart"></i>用户注册人数统计</div>
            <div class="card-body">
              <canvas id="myBarChart" width="100" height="50"></canvas>
            </div>
            <div class="card-footer small text-muted">更新时间：
              <script>document.write(new Date().toLocaleString('chinese', { hour12: false }))</script></div>
          </div>
        </div>
        <div class="col-lg-4">
          <!-- Example Pie Chart Card-->
          <img src="pug/是谁还没注册.jpg" style="margin-top: 30%;margin-left: 20%">
          <!--img src="pug/就这么几个用户.jpg"-->
        </div>
      </div>
    </div>
    <!-- /.container-fluid-->

    <!--尾栏标签-->
    <%@include file="backPublic/backFooter.jsp"%>
  </div>

</body>

</html>
