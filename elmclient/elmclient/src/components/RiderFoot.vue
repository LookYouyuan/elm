<template>
    <div class="wrapperr">
    <ul class="footer">
        <li @click="toIndex">
            <i class="fa fa-home"></i>
            <p>接单</p>
        </li>

        <li @click="toRiderSent">
            <i class="fa fa-file-text-o"></i>
            <p>配送</p>
        </li>
        <li @click="toTongJi">
            <i class="fa fa-user-o"></i>
            <p>订单统计</p>
        </li>
    </ul>
    </div>
</template>

<script>
    export default {
        name: "RiderFoot",
        methods:{
            toIndex(){
                this.$router.push({path:'/riderIndex'});
            },
            toRiderSent(){
                this.$router.push({path:'/riderSent'});
            },
            toTongJi(){
                this.$router.push({path:'/TongJi'});
            }
        }
    }
</script>

<style>
    .wrapperr .footer {
        width: 100%;
        height: 14vw;
        border-top: solid 1px #DDD;
        background-color: #fff;

        position: fixed;
        left: 0;
        bottom: 0;

        display: flex;
        justify-content: space-around;
        align-items: center;
    }

    .wrapperr .footer li {
        /*li本身的尺寸完全由内容撑起*/
        display: flex;
        flex-direction: column;
        justify-content: center;
        align-items: center;

        color: #999;
        user-select: none;
        cursor: pointer;
    }

    .wrapperr .footer li p {
        font-size: 2.8vw;
    }

    .wrapperr .footer li i {
        font-size: 5vw;
    }
</style>