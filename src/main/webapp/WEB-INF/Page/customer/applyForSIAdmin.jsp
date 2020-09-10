<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="utf-8">
    <title>申请入住</title>
    <meta name="renderer" content="webkit">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="stylesheet" type="text/css" href="https://www.layuicdn.com/layui/css/layui.css"/>
    <link href="../../../step-lay/step.css" rel="stylesheet">
</head>
<body>
<div class="layui-fluid">
    <div class="layui-card">
        <div class="layui-card-body" style="padding-top: 40px;">
            <div class="layui-carousel" id="stepForm" lay-filter="stepForm" style="margin: 0 auto;">
                <div carousel-item>
                    <div>
                        <form class="layui-form"
                              style="margin: 0 auto;max-width: 460px;padding-top: 40px; padding-right:5%">
                            <div class="layui-form-item">
                                <label class="layui-form-label">入驻协议:</label>
                                <div class="layui-input-block">
                                    <div class="layui-form-mid layui-word-aux">
                                        <span style="font-size: 15px;color: #333;">请仔细阅读</span>
                                    </div>
                                </div>
                            </div>
                            <div style="color: #666;margin-bottom: 40px;padding-left: 30px; font-size:10px;">
                                <p>一旦同意这些条款，即表示您同意在使用服务时遵守以下规则：
                                    i.不得从事任何非法活动。<br>
                                    ii.不得从事任何利用、危害或可能危害儿童的活动。<br>
                                    iii.不得发送垃圾信息。“垃圾信息”指不需要的或未经请求而发送的群发电子邮件、帖子、联
                                    系请求、SMS（短信）或即时消息。<br>
                                    iv.不得公开展示或使用服务共享不当内容或材料（例如，涉及裸体、兽行、色情、攻击性语言、
                                    暴力画面或犯罪活动）以及不符合当地法律或法规要求的您的内容或材料。<br>
                                    v.不得从事欺诈、虚假或误导性活动（例如，编造虚假理由索要现金，假冒他人，操纵
                                    服务以增加播放计数或影响排名、评分或评论）或者中伤或诽谤活动。<br>
                                    vi.不得规避服务的任何访问或可用性限制。<br>
                                    vii.不得从事对您、服务或他人有害的活动（例如，传播病毒、跟踪、发布恐怖主义或暴力极端主义内容、
                                    散播仇恨言论或鼓吹对他人实施暴力行为）。<br>

                            </div>
                            <div class="layui-form-item">
                                <div class="layui-input-block">
                                    <div style="text-align: center;">
                                        <button class="layui-btn" lay-submit lay-filter="formStep">
                                            &emsp;下一步&emsp;
                                        </button>
                                    </div>
                                </div>
                            </div>
                        </form>
                    </div>
                    <div carousel-item>

                        <div>
                            <form class="layui-form"
                                  style="margin: 0 auto;max-width: 460px;padding-top: 40px;padding-right:10%">

                                <div class="layui-form-item">
                                    <label class="layui-form-label">系统名称:</label>
                                    <div class="layui-input-block">
                                        <textarea placeholder="名称" value="" class="layui-textarea"></textarea>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">系统描述:</label>
                                    <div class="layui-input-block">
                                        <textarea placeholder="描述" value="" class="layui-textarea"  id="si_introduction"></textarea>
                                    </div>
                                </div>


                                <div class="layui-form-item">
                                    <div class="layui-input-block">
                                        <button type="button" class="layui-btn layui-btn-primary pre">上一步</button>
                                        <button class="layui-btn" lay-submit lay-filter="formStep2" style="float:right" id="SI_apply_submit">
                                            &emsp;确认&emsp;
                                        </button>
                                    </div>
                                </div>
                            </form>
                        </div>

                    </div>
                    <div>
                        <div style="text-align: center;margin-top: 90px;">
                            <i class="layui-icon layui-circle"
                               style="color: white;font-size:30px;font-weight:bold;background: #52C41A;padding: 20px;line-height: 80px;">&#xe605;</i>
                            <div style="font-size: 24px;color: #333;font-weight: 500;margin-top: 30px;">
                                提交成功
                            </div>
                            <div style="font-size: 14px;color: #666;margin-top: 20px;">您已成为开发商</div>
                        </div>
                        <div style="text-align: center;margin-top: 50px;">
                            <button class="layui-btn" onclick="returnfore()">回到首页</button>
                        </div>
                    </div>
                </div>
            </div>
            <hr>
            <div style="color: #666;margin-top: 30px;margin-bottom: 40px;padding-left: 30px;">
                <h3>说明</h3><br>
                <p>若开发商产品出现对系统本身进行恶意攻击等违法行为，我们会对相关账户进行封停，请注意个人行为</p>
            </div>
        </div>
    </div>
</div>
<script src="https://www.layuicdn.com/layui/layui.js"></script>
<script src="../../../step-lay/step.js"></script>
<script src="../../../js/前台js/jquery.min.js"></script>
<script src="../../../js/前台js/jquery-3.0.0.min.js"></script>
<script>
    layui.config({
        base: 'step-lay/'
    }).use(['form', 'step'], function () {
        var $ = layui.$
            , form = layui.form
            , step = layui.step;
        step.render({
            elem: '#stepForm',
            filter: 'stepForm',
            width: '100%', //设置容器宽度
            stepWidth: '750px',
            height: '500px',
            stepItems: [{
                title: '入驻协议'
            }, {
                title: '填写信息'
            }, {
                title: '完成'
            }]
        });
        form.on('submit(formStep)', function (data) {
            step.next('#stepForm');
            return false;
        });
        form.on('submit(formStep2)', function (data) {
            step.next('#stepForm');
            return false;
        });
        $('.pre').click(function () {
            step.pre('#stepForm');
        });
        $('.next').click(function () {
            step.next('#stepForm');
        });
    })


    function returnfore() {
        window.location.href="/frontPage";
    }

</script>
<script>
    $("#SI_apply_submit").click(function () {
        var data={
            "si_phone":"${customer.phone}",
            "si_introduction":$("#si_introduction").val()
        }
        $.ajax({
            type: "POST",
            url: "/SIApplylist/customerSIApply_post",
            contentType: "application/json; charset=utf-8",
            data: JSON.stringify(data),
            dataType:"text",
            async: "false",
            success: function (result) {
                console.log("服务器请求成功"+result);
            },
            error: function () {
                console.log("404 服务器请求失败");
            }
        })
    })
</script>
</body>
</html>

