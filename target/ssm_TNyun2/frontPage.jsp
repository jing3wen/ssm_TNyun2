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

</head>
<!-- body -->
<body class="main-layout">
	<!---->
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
									<li class="nav-item active">
										<a class="nav-link" href="#">首页</a>
									</li>
									<li class="nav-item">
										<a class="nav-link" href="#about"> 关于  </a>
									</li>
									<li class="nav-item">
										<a class="nav-link" href="#service"> 服务</a>
									</li>
									<li class="nav-item">
										<a class="nav-link" href="#contact">注册</a>
									</li>
									<li class="nav-item">
										<text class="nav-link" id="customer_name"></text>
									</li>
									<li class="nav-item">
										<button class="nav-link" id="login" style="background-color: #0c0f38">登陆</button>
									</li>
									<li class="nav-item">
										<button class="nav-link" id="login_out" style="background-color: #0c0f38">登出</button>
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
				<div class="col-md-5">
					<div class="text-bg">
						<h1><br>TN云平台</h1>
						<span>免费用！免费用！免费用！</span>
						<p>欢迎使用TN云平台，现在注册即可免费享用专属服务一年，开发人员专业指导，活动时间截至2020/8/10</p>
						<a href="#">加入我们</a>
					</div>
				</div>
				<div class="col-md-7">
					<div class="text-img">
						<figure><img src="images/img.png" /></figure>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- end  -->

	<!-- 关于标签内容 -->
	<div id="about" class="hosting">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="titlepage">
						<h2>什么的云管理平台</h2>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<div class="web_hosting">
						<figure><img  src="images/web.jpg" alt="#"/></figure>
						<p>致力于提供多基础设施的整合能力，所以云管理平台需要能够以可扩展的方式整合好这些基础设施；拥有跨平台的编排能力，可以让用户灵活、高效地在不同云平台使用云资源；以服务目录为最主要载体的服务管理，提供多租户、多层次的资源访问管理能力并且可以供开放的接口来整合其他外围系统。</p>
						<a href="#">了解更多</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- end  -->

	<!-- 服务标签内容  -->
	<div id="service" class="Services">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="titlepage">
						<h2>TN云服务</h2>
						<p>TN云管理平台旨在把厂商的云计算资源能够放在一起平台中统一管理，欢迎各位合作
						</p>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-xl-4 col-lg-4 col-md-4 col-sm-12">
					<div class="Services-box">
						<i><img src="images/service1.png" alt="#" id="open_img_1" onclick="service(1)"/></i>
						<h3 id="open_h3_1" onclick="service(1)">云超市</h3>
						<p id="open_p_1" onclick="service(1)" >云超市，是一种社区电子商务的交易形式，即网上预定和下单、线下快速到货的一种超市形式。</p>
					</div>
				</div>
				<div class="col-xl-4 col-lg-4 col-md-4 col-sm-12">
					<div class="Services-box">
						<i><img src="images/service2.png" alt="#" /></i>
						<h3>云体验销售中心</h3>
						<p>销售云解决方案可以为客户提供情境化且个性化的全渠道购物体验。给用户带来真实的体验</p>
					</div>
				</div>
				<div class="col-xl-4 col-lg-4 col-md-4 col-sm-12">
					<div class="Services-box">
						<i><img src="images/service3.png" alt="#" /></i>
						<h3>企业工作台</h3>
						<p>整合即时交易管理，提供品质卓越的云协作体验，成就组织和个人，使协作和管理更高效、更愉悦</p>
					</div>
				</div>
				<div class="col-xl-4 col-lg-4 col-md-4 col-sm-12">
					<div class="Services-box">
						<i><img src="images/service4.png" alt="#" /></i>
						<h3>开发中</h3>
						<p></p>
					</div>
				</div>
				<div class="col-xl-4 col-lg-4 col-md-4 col-sm-12">
					<div class="Services-box">
						<i><img src="images/service5.png" alt="#" /></i>
						<h3>开发中</h3>
						<p></p>
					</div>
				</div>
				<div class="col-xl-4 col-lg-4 col-md-4 col-sm-12">
					<div class="Services-box">
						<i><img src="images/service6.png" alt="#" /></i>
						<h3>开发中</h3>
						<p></p>
					</div>
				</div>
				<a class="read_more" href="#">了解更多</a>
			</div>
		</div>
	</div>
	<!-- end Servicess -->

	<!-- why -->
	<div id="why" class="why">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="titlepage">
						<h2>为什么要选择我们</h2>
						<p>管好云资源，用好云服务，控制好云成本</p>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-xl-4 col-lg-4 col-md-4 col-sm-12">
					<div id="box_ho" class="why-box">
						<i><img src="images/why1.png" alt="#" /></i>
						<h3>管好云资源</h3>
						<p>企业的云管理平台应该有很好的扩展能力，能够快速覆盖业务发展需要引入的多种异构基础设施和供应商，这其中就包括企业的物理集群、虚拟化环境和主流私有云平台和公有云供应商等。</p>
					</div>
					<a class="read_more bg" href="#">了解更多</a>
				</div>
				<div class="col-xl-4 col-lg-4 col-md-4 col-sm-12">
					<div class="why-box">
						<i><img src="images/why2.png" alt="#" /></i>
						<h3>用好云服务</h3>
						<p>对于用户来说，其最终需要的是运行在云平台上的云应用，而不是各种云资源。 所以，用好云服务的关键所在就是在服务好云应用的开发、测试、上线和运营。所以，企业的云管理平台应该有......</p>
					</div>
					<a class="read_more bg" href="#">了解更多</a>
				</div>
				<div class="col-xl-4 col-lg-4 col-md-4 col-sm-12">
					<div class="why-box">
						<i><img src="images/why3.png" alt="#" /></i>
						<h3>控制好云成本</h3>
						<p>在企业内部广泛推行云平台和自助服务后，一个必然的挑战是如果控制好企业的云成本。由于云平台提供了“无限量”资源，并按需付费，这给业务团队在使用过程中形成资源浪费提供了非常大的可能性。</p>
					</div>
					<a class="read_more bg" href="#">了解更多</a>
				</div>
			</div>
		</div>
	</div>
	<!-- end why -->

	<!-- 用户注册 -->
	<div id="contact" class="contact">
		<div class="container">
			<div class="row">
				<div class="col-md-6 offset-md-3 ">
					<form class="main_form">
						<div class="row">
							<div class="col-sm-12">
								<input class="contactus" placeholder="电话" type="text" name="phone" id="phone">
							</div>
							<div class="col-sm-12">
								<input class="contactus" placeholder="姓名" type="text" name="name" id="name">
							</div>
							<div class="col-sm-12">
								<input class="contactus" placeholder="密码" type="password" name="password" id="password">
							</div>
							<div class="col-sm-12">
								<input class="contactus" placeholder="确认密码" type="password" name="conpassword" id="conpassword"></input>
							</div>
							<div class="col-sm-12">
								<button type="button" class="send" id="register">注册</button>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<!-- end contact -->
	<!--  footer -->
	<footer>
		<div class="footer">
			<div class="container" style="pointer-events: none">
				<div class="row">
					<div class="col-md-10 offset-md-1">
						<div class="cont">
							<h3>现在就加入TN云</h3>
							<span>2020年最新的云服务平台</span>
							<p>现在注册就可以享受免费云服务，若您在使用的过程中遇到任何bug即可联系我们开发人员，我们会对您给予一定的奖励。同时我们也欢迎各位技术大佬加入我们这个家庭
							</p>
						</div>
					</div>
				</div>
			</div>
			<div class="copyright">
				<div class="container">
					<div class="row">
						<div class="col-md-12">
							<p>感谢TN云团队开发.sjw,xz,kyq,wtj,ccx</p>
						</div>
					</div>
				</div>
			</div>
		</div>

	</footer>
	<!-- end footer -->

	<!-- 模态框（Modal） -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true"
		 style="z-index: 1200;">
		<div class="modal-dialog">
			<div class="modal-content" style="background-color: white">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">×
					</button>
				</div>
				<div class="modal-body">
					<h1 id="mod_system_name">1234</h1>
					<h2 id="mod_system_pay">还未购买</h2>
					<p id="mod_system_price">价格0元</p>
				</div>
				<div class="modal-footer">
					<button type="button" class="icon ion-close-circled btn btn-outline-secondary" data-dismiss="modal" style="color: #6c757d">
						我再想想
					</button>
					<button type="button" class="icon ion-checkmark-circled btn btn-outline-dark" style="color: #1e7e34">
						确定购买
					</button>
				</div>
			</div><!-- /.modal-content -->
		</div><!-- /.modal-dialog -->
	</div><!-- /.modal -->


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

