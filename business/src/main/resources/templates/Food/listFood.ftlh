<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>
        菜单设置
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
              <a><cite>菜单设置</cite></a>
              <a><cite>查看菜单</cite></a>
            </span>
    <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right"  <#--href="query"--> title="刷新"><i class="layui-icon" style="line-height:30px">ဂ</i></a>
</div>
<div class="x-body">

    <xblock><button  class="layui-btn" onclick="window.location.href='toAddFood?businessId=${businessId}'"><i class="layui-icon">&#xe608;</i>添加</button><span class="x-right" style="line-height:40px"></span></xblock>



    <table class="layui-table">
        <thead>
        <tr>
            <th>

            </th>
            <th>
                图片
            </th>
            <th>
                菜名
            </th>
            <th>
                简介
            </th>
            <th>
                价格
            </th>
            <th>
                设置促销策略
            </th>

        </tr>
        </thead>
        <tbody>

        <#list foods as food>
        <tr>
            <td>
                <input type="checkbox" value="1" name="">
            </td>

            <td>
                <img src="${food.foodImg}">
            </td>
            <td>
                ${food.foodName}
            </td>
            <td>
                ${food.foodExplain}
            </td>

            <td>
                ${food.foodPrice}元
            </td>

            <td class="td-manage">

                <a title="修改" href="toUpdateFood?foodId=${food.foodId}"
                   class="ml-5" style="text-decoration:none">
                    <i class="layui-icon">&#xe642;</i>
                </a>

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
