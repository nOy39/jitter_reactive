<template>
  <div id="app">
    <navi/>
    <router-view/>
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
    text-align: center;
    color: #2c3e50;
    margin-top: 60px;
  }
</style>
