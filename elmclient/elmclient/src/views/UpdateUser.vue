<template>
	<div class="wrapper">

            <!-- header部分 -->
            <header>
                <p>修改个人信息</p>
            </header>

            <!-- 表单部分 -->
            <ul class="form-box">
                <li>
                    <div class="title">
                        用户名：
                    </div>
                    <div class="content">
                        <input type="text" v-model="users.userName" >
                    </div>
                </li>
                <li>
                    <div class="title">
                        密码：
                    </div>
                    <div class="content">
                        <input type="password" v-model="users.password">
                    </div>
                </li>
                <li>
                    <div class="title">
                        确认密码：
                    </div>
                    <div class="content">
                        <input type="password" v-model="confirmPassword">
                    </div>
                </li>
                <li>
                    <div class="title">
                        性别：
                    </div>
                    <div class="content" style="font-size: 3vw;">
                        <input type="radio" v-model="users.userSex" value="1" style="width:6vw;height: 3.2vw;">男
                        <input type="radio" v-model="users.userSex" value="0" style="width:6vw;height: 3.2vw;">女
                    </div>
                </li>
            </ul>

            <div class="button-login">
                <button @click="update">保存</button>
            </div>

            <!-- 底部菜单部分 -->
            <Footer></Footer>
        </div>
</template>

<script>
	import Footer from '../components/Footer.vue';

        export default {
            name: 'UpdateUser',
            data() {
                return {
                    users:{
                        userId: '1',
                        userName: '优雅永不过时',
                        password:'',
                        userSex: '0'
                    },
                    confirmPassword:''
                }
            },
            methods: {
                checkUserId(){
                    this.$axios.post('UserController/getUserById', this.$qs.stringify({
                        userId: this.users.userId,
                    })).then(response => {
                        this.users = response.data;
                    }).catch(error => {
                        console.error(error);
                    });
                },
                updateUser(){
                			//登录请求
                				this.$axios.post('UserController/getUserByIdByPass',this.$qs.stringify({
                					userId:this.users.userId,
                					password:this.users.password
                				})).then(response=>{
                					let user = response.data;
                					if(user==null){
                						alert('用户名或密码不正确！');
                					}else{
                						//sessionstorage有容量限制，为了防止数据溢出，所以不将userImg数据放入session中
                						user.userImg = '';
                						this.$setSessionStorage('user',user);

                						//this.$router.go(-1);
                					}
                				}).catch(error=>{
                					console.error(error);
                				});
                },

                update() {

                    if (this.users.password == '') {
                        alert('密码不能为空！');
                        return;
                    }
                    if (this.users.password != this.confirmPassword) {
                        alert('两次输入的密码不一致！');
                        return;
                    }
                    if (this.users.userName == '') {
                        alert('用户名不能为空！');
                        return;
                    }
                    //alert(this.users.userId)
                    
                    //注册请求
                    this.$axios.post('UserController/updateUser', this.$qs.stringify(
                        this.users
                    )).then(response => {
                        if(response.data>0){
                            alert('修改成功！');
                            this.updateUser()

                            this.$router.go(-1);
                        }else{
                            alert('修改失败！');
                        }
                    }).catch(error => {
                        console.error(error);
                    });
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

    /****************** 表单部分 ******************/
    .wrapper .form-box {
        width: 100%;
        margin-top: 12vw;
    }

    .wrapper .form-box li {
        box-sizing: border-box;
        padding: 4vw 3vw 0 3vw;
        display: flex;
        align-items: center;
    }

    .wrapper .form-box li .title {
        flex: 0 0 18vw;
        font-size: 3vw;
        font-weight: 700;
        color: #666;
    }

    .wrapper .form-box li .content {
        flex: 1;
    }

    .wrapper .form-box li .content input {
        border: none;
        outline: none;
        width: 100%;
        height: 4vw;
        font-size: 3vw;
    }

    .wrapper .button-login {
        width: 100%;
        box-sizing: border-box;
        padding: 4vw 3vw 0 3vw;
    }

    .wrapper .button-login button {
        width: 100%;
        height: 10vw;
        font-size: 3.8vw;
        font-weight: 700;
        color: #fff;
        background-color: #38CA73;
        border-radius: 4px;

        border: none;
        outline: none;
    }

    .wrapper .button-register {
        width: 100%;
        box-sizing: border-box;
        padding: 4vw 3vw 0 3vw;
    }

    .wrapper .button-register button {
        width: 100%;
        height: 10vw;
        font-size: 3.8vw;
        font-weight: 700;
        color: #666;
        background-color: #EEE;
        border-radius: 4px;

        border: none;
        outline: none;
        border: solid 1px #DDD;
    }
</style>
