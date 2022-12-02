<template>
    <div class="wrapperr">
        <header>骑手</header>

        <!-- 接单列表部分 -->
        <ul class="business">
            <li v-for="item in orderArr" >
                <div class="business-info" >
                   <!-- <h3>{{item.DeliveryAddress.address}}</h3>
                    <h3>{{item.DeliveryAddress.contactName}}</h3>
                    <h3>{{item.DeliveryAddress.contactTel}}</h3>-->

                    <h3>订单号{{item.orderId}}</h3>

                    <button @click="songda(item.orderId)">确认送达</button>
                </div>
            </li>
        </ul>

        <RiderFoot></RiderFoot>
    </div>
</template>

<script>

    import RiderFoot from "../components/RiderFoot";

    export default {
        name: "RiderIndex",
        data(){
            return {
                orderArr:[],
                user:{},
            }
        },
        created() {
            this.user = this.$getSessionStorage('user');

            //根据orderId查询
            this.$axios.post('OrdersController/querySending',this.$qs.stringify({
            })).then(response=>{
                this.orderArr = response.data;
            }).catch(error=>{
                console.error(error);
            });
        },
        methods:{
            songda(orderId){
                this.$axios.post('OrdersController/ysd',this.$qs.stringify({
                    orderId: orderId
                })).then(response=>{
                    if (response.data == 1){
                        this.$router.go(-1);
                    }
                }).catch(error=>{
                    console.error(error);
                })
            }
        },
        components:{
            RiderFoot
        }
    }
</script>

<style>
    /****************** 总容器 ******************/
    .wrapperr {
        width: 100%;
        height: 100%;
    }

    /****************** header部分 ******************/
    .wrapperr header {
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

    /****************** 商家列表部分 ******************/
    .wrapperr .business {
        width: 100%;
        margin-top: 12vw;
        margin-bottom: 14vw;
    }

    .wrapperr .business li {
        width: 100%;
        box-sizing: border-box;
        padding: 2.5vw;
        border-bottom: solid 1px #DDD;
        user-select: none;
        cursor: pointer;

        display: flex;
        align-items: center;
    }


    .wrapperr .business li .business-info {
        width: 100%;
        margin-left: 3vw;
        display: flex;
        align-items: center;
        justify-content: space-between;
    }

    .wrapperr .business li .business-info h3 {
        font-size: 4.5vw;
        color: #555;
    }

    .wrapperr .business li .business-info button {
        width: 75px;
        height: 30px;
        font-size: 3vw;
        color: #F5F5F5;
        margin-top: 2vw;
        background-color: #0097EF;

    }
</style>