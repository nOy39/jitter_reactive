<template>
  <div class="container">
    <h3>Уроки по Vue.js от Дмитрия Лаврика</h3>
    <hr>
    <div>
      <hr>
      <a class="button" @click="les1Show=!les1Show">Урок 1</a>
      <div class="hide-c" v-show="les1Show">
        <lav-les1></lav-les1>
      </div>
      <hr>
      <a class="button" @click="les2Show=!les2Show">Урок 2</a>
      <div class="hide-c" v-show="les2Show">
        <lav-les2></lav-les2>
      </div>
      <hr>
    </div>
  </div>
</template>

<script>
  import LavLes1 from "./lessons/LavLes1";
  import LavLes2 from "./lessons/LavLes2";

  export default {
    name: "Lavrik",
    components: {LavLes2, LavLes1},
    data() {
      return {
        les1Show: false,
        les2Show: false,
      }
    },
  };
</script>

<style scoped>
  a {
    font-size: 20px;
    line-height: 1.4;
    margin-top: 40px;
    font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, "Helvetica Neue", Arial, sans-serif;
    font-weight: 300;
  }

</style>