</body>

	<script>

		var cur_customer;

		var cus_service;

		var subsystem={
			"s_id":3,
			"s_name":"云超市",
			"s_herf":"yunchaoshi.html",
			"s_introduction":"云超市，是一种社区电子商务的交易形式，即网上预定和下单、线下快速到货的一种超市形式。"
		};


		$(function () {
			$("#login_out").hide();
			get_cur_customer();
		})


		$("#register").click(function () {
			var customer={
				"phone":$("#phone").val(),
				"name":$("#name").val(),
				"password":$("#password").val()
			}
			if(customer.phone==""||customer.name==""||customer.password==""||$("#conpassword").val()=="") alert("输入的信息有缺失");
			else if(!(/^1[3456789]\d{9}$/.test(customer.phone)))  alert("手机号码有误，请重填");
			else if(customer.password!=$("#conpassword").val()) alert("两次输入的密码不同，请重新输入");
			else {
				$.ajax({
					type: "POST",
					url: "/customer/register_post",
					contentType: "application/json; charset=utf-8",
					data: JSON.stringify(customer),
					dataType:"json",
					async: "false",
					success: function (result) {
						console.log("服务器请求成功");
						if(result=="the account has been registered") alert("该账号已被注册😢");
						else alert("👀注册成功!👀")

					},
					error: function () {
						console.log("404 服务器请求失败");
					}
				})
			}
		})


		$("#login").click(function () {
				 window.location.href="login";
		 })


		$("#login_out").click(function () {
			$.ajax({
				type: "POST",
				url: "/customer/customerloginout_post",
				contentType: "application/json; charset=utf-8",
				data:JSON.stringify(cur_customer),
				dataType:"text",
				async: "false",
				success: function (result) {
					console.log("服务器请求成功");
					$("#customer_name").html("");
					$("#login").show();
					$("#login_out").hide();


				},
				error: function () {
					console.log("404 服务器请求失败");
				}
			})
		})




		//获取当前登陆用户
		function get_cur_customer() {
			$.ajax({
				type: "POST",
				url: "/customer/current_customer_post",
				contentType: "application/json; charset=utf-8",
				dataType:"json",
				async: "false",
				success: function (result) {
					console.log("服务器请求成功");
					console.log("当前登录的用户"+result);
					cur_customer=result;
					if(cur_customer.id!=0){
						$("#customer_name").html(cur_customer.name);
						$("#login").hide();
						$("#login_out").show();
					}

				},
				error: function () {
					console.log("404 服务器请求失败");
				}
			})
		}
		//购买服务
		function service(number){

			console.log("购买子系统"+$("#open_h3_"+number.toString()).val());
			if(cur_customer==null){
				console.log(" 身份为: "+$("#customer_name").val()+"跳转到登陆界面")
				window.location.href="login";
			}
			//else if()
			else {
				myModalshow($("#open_h3_"+number.toString()).val(),
						"还未购买",
						"0元")
			}

		}
		//查找当前用户所有的服务系统
		function findallService() {
			$.ajax({
				type: "POST",
				url: "/customer/current_customer_post",
				contentType: "application/json; charset=utf-8",
				dataType:"json",
				async: "false",
				success: function (result) {
					console.log("服务器请求成功");
					console.log("当前登录的用户"+result);
					cur_customer=result;
					if(cur_customer.id!=0){
						$("#customer_name").html(cur_customer.name);
						$("#login").hide();
						$("#login_out").show();
					}

				},
				error: function () {
					console.log("404 服务器请求失败");
				}
			})
		}

		function myModalshow(system_name,system_pay,system_price) {
			console.log("模态框事件触发");
			$("#mod_system_name").text(system_name);
			$("#mod_system_pay").text(system_pay);
			$("#mod_system_pay").text(system_price);
			$("#myModal").modal('show');
		}



	</script>

</html>

