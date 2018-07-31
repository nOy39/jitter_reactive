<template>
  <div id="app" class="bg-app">
    <navi class="navBar"
          :isAuthenticated="isAuthenticated"
          v-on:login="login()"/>
    <router-view class="router"
                 :isAuthenticated="isAuthenticated"
                 :msg="msg"/>
    <bottom-menu v-show="isAuthenticated"/>
  </div>
</template>

<script>
  import Navi from "./components/parts/Navbar";
  import BottomMenu from "./components/parts/BottomMenu";
  import Search from "./components/parts/Search";
  import quickMenu from 'vue-quick-menu';

  export default {
    name: 'app',
    components: {Search, BottomMenu, Navi, quickMenu},
    data() {
      return {
        msg: 'Hello msg from vue',
        isAuthenticated: false,
        icons: [1, 2, 3, 4],
        parentString: 'Родительская строка',
      };
    },
    methods: {
      login() {
        this.isAuthenticated = !this.isAuthenticated;
      }
    }
  };
</script>

<style>
  #app {
    font-family: 'Avenir', Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    color: #2c3e50;
    margin-top: 0px;
  }

  .router {
    position: absolute;
    margin-top: 60px;
    margin-left: 5%;
  }

</style>
