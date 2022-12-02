<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <title>
        增加菜品
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
<div class="x-body">
    <form class="layui-form" action="doAddFood"<#--?food=${food}"--><#--?Food=${food}-->>


        <div >

            <input type="hidden" name = "foodImg" value="null">


        </div>
        <div class="layui-form-item">
            <label for="L_city" class="layui-form-label">
                菜名
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_city" name="foodName" autocomplete="off" placeholder="菜名"
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_city" class="layui-form-label">
                简介
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_city" name="foodExplain" autocomplete="off" placeholder="简介"
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_city" class="layui-form-label">
                价格
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_city" name="foodPrice" autocomplete="off" placeholder="价格"
                       class="layui-input">
            </div>
        </div>

        <div >

            <input type="hidden" name = "businessId" value="${business.businessId}">


        </div>
        <#--<div class="layui-form-item">
            <label class="layui-form-label">餐厅</label>
            <div class="layui-input-inline" >
                <select name="businessId">
                    <#if businesss ?? && (businesss?size>0)>
                        <#list businesss as business>

                            <option value="${business.business}"></option>

                        </#list>
                    <#else >
                    </#if>

                </select>
            </div>
        </div>-->

        <div class="layui-form-item">
            <label for="L_sign" class="layui-form-label">
            </label>
            <button  class="layui-btn" key="set-mine" lay-filter="save" lay-submit onclick="location.replace(document.referrer);">
                保存
            </button>
        </div>
    </form>
</div>
<script src="./lib/layui/layui.js" charset="utf-8">
</script>
<script src="./js/x-layui.js" charset="utf-8">
</script>
<script>
    layui.use(['laydate','form','layer'], function(){
        $ = layui.jquery;
        laydate = layui.laydate;
        var form = layui.form()
            ,layer = layui.layer;
        var start = {
            min: laydate.now()
            ,max: '2099-06-16 23:59:59'
            ,istoday: false
        };

        document.getElementById('date').onclick = function(){
            start.elem = this;
            laydate(start);
        }


    });
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