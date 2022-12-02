<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>
        订单管理
    </title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <link rel="stylesheet" href="./css/x-admin.css" media="all">
</head>
<body>
<div class="x-nav">
            <span class="layui-breadcrumb">
              <a><cite>首页</cite></a>
              <a><cite>订单管理</cite></a>
              <a><cite>订单统计</cite></a>
            </span>
    <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right"  <#--href="query"--> title="刷新"><i class="layui-icon" style="line-height:30px">ဂ</i></a>
</div>
<div class="x-body">




    <table class="layui-table">
        <thead>
        <tr>
            <th>

            </th>
            <th>
                顾客手机号
            </th>
            <th>
                下单时间
            </th>
            <th>
                总金额
            </th>
            <th>
                状态
            </th>
            <th>
                接单
            </th>

        </tr>
        </thead>
        <tbody>

        <#list orderss as orders>
        <tr>
            <td>
                <input type="checkbox" value="1" name="">
            </td>

            <td>
                ${orders.userId}
            </td>
            <td>
                ${orders.orderDate}
            </td>
            <td>
                ${orders.orderTotal}
            </td>

            <td>
                <#if orders.orderState == 0>
                    未支付

                    <#elseif orders.orderState == 1>
                    已支付
                    <#elseif orders.orderState == 2>
                    已接单
                    <#elseif orders.orderState == 3>
                    派送中
                    <#elseif orders.orderState == 4>
                    已完成
                </#if>

            </td>


            <td class="td-manage">
                <#if orders.orderState == 1>
                <a title="点击接单" href="toUpdateOrders?orderId=${orders.orderId}"
                   class="ml-5" style="text-decoration:none">
                    <i class="layui-icon">&#xe642;</i>
                </a>点击接单
                    <#elseif orders.orderState == 0>
                    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp等待支付
                </#if>
            </td>

            </#list>


        </tr>
        </tbody>
    </table>

    <div id="page"></div>
</div>
<script src="./lib/layui/layui.js" charset="utf-8"></script>
<script src="./js/x-layui.js" charset="utf-8"></script>
<script>
    layui.use(['laydate','element','laypage','layer'], function(){
        $ = layui.jquery;//jquery

        lement = layui.element();//面包导航
        laypage = layui.laypage;//分页
        layer = layui.layer;//弹出层

        //以上模块根据需要引入

        laypage({
            cont: 'page'
            ,pages: 1
            ,first: 1
            ,last: 1
            ,prev: '<em><</em>'
            ,next: '<em>></em>'
        });



    });


    /*用户-添加*/

    function department_add(title,url,w,h){
        x_admin_show(title,url,w,h);
    }


    function department_search(){
        "form".attr("action","queryPositionByName").submit();
    }

    function member_del (title,url,id,w,h) {
        x_admin_show(title,url,w,h);
    }
    // 用户-编辑
    function member_edit (title,url,id,w,h) {
        x_admin_show(title,url,w,h);
    }
</script>
<script>
    var _hmt = _hmt || [];
    (function() {
        var hm = document.createElement("script");
        hm.src = "https://hm.baidu.com/hm.js?b393d153aeb26b46e9431fabaf0f6190";
        var s = document.getElementsByTagName("script")[0];
        s.parentNode.insertBefore(hm, s);
    })();
</script>
</body>
</html>
