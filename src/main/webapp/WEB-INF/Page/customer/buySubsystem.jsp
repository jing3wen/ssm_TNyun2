<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>  

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>付款</title>
    <meta name="renderer" content="webkit">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">    
    <link rel="stylesheet" type="text/css" href="https://www.layuicdn.com/layui/css/layui.css" />
    <link href="step-lay/step.css" rel="stylesheet">
</head>
<body>
    <div class="layui-fluid">
        <div class="layui-card">
            <div class="layui-card-body" style="padding-top: 40px;">
                <div class="layui-carousel" id="stepForm" lay-filter="stepForm" style="margin: 0 auto;">
                    <div carousel-item>
                        <div>
                            <form class="layui-form" style="margin: 0 auto;max-width: 460px;padding-top: 40px;">
                                <div class="layui-form-item">
                                    <label class="layui-form-label">系统名称:</label>
                                    <div class="layui-input-block">
                                        <div  class="layui-form-mid layui-word-aux" >
                                            <span style="font-size: 15px;color: #333;">TNyun超市子系统</span>
                                        </div>   
                                    </div>
                                </div> 
                                <div class="layui-form-item">
                                    <label class="layui-form-label">系统描述:</label>
                                    <div class="layui-input-block">                                    
                                        <div  class="layui-form-mid layui-word-aux" >
                                            云超市，是一种社区电子商务的交易形式，即网上预定和下单、线下快速到货的一种超市形式
                                        </div>   
                                    </div>
                                </div>                            
                                <div class="layui-form-item">
                                    <label class="layui-form-label">购买时长:</label>
                                    <div class="layui-input-block">
                                        <select lay-verify="required">
                                            <option value="1" selected>1个月</option>
                                            <option value="2">2个月</option>
                                            <option value="2">6个月</option>
                                            <option value="2">12个月</option>
                                        </select>
                                    </div>
                                </div>                      
                                
                                <div class="layui-form-item">
                                    <label class="layui-form-label">备注说明:</label>
                                    <div class="layui-input-block">
                                        <textarea placeholder="入款备注" value="" class="layui-textarea"></textarea>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <div class="layui-input-block">
                                        <button class="layui-btn" lay-submit lay-filter="formStep">
                                            &emsp;下一步&emsp;
                                        </button>
                                    </div>
                                </div>
                            </form>
                        </div>
                        <div class="layui-row">
                            <div class="layui-col-md5">
                                <img src="images/万能收款码.jpg" style="width: 300px; height: auto;  padding-left: 60%;">
                            </div> 
                            <div class="layui-col-md5">
                                <form class="layui-form" style="margin: 0 auto;max-width: 460px;padding-top: 40px; padding-left: 10%;">
                                    <div class="layui-form-item">
                                        <label class="layui-form-label">电话号码:</label>
                                        <div class="layui-input-block">
                                            <div class="layui-form-mid layui-word-aux">
                                                <span style="color: #333;">13953743132</span>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="layui-form-item">
                                        <label class="layui-form-label">名称:</label>
                                        <div class="layui-input-block">
                                            <div class="layui-form-mid layui-word-aux">
                                                <span style="color: #333;">诺娃</span>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="layui-form-item">
                                        <label class="layui-form-label">付款金额:</label>
                                        <div class="layui-input-block">
                                            <div class="layui-form-mid layui-word-aux">
                                                <span style="color: #333;">1800 元</span>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="layui-form-item">
                                        <label class="layui-form-label">付款类型:</label>                                    
                                        <div class="layui-input-block">
                                            <select lay-verify="required">
                                                <option value="1" selected>微信</option>
                                                <option value="2">支付宝</option>
                                                <option value="2">云闪付</option>                                       
                                            </select>
                                        </div>
                                    </div>                               
                                    <div class="layui-form-item">
                                        <label class="layui-form-label">备注说明:</label>
                                        <div class="layui-input-block">
                                            <div class="layui-form-mid layui-word-aux">备注说明</div>
                                        </div>
                                    </div>
                                    <div class="layui-form-item">
                                        <div class="layui-input-block">
                                            <button type="button" class="layui-btn layui-btn-primary pre">上一步</button>
                                            <button class="layui-btn" lay-submit lay-filter="formStep2">
                                                &emsp;确认付款&emsp;
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
                                    付款成功
                                </div>
                                <div style="font-size: 14px;color: #666;margin-top: 20px;">您已成为该系统企业用户</div>
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
                    <h4>售后问题</h4>
                    <p>本产品若质量不满意请在15天内与开发商联系，可以进行退款，超过此期限或对系统本身进行恶意攻击将无法退款</p>
                    <br><h4>注意问题</h4>
                    <p>若客户出现对系统本身进行恶意攻击等违法行为，我们会对相关账户进行封停，请注意个人行为</p>
                </div>
            </div>
        </div>
    </div>
    <script src="https://www.layuicdn.com/layui/layui.js"></script>
    <script src="step-lay/step.js"></script>
    <script>
        layui.config({
            base:'step-lay/'
        }).use([ 'form', 'step'], function () {
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
                    title: '系统信息'
                }, {
                    title: '付款信息'
                }, {
                    title: '付款完成'
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
            window.location.href="${pageContext.request.contextPath}/";
        }
    </script>
</body>
</html>
