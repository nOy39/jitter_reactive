<template>
    <div class="container">
        <input type="text" v-model="user.username" placeholder="Username"/>
        <input type="password" v-model="user.password" placeholder="Password"/>
        <button type="submit" @click="loginUser">Sign IN</button>
    </div>
  <!--<div v-if="showResponse"><h6>User Log in: {{ response }}</h6></div>-->
</template>

<script>
  import {AXIOS} from './http-common'

    export default {
        name: "Login",
      data() {
          return {
            user: {
              username: '',
              password: '',
            },
            response:[],
            errors:[],
            showResponse: false,
          }
      },
      methods: {
        loginUser() {
          var params = new URLSearchParams();
          params.append('username',this.user.username);
          params.append('password',this.user.password);

          AXIOS.post(`/login`,params)
            .then(response => {
              this.response = response.data;
              this.showResponse = true;
            }).catch(e => {
              this.errors.push(e);
              console.log(e);
          })
            }

      }
    }
</script>

<style scoped>

</style>
