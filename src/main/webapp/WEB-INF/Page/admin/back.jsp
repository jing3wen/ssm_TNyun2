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
        <li class="breadcrumb-item active">所有功能</li>
      </ol>

      <!-- 已购业务表格-->
      <div class="card mb-3">
        <div class="card-header">
          <i class="fa fa-table"></i> 已购系统列表</div>
        <div class="card-body">
          <div class="table-responsive">
            <table class="table table-bordered">
              <thead>
              <tr>
                <th>账号</th>
                <th>姓名</th>
                <th>已订购的系统</th>
                <th>子系统编号</th>
                <th>订购时间</th>
                <th>状态</th>
              </tr>
              </thead>
              <tbody>
              <tr>
                <td>Tiger Nixon</td>
                <td>System Architect</td>
                <td>Edinburgh</td>
                <td>61</td>
                <td>2011/04/25</td>
                <td>$320,800</td>
              </tr>
              <tr>
                <td>Mary</td>
                <td>Moe</td>
                <td>mary@example.com</td>
                <td>61</td>
                <td>2011/04/25</td>
                <td>$320,800</td>
              </tr>
              <tr>
                <td>July</td>
                <td>Dooley</td>
                <td>july@example.com</td>
                <td>61</td>
                <td>2011/04/25</td>
                <td>$320,800</td>
              </tr>
              <tr>
                <td>July</td>
                <td>Dooley</td>
                <td>july@example.com</td>
                <td>61</td>
                <td>2011/04/25</td>
                <td>999test,800</td>
              </tr>
              <tr>
                <td>July</td>
                <td>Dooley</td>
                <td>july@example.com</td>
                <td>61</td>
                <td>2011/04/25</td>
                <td>$320,800</td>
              </tr>
              </tbody>
            </table>
          </div>
          
        </div>
        <div class="card-footer small text-muted">更新时间：
          <script>document.write(new Date().toLocaleString('chinese', { hour12: false }))</script></div>
      </div>
    </div>
    <!-- /.container-fluid-->

    <%@include file="backPublic/backFooter.jsp"%>
  </div>

  <script>


 </script>




</body>
</html>
