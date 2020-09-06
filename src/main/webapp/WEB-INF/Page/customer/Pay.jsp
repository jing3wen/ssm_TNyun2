<
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
 
<!DOCTYPE html>
<html lang="zh">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>TN云</title>


    <style type="text/css">
        * {
            margin: 0;
            padding: 0;
            list-style-type: none;
        }

        a, img {
            border: 0;
        }

        body {
            font: 12px/180% Arial, Helvetica, sans-serif, "新宋体";
            background-color: #0c0f38;
        }


        #wizard {
            border: 5px solid #789;
            font-size: 12px;
            height: 450px;
            margin: 20px auto;
            width: 570px;
            overflow: hidden;
            position: relative;
            -moz-border-radius: 5px;
            -webkit-border-radius: 5px;
            background-color: #FFFFFF;
        }

        #wizard .items {
            width: 20000px;
            clear: both;
            position: absolute;
        }

        #wizard .right {
            float: right;
        }

        #wizard #status {
            height: 35px;
            background: #123;
            padding-left: 25px !important;
        }

        #status li {
            float: left;
            color: #fff;
            padding: 10px 30px;
        }

        #status li.active {
            background-color: #369;
            font-weight: normal;
        }

        .input {
            width: 240px;
            height: 18px;
            margin: 10px auto;
            line-height: 20px;
            border: 1px solid #d3d3d3;
            padding: 2px
        }

        .page {
            padding: 20px 30px;
            width: 500px;
            float: left;
        }

        .page h3 {
            height: 42px;
            font-size: 16px;
            border-bottom: 1px dotted #ccc;
            margin-bottom: 20px;
            padding-bottom: 5px
        }

        .page h3 em {
            font-size: 12px;
            font-weight: 500;
            font-style: normal
        }

        .page p {
            line-height: 24px;
        }

        .page p label {
            font-size: 14px;
            display: block;
        }

        .btn_nav {
            height: 36px;
            line-height: 36px;
            margin: 20px auto;
        }

        .prev, .next {
            width: 100px;
            height: 32px;
            line-height: 32px;
            border: 1px solid #d3d3d3;
            cursor: pointer
        }

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
<body>
<div class="logo">
    <a href="#"><img src="images/logo2.4.png" alt="#"/></a>
</div>

<form action="#" method="post">
    <div id="wizard">
        <ul id="status">
            <li class="active"><strong>1.</strong>购买服务</li>
            <li><strong>2.</strong>支付</li>
            <li><strong>3.</strong>支付成功</li>
        </ul>
        <div class="items">
            <div class="page">
                <h3>TN云超市<br/><em>您的信息</em></h3>
                <p><label>姓名：</label><input type="text" class="input" name=""/></p>
                <p><label>电话：</label><input type="text" class="input" name=""/></p>
                <p><label>邮箱：</label><input type="text" class="input" name=""/></p>
                <p><label>时长：</label><input type="radio" name="time" value="amonth" checked="checked">1个月
                    <input type="radio" name="time" value="halfyear" checked="checked">半年</p>
                <div class="btn_nav">
                    <input type="button" class="next right" value="支付&raquo;"/>
                </div>
            </div>
            <div class="page">
                <h3>TN云超市<br/><em>请选择支付方式</em></h3>
                <p style="float:left"><a href="#"><img src="../../images/receive.png" alt="#" width="300" height="300"/></a>
                </p>
                <p style="float:right;">
                <table border="0" width="100px" style="font-size:18px;">
                    <tr style="height:20px"></tr>
                    <tr>
                        <td><input type="radio" value="V1" name="R" checked="checked">微信支付</td>
                    </tr>
                    <tr style="height:40px"></tr>
                    <tr>
                        <td><input type="radio" value="V2" name="R" checked="checked">支付宝</td>
                    </tr>
                    <tr style="height:40px"></tr>
                    <tr>
                        <td><input type="radio" value="V3" name="R" checked="checked">其他</td>
                    </tr>
                </table>
                <tr style="height:35px"></tr>
                </p>
                <div class="btn_nav">
                    <input type="button" class="prev" style="float:left" value="&laquo;上一步"/>
                    <input type="button" class="next right" value="支付完成&raquo;"/>
                </div>
            </div>
            <div class="page">
                <h3>完成<br/><em>点击确定完成购买。</em></h3>
                <h4>TN云感谢您的购买！</h4>
                <br/><br/><br/><br/><br/>
                <br/>
                <br/>
                <br/>
                <div class="btn_nav">
                    <input type="button" class="prev" style="float:left" value="&laquo;上一步"/>
                    <input type="button" class="next right" id="sub" value="确定"/>
                </div>
            </div>
        </div>
    </div>
</form>

<script type="text/javascript">
    $(function () {

        $("#wizard").scrollable({
            onSeek: function (event, i) {
                $("#status li").removeClass("active").eq(i).addClass("active");
            },
        }
    });

    $("#sub").click(function () {
        var data = $("form").serialize();
        alert(data);
    });

    })
    ;
</script>

</body>
</html>
