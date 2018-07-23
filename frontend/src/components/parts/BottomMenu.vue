<template>
  <div class="bottom-menu">
    <div class="container" @click="showMenu()">
      <hamburger class="ham-button"/>
    </div>
    <div :class="menuClass">
      <a href="/create" class="ion-ios-document"></a>
      <a class="ion-ios-folder"></a>
      <a class="l1 ion-ios-calendar"></a>
      <a class="l2 ion-ios-trash"></a>
      <a class="ion-ios-chatbubbles"></a>
      <a class="ion-ios-person"></a>
    </div>
  </div>
</template>

<script>
  import Hamburger from "./Hamburger";
  import Search from "./Search";

  export default {
    name: "BottomMenu",
    components: {Search, Hamburger},
    data() {
      return {
        menuClass: 'menu',
        btnClass: 'btnm',
        menuHidden: true,
      };
    },
    methods: {
      showMenu() {
        console.log('pressed');
        if (this.menuHidden) {
          this.btnClass = "btnm btnn";
          this.menuClass = "menu show";
        } else {
          this.btnClass = "btnm";
          this.menuClass = "menu"
        }
        this.menuHidden = !this.menuHidden;
        console.log(this.menuHidden);
      }
    },
  }
</script>

<style scoped>
  .bottom-menu {
    overflow: hidden;
  }

  .ham-button {
    position: fixed;
    bottom: 2em;
    cursor: pointer;
    left: 50%;
    transform: translateX(-50%);
    z-index: 100;
    width: 10px;
    height: 10px;
  }

  .search-field {
    position: fixed;
    bottom: 40px;
    left: 30%;
    transform: translateX(-50%);
    z-index: 100;
  }

  .btnm {
    position: fixed;
    bottom: 16px;
    cursor: pointer;
    left: 50%;
    transform: translateX(-50%);
    z-index: 100;
    opacity: .3;
  }

  .btnm span {
    width: 60px;
    height: 4px;
    display: block;
    background: white;
    margin: 8px;
    transition: .4s all;
  }

  .btnn span {
    background: #34495e;

  }

  .menu {
    background: teal;
    width: 100%;
    position: fixed;
    bottom: 0;
    text-align: center;
    display: none;
    transition: .3s;
  }

  .menu .l1 {
    margin-right: 70px;
  }

  .menu .l2 {
    margin-left: 70px;
  }

  .menu a {
    width: 80px;
    display: inline-block;
    margin: 0 10px;
    color: white;
    cursor: pointer;
    line-height: 80px;
    font-size: 30px;
  }

  a {
    opacity: .6;
  }

  a:hover {
    opacity: 1;
    color: #000066;
    font-size: 50px;
  }

  .show {
    opacity: .7;
    display: block;
  }
</style>
