<template>
    <div class="wrapper">
        <!-- header部分 -->
        <header>
            <p>二维码</p>
        </header>

        <!-- 订单信息部分 -->
        <h3>请扫描</h3>

            <!-- 显示二维码 -->
            <ul class="payment-type">
                <li v-show="isPayType">
                    <i>支付宝</i>
                    <img src="../assets/alipay.png">
                </li>
                <li v-show="!isPayType">
                    <i>微信</i>
                    <img src="../assets/wechat.png">
                </li>
            </ul>
            <div class="payment-button">
                <button @click="toUpdateOrderState">确认支付</button>
            </div>
        <!-- 底部菜单部分 -->
        <Footer></Footer>
    </div>
</template>
<script>
    import Footer from "../components/Footer";

    export default {
        name: "PayRst",
        //data:function(){
        data(){
            return {
                isPayType:this.$route.query.isPayType,
                orderId:this.$route.query.orderId
            }
        },
        methods:{
            toUpdateOrderState(){
                this.$axios.post("OrdersController/updateOrderState",
                    this.$qs.stringify({orderId:this.orderId}))
                .then(response=>{
                    if(response.data>0){
                        alert("支付成功！");
                        this.router.push({path:"/index"})
                    }else{
                        alert("支付失败！");
                    }
                }).catch(ex=>{
                    console.log(ex)
                })
            }
        },
        components: {
            Footer
        }
    }
</script>

<style scoped>
    /****************** 总容器 ******************/
    .wrapper {
        width: 100%;
        height: 100%;
    }

    /****************** header部分 ******************/
    .wrapper header {
        width: 100%;
        height: 12vw;
        background-color: #0097FF;
        color: #fff;
        font-size: 4.8vw;

        position: fixed;
        left: 0;
        top: 0;
        z-index: 1000;

        display: flex;
        justify-content: center;
        align-items: center;
    }

    /****************** 订单信息部分 ******************/
    .wrapper h3 {
        margin-top: 12vw;
        box-sizing: border-box;
        padding: 4vw 4vw 0;

        font-size: 4vw;
        font-weight: 300;
        color: #999;
    }

    .wrapper .order-info {
        box-sizing: border-box;
        padding: 4vw;
        font-size: 4vw;
        color: #666;

        display: flex;
        justify-content: space-between;
        align-items: center;
    }

    .wrapper .order-info p:last-child {
        color: orangered;
    }

    /****************** 订单明细部分 ******************/
    .wrapper .order-detailet {
        width: 100%;
    }

    .wrapper .order-detailet li {
        width: 100%;
        box-sizing: border-box;
        padding: 1vw 4vw;

        display: flex;
        justify-content: space-between;
        align-items: center;
    }

    .wrapper .order-detailet li p {
        font-size: 3vw;
        color: #666;
    }

    /****************** 支付方式部分 ******************/
    .wrapper .payment-type {
        width: 100%;
    }

    .wrapper .payment-type li {
        width: 100%;
        box-sizing: border-box;
        padding: 4vw;

        display: flex;
        justify-content: space-between;
        align-items: center;
    }

    .wrapper .payment-type li img {
        width: 33vw;
        height: 8.9vw;
    }

    .wrapper .payment-type li .fa-check-circle {
        font-size: 5vw;
        color: #38CA73;
    }

    .wrapper .payment-button {
        width: 100%;
        box-sizing: border-box;
        padding: 4vw;
    }

    .wrapper .payment-button button {
        width: 100%;
        height: 10vw;
        border: none;
        /*去掉外轮廓线*/
        outline: none;
        border-radius: 4px;
        background-color: #38CA73;
        color: #fff;
    }
</style>