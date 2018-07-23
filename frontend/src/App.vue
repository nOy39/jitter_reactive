<template>

  <div id="app" class="bg-app">
    <navi v-bind:isAuthenticated="isAuthenticated"
          v-on:login="login()"/>
    <search/>
    <router-view class="router"
                 v-bind:isAuthenticated="isAuthenticated"/>
    <bottom-menu v-show="isAuthenticated"/>
  </div>
</template>

<script>
import Navi from "./components/parts/Navbar";
import BottomMenu from "./components/parts/BottomMenu";
import Search from "./components/parts/Search";
export default {
  name: 'app',
  components: {Search, BottomMenu, Navi},
  data() {
    return {
      msg: 'Сообщение из вью',
      isAuthenticated: false,
    };
  },
  methods: {
    login(){
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

  .router{
    position: absolute;
    margin-top: 100px;
  }

</style>
