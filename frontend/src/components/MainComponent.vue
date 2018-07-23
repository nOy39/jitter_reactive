<template>
  <div class="main">
    <hamburger></hamburger>
  <search/>
  </div>
</template>

<script>
  import Hamburger from "./parts/Hamburger";
  import Search from "./parts/Search";
  export default {
    components: {Search, Hamburger},
    data() {
      return {
        active: false,
        iconStatus: 'icon',
      }
    },
    methods: {
      setActive() {
        this.active=!this.active;
        if (!this.active) {
        return this.iconStatus='icon active';
        } else {
          return this.iconStatus='icon';
        }
      }
    }
  }
</script>

<style scoped>
  .main {
    width: 630px;
    margin: 300px 10%;
    color: white;
    text-align: justify;
  }
  .main h1{
    text-transform: uppercase;
  }
  .main p{
    font-size: 18px;
  }
</style>
