<template>

  <div id="app" class="bg-app">
    <navi/>
    <router-view class="router"/>
  </div>
</template>

<script>
import Navi from "./components/Navbar";
export default {
  name: 'app',
  components: {Navi},
  data() {
    return {
      msg: 'Сообщение из вью',
    };
  },
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

  }
</style>
