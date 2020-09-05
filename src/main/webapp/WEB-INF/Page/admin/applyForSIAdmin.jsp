<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>  
<!DOCTYPE html>
<html lang="zh">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>TN云</title>



<style type="text/css">
*{margin:0;padding:0;list-style-type:none;}
a,img{border:0;}
body{font:12px/180% Arial, Helvetica, sans-serif, "新宋体"; background-color:#0c0f38;}


#wizard {border:5px solid #789;font-size:12px;height:400px;margin:20px auto;width:570px;overflow:hidden;position:relative;-moz-border-radius:5px;-webkit-border-radius:5px; background-color:#FFFFFF;}
#wizard .items{width:20000px; clear:both; position:absolute;}
#wizard .right{float:right;}
#wizard #status{height:35px;background:#123;padding-left:25px !important;}
#status li{float:left;color:#fff;padding:10px 30px;}
#status li.active{background-color:#369;font-weight:normal;}
.input{width:240px; height:18px; margin:10px auto; line-height:20px; border:1px solid #d3d3d3; padding:2px}
.page{padding:20px 30px;width:500px;float:left;}
.page h3{height:42px; font-size:16px; border-bottom:1px dotted #ccc; margin-bottom:20px; padding-bottom:5px}
.page h3 em{font-size:12px; font-weight:500; font-style:normal}
.page p{line-height:24px;}
.page p label{font-size:14px; display:block;}
.btn_nav{height:36px; line-height:36px; margin:20px auto;}
.prev,.next{width:100px; height:32px; line-height:32px; border:1px solid #d3d3d3; cursor:pointer}
.logo a {
     font-size: 40px;
     font-weight: bold;
     text-transform: uppercase;
     color: #fff;
     line-height: 40px;
}
</style>

<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/scrollable.js"></script>

</head>
<body >
<div class="logo">
                                <a href="#"><img src="images/logo2.4.png" alt="#" /></a>
                            </div>

<form action="#" method="post">
<div id="wizard">
	<ul id="status">
		<li class="active"><strong>1.</strong>开发商入驻</li>
		<li><strong>2.</strong>入驻信息</li>
		<li><strong>3.</strong>完成</li>
	</ul>
	<div class="items">
		<div class="page">
		   <h3>入驻协议<br/><em>请仔细阅读。</em></h3>
		   <h1 style="font-size:9px">一旦同意这些条款，即表示您同意在使用服务时遵守以下规则：
               i.不得从事任何非法活动。
               ii.不得从事任何利用、危害或可能危害儿童的活动。
               iii.不得发送垃圾信息。“垃圾信息”指不需要的或未经请
			   求而发送的群发电子邮件、帖子、联系请求、SMS（短信）或即时消息。
               iv.不得公开展示或使用服务共享不当内容或材料（例如，涉及裸体、
			   兽行、色情、攻击性语言、暴力画面或犯罪活动）以及不符合当地法律或法规要求的您的内容或材料。
               v.不得从事欺诈、虚假或误导性活动（例如，编造虚假理由索要现金，假冒他人，操纵
			   服务以增加播放计数或影响排名、评分或评论）或者中伤或诽谤活动。
               vi.不得规避服务的任何访问或可用性限制。
               vii.不得从事对您、服务或他人有害的活动（例如，传播病毒、跟踪、发布恐怖主义或暴力极端主义内容、
			   散播仇恨言论或鼓吹对他人实施暴力行为）。
               viii.不得侵犯他人的权利（例如，未经授权分享受版权保护的音乐或其他受版权保护的材料，转售或分销 Bing 地图或照片）。
               ix.不得从事侵犯他人隐私或数据保护权利的活动。
               x.不得帮助他人违反这些规则。</h1>
		   
		   <div class="btn_nav">
			  <input type="button" class="next right" value="我同意&raquo;" />
		   </div>
		</div>
		<div class="page">
		   <h3>填写信息<br/><em>请告诉我们相关信息。</em></h3>
		   <p><label>您的开发系统名称：</label><input type="text" class="input" name="" /></p>
		   <p><label>您的系统描述：</label><input type="text" class="input" name="" /></p>
		   <div class="btn_nav">
			  <input type="button" class="prev" style="float:left" value="&laquo;上一步" />
			  <input type="button" class="next right" value="发送申请&raquo;" />
		   </div>
		</div>
		<div class="page">
		   <h3>完成<br/><em>点击确定完成注册。</em></h3>
		   <h4>TN云欢迎您！</h4>
		   <p>请点击“确定”按钮完成注册。</p>
		   <br/>
		   <br/>
		   <br/>
		   <div class="btn_nav">
			  <input type="button" class="prev" style="float:left" value="&laquo;上一步" />
			  <input type="button" class="next right" id="sub" value="确定" />
		   </div>
		</div>
	</div>
</div>
</form>

<script type="text/javascript">
$(function(){

	$("#wizard").scrollable({
		onSeek: function(event,i){
			$("#status li").removeClass("active").eq(i).addClass("active");
		},
		onBeforeSeek:function(event,i){
			if(i==1){
				var user = $("#user").val();
				if(user==""){
					alert("请输入用户名！");
					return false;
				}
				var pass = $("#pass").val();
				var pass1 = $("#pass1").val();
				if(pass==""){
					alert("请输入密码！");
					return false;
				}
				if(pass1 != pass){
					alert("两次密码不一致！");
					return false;
				}
			}
		}
	});
	
	$("#sub").click(function(){
		var data = $("form").serialize();
		alert(data);
	});
	
});
</script>

</body>
</html>
