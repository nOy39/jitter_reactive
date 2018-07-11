<template>
  <div class="container">
    <button class="submit" @click="fetchUser">FetchUsers</button>
    <hr>
    Список пользователей:
    <hr>
    <vk-spinner
      v-show="spinner">
    </vk-spinner>
    <div class="card" v-for="usr in users">
      <h2>{{usr.username}}</h2>
      <hr>
      <h4>email: {{usr.email}}</h4>
    </div>
  </div>
</template>

<script>
  import { AXIOS } from './http-common';
  export default {
    name: "Users",
    data() {
      return{
        users:[],
        errors:[],
        spinner: false,
      };
    },
    methods:{
      fetchUser() {
        this.spinner = true;
        AXIOS.get(`/users`)
          .then(response => {
            this.users = response.data;
            this.spinner = false;
          })
          .catch(e => {
            this.errors.push(e)
          })
      }
    }
  }
</script>

<style scoped>

  button {
    background: none;
    color: #000;
    width: 240px;
    height: 80px;
    border: 1px solid #338033;
    font-size: 18px;
    border-radius: 4px;
    transition: .6s;
    overflow: hidden;
  }

  button:focus {
    outline: none;
  }

  button:before {
    content: '';
    display: block;
    position: absolute;
    background: rgba(255,255,255,.5);
    width: 60px;
    height: 100px;
    left: 0;
    top: 0;
    opacity: .5%;
    filter: blur(30px);
    transform: translateX(-130px) skew(-15deg);
  }

  button:after {
    content: '';
    display: block;
    position: absolute;
    background: rgba(255,255,255,.3);
    width: 30px;
    height: 100%;
    left: 30px;
    top: 0;
    opacity: 0;
    filter: blur(30px);
    transform: translate(-100px) scaleX()(-15deg);
  }

  button:hover {
    background: #338033;
    cursor: pointer;
    color: #cccccc;
  }

  button:hover:before {
    transform: translateX(300px) skewX(-15deg);
    opacity: .6;
    transition: .7s;
  }

  button:hover:after {
    transform: translateX(300px) skewX(-15deg);
    opacity: 1;
    transition: .7s;
  }

</style>
