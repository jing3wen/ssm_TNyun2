<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>  
<!DOCTYPE html>
<html lang="zh">
<head>
    <!-- basic -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- mobile metas -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="viewport" content="initial-scale=1, maximum-scale=1">
    <!-- site metas -->
    <title>TN云</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <meta name="author" content="">

    <link rel="stylesheet" href="css/fujiacss.css">
    <!-- bootstrap css -->
    <link rel="stylesheet" href="css/前台css/bootstrap.min.css">
    <!-- style css -->
    <link rel="stylesheet" href="css/前台css/style.css">
    <!-- Responsive-->
    <link rel="stylesheet" href="css/前台css/responsive.css">
    <!-- fevicon -->
    <link rel="icon" href="images/fevicon.png" type="image/gif" />
    <!-- Scrollbar Custom CSS -->
    <link rel="stylesheet" href="css/前台css/jquery.mCustomScrollbar.min.css">
    <!-- Tweaks for older IEs-->
    <link rel="stylesheet" href="css/前台css/font-awesome.css">
    <link rel="stylesheet" href="css/前台css/jquery.fancybox.min.css" media="screen">


    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script><![endif]-->

    <style>


    </style>
</head>
<!-- body -->
<body class="main-layout">
<!-- 顶部导航栏 -->
<header>
    <div class="header">
        <div class="container">
            <div class="row">
                <div class="col-xl-3 col-lg-3 col-md-3 col-sm-3 col logo_section">
                    <div class="full">
                        <div class="center-desk">
                            <div class="logo">
                                <a href="#"><img src="images/logo2.4.png" alt="#" /></a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-xl-9 col-lg-9 col-md-9 col-sm-9">
                    <nav class="navigation navbar navbar-expand-md navbar-dark ">
                        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample04" aria-controls="navbarsExample04" aria-expanded="false" aria-label="Toggle navigation">
                            <span class="navbar-toggler-icon"></span>
                        </button>
                        <div class="collapse navbar-collapse" id="navbarsExample04">
                            <ul class="navbar-nav mr-auto">
                                <li class="nav-item">
                                    <a class="nav-link" href="http://localhost:8082/">首页</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="http://localhost:8082/#about"> 关于  </a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="http://localhost:8082/#service"> 服务</a>
                                </li>
                                <li class="nav-item active">
                                    <a class="nav-link" href="SuppplyForIdentity.jsp">申请</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="#">登陆</a>
                                </li>
                            </ul>
                        </div>
                    </nav>
                </div>
            </div>
        </div>
    </div>
</header>


<!-- 首页标签内容· -->
<section class="banner_main">
    <div class="container">
        <div class="row d_flex">
            <div class="col-md-7">
                <div class="text-img">
                    <figure><img src="../../images/img.png" /></figure>
                </div>
            </div>
            <div class="col-md-5">
                <div id="contact2" class="contact2" >
                    <div class="row">
                        <form class="main_form2" >
                            <div class="text-bg" style="text-align:center;padding-bottom: 20px" >
                                <span style="color: white ; font-size:18px">输入信息</span>
                            </div>
                            <div class="row">
                                <div class="col-sm-12">
                                    <input class="contactus2" placeholder="电话" type="text" name="phone" id="phone">
                                </div>
                                <div class="col-sm-12">
                                    <input class="contactus2" placeholder="密码" type="password" name="password" id="password" style="width: 500px">
                                </div>
                            </div>
                            <div class="row">
                                <button type="button" class="icon ion-person send2" id="customer_login" style="font-size: 16px;">申请成为企业用户</button>
                                <button type="button" class="icon ion-person-add send2" id="admin_login" style="font-size: 16px;color: #34ce57">申请成为开发商</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- end  -->



<!-- Javascript files-->
<script src="js/前台js/jquery.min.js"></script>
<script src="js/前台js/popper.min.js"></script>
<script src="js/前台js/bootstrap.bundle.min.js"></script>
<script src="js/前台js/jquery-3.0.0.min.js"></script>
<script src="js/前台js/plugin.js"></script>
<!-- sidebar -->
<script src="js/前台js/jquery.mCustomScrollbar.concat.min.js"></script>
<script src="js/前台js/custom.js"></script>
<script src="js/前台js/jquery.fancybox.min.js"></script>

<script>
    $("#customer_supply").click(function () {
        var customer={
            "phone":$("#phone").val(),
            "password":$("#password").val()
        }
        if(customer.phone!=null||customer.password!=null){
            $.ajax({
                type: "POST",
                url: "",
                contentType: "application/json; charset=utf-8",
                data: JSON.stringify(customer),
                dataType:"text",
                async: "false",
                success: function (result) {
                    console.log("服务器请求成功");
                    if(result=="customer supply is ok"){
                        alert("申请成功！请查看邮箱")
                        window.location.href="http://localhost:8082/";
                    }
                    
                    else alert("申请失败")
                },
                error: function () {
                    console.log("404 服务器请求失败");
                }
            })
        }
        else if(customer.phone==null){
            alert("请输入账号");
        }
        else alert("请输入密码");

    })

</script>



</body>
</html>
