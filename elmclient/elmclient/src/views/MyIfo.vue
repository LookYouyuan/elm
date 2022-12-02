<template>
	<div class="wrapper">

		<!-- header部分 -->
		<header>
		<div>
		<img style=" margin-left:10%; width:100px;
                                 height: 100%;
                                 border-radius: 50%;"
                                 src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAHgAAAB4CAMAAAAOusbgAAAAM1BMVEXE5/XI6fbT7fjW7/jl9fvw+f3////a8Pnt+PzL6vb7/v7i8/rP7Pf4/P7e8vn0+/3p9vvI4mwRAAACI0lEQVR4Ae3YBxbkIAgGYDCKgqbc/7LbS5hJexvMNr7Xp/0j9oBzzjnnnHPOuX8Qhq/wycwhJvopxQGfSM2F3pXcOZuj0DaJDN1gpSMRoY9B6Jhk6AALnSsI1tpIV0jrX+ZHyp3putwzN9XA8BmHmvolN1LGCWENp5GUADZYVGyGd1lFC4OJmVYqbKu0MoOFem22TPrv3cf004ywa6A1htvStdw2Go+vcC03C5EuzV3pSv/iQsqCllN4gj1tJmWC+342JV1dx8cGBuR8nEbznVHNkQW28UxKBeV+pRtsCrrMEsDGeLIIVlISgg08HqiYSIlgJRxWuoku8wA2VCU3dwVlZugQnE4PnYt+t05wR6FvysmeIPltrC8mC3U97t65bRQq9whO23uC6gRp9sFMa9NOJ8z2wWF3T1BvDfdXzLLb4oL7a1m9P53mq50PwSR42ltA2v6eEC2uFGH38Ja39wRVDUGDTSJudH+ETSg3G6wuESO8anxSpww3xF+aGvX+yWvQZ72rohQ0O+wFeI6q9QiPYr0cPGih31Rs1pfjBy2/KxnlYjJPtTYwNFy7CE5CnyzGxf4pMWzhQkTWyTjTWkV4hVW6PNhjIWUZdF+okgiDnSakSakhMHAItQhpAXom7xN+8nG1OnTawkRXJARzlc5V6KElOpYadJJH2jdm6CjPtG3O0FmL780eY4MncI5J6CtJMTM8iwODc84555xzzv0PPgKMKi2olgNo0QAAAABJRU5ErkJggg==">

		</div>

		<div style="margin-left:10%; margin-right:auto" @click="toUpdateUser()">


             <p  >{{user.userName}}</p>
        </div>

		</header>



		<!-- 个人信息部分 -->

        <div class="order-info">
               			<h5>我的地址：</h5>
               			<div class="order-info-address" @click="toUserAddress">
               				<p>请选择地址</p>
               				<i class="fa fa-angle-right"></i>
               			</div>

        </div>

        <div class="order-info-list">
        <h5>&nbsp</h5>
                       			<div class="order-info-address"  onclick="window.open('https://tb.ele.me/wow/zele/act/supervip-sell?wh_biz=tm&spm=a2ogi.13147251.svip.1&spm-pre=a2ogi.12075425.0.0&geohash=wwecmju9xnfy','_self')">
                       				<p>开通会员</p>
                       				<i class="fa fa-angle-right"></i>
                       			</div>

                </div>
        <div class="button-login">
            <button @click="toUpdateUser()">修改个人信息</button>
        </div>


		<!-- 底部菜单部分 -->
		<Footer></Footer>

	</div>
</template>



<script>
	import Footer from '../components/Footer.vue';

	export default{
		name:'OrderList',
		data(){
			return {
				orderArr:[],
				user:{}
			}
		},
		created() {
			this.user = this.$getSessionStorage('user');

			this.$axios.post('OrdersController/listOrdersByUserId',this.$qs.stringify({
				userId:this.user.userId
			})).then(response=>{
				let result = response.data;
				for(let orders of result){
					orders.isShowDetailet = false;
				}
				this.orderArr = result;
			}).catch(error=>{
				console.error(error);
			});
		},
		methods:{
		    toUserMsg(){
                				this.$router.push({path:'/UserMsg'});
                			},
		    toUserAddress(){
            				this.$router.push({path:'/userAddress',query:{businessId:this.businessId}});
            			},
			detailetShow(orders){
				orders.isShowDetailet = !orders.isShowDetailet;
			},
			toPayment(orderId){
				this.$router.push({path:'/payment',query:{orderId:orderId}});
			},
			toUpdateUser(){
			    this.$router.push({path: '/updateUser'})
			}
		},
		components:{
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
		height: 30vw;
		background-color: #0097FF;
		color: #fff;
		font-size: 4.8vw;

		position: fixed;
		left: 0;
		top: 0;
		z-index: 1000;

		display: flex;
		justify-content: left;
		align-items: center;
	}
/****************** 订单信息部分 ******************/
	.wrapper .order-info {
		/*注意这里，不设置高，靠内容撑开。因为地址有可能折行*/
		width: 100%;
		margin-top: 33vw;
		background-color: #99ccff;
		box-sizing: border-box;
		padding: 2vw;
		color: #fff;
	}

	.wrapper .order-info h5 {
		font-size: 3vw;
		font-weight: 300;
	}

	.wrapper .order-info .order-info-address {
		width: 100%;
		display: flex;
		justify-content: space-between;
		align-items: center;

		font-weight: 700;
		user-select: none;
		cursor: pointer;
		margin: 1vw 0;
	}

	.wrapper .order-info .order-info-address p {
		width: 90%;
		font-size: 5vw;
	}

	.wrapper .order-info .order-info-address i {
		font-size: 6vw;
	}

	.wrapper .order-info p {
		font-size: 3vw;
	}

	.wrapper h3 {
		box-sizing: border-box;
		padding: 3vw;
		font-size: 4vw;
		color: #666;
		border-bottom: solid 1px #DDD;
	}
/****************** 订单信息部分 ******************/
	.wrapper .order-info-list {
		/*注意这里，不设置高，靠内容撑开。因为地址有可能折行*/
		width: 100%;
		height: 17vw;
		margin-top: 3vw;
		background-color: #99ccff;
		box-sizing: border-box;
		padding: 2vw;
		color: #fff;
	}

	.wrapper .order-info-list h5 {
		font-size: 3vw;
		font-weight: 300;
	}

	.wrapper .order-info-list .order-info-address {
		width: 100%;
		display: flex;
		justify-content: space-between;
		align-items: center;

		font-weight: 700;
		user-select: none;
		cursor: pointer;
		margin: 1vw 0;
	}

	.wrapper .order-info-list .order-info-address p {
		width: 90%;
		font-size: 5vw;
		margin-top: 3vw;
	}

	.wrapper .order-info-list .order-info-address i {
		font-size: 6vw;
		margin-top: 3vw;
		margin-top: 3vw;
	}

	.wrapper .order-info-list p {
		font-size: 3vw;
		margin-top: 3vw;
	}

    .wrapper .button-login button {
            width: 100%;
            height: 10vw;
            font-size: 3.8vw;
            font-weight: 700;
            color: #fff;
            background-color: #38CA73;
            border-radius: 4px;
            margin-top: 10px;
            border: none;
            outline: none;
        }

</style>



