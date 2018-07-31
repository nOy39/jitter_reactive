<template>
  <div class="main">
    <h3 class="counter">Counter with Vuex</h3>
    <counter></counter>
    <second-counter></second-counter>
    <action></action>
  </div>

</template>

<script>
  import Hamburger from "./parts/Hamburger";
  import Search from "./parts/Search";
  import Counter from "./Counter";
  import Action from "./Action";
  import SecondCounter from "./SecondCounter";

  export default {
    props: {
      msg: String
    },
    components: {SecondCounter, Action, Counter, Search, Hamburger},
    data() {
      return {
        active: false,
        iconStatus: 'icon',
      }
    },
    methods: {
      setActive() {
        this.active = !this.active;
        if (!this.active) {
          return this.iconStatus = 'icon active';
        } else {
          return this.iconStatus = 'icon';
        }
      },
    }
  }
</script>

<style scoped>
  .main {
    width: 90%;
    color: black;
    text-align: justify;
    border: 1px solid #aaaaaa;
    border-radius: 15px;
  }

  .main h1 {
    text-transform: uppercase;
  }

  .main p {
    font-size: 18px;
  }

  .inner {
    border: 1px solid #4183c4;
    border-radius: 15px;
    padding: 5px;
  }

  textarea{
    height: 100px;
    width: 400px;
  }

  p{
    white-space: pre;
  }
</style>
