<template>
  <div>
    <header>
      <div class="logo">
        LOGO
      </div>
      <nav :class="active">
        <ul>
          <li><a href="/" class="active">Home</a></li>
          <li><a href="/hello">About</a></li>
          <li><a href="/task">Задачи</a></li>
          <li><a href="#">Contact</a></li>
          <li><a href="#">Profile</a></li>
          <li><a href="#">LogIn</a></li>
        </ul>
      </nav>
      <div class="menu-toggle">
        <i class="fa fa-bars" aria-hidden="true" v-on:click="toggleMenu"/>
      </div>
    </header>
  </div>
</template>

<script>
  export default {
    name: "navi",
    data() {
      return {
        msg: 'Navbar',
        active: false,
      };
    },
    methods:{
      toggleMenu() {
        console.log(this.active);
        this.active = !this.active;
      }
    }
  };

</script>

<style scoped>

  header {
    font-family: 'Jura', sans-serif;
    position: absolute;
    top: 0;
    left: 0;
    padding: 0 100px;
    background: #262626;
    width: 100%;
    box-sizing: border-box;
  }

  header .logo {
    color: #fff;
    height: 50px;
    line-height: 50px;
    font-size: 24px;
    float: left;
    font-weight: bold;
  }

  header nav {
    float: right;
  }

  header nav ul {
    margin: 0;
    padding: 0;
    display: flex;
  }

  header nav ul li {
    list-style: none;
  }

  header nav ul li a {
    height: 50px;
    line-height: 50px;
    padding: 0 20px;
    color: #fff;
    text-decoration: none;
    text-transform: uppercase;
    /*temp*/
    display: block;
  }

  header nav ul li a:hover,
  header nav ul li a.active {
    color: #fff;
    background: #2196f3;

  }

  .menu-toggle {
    color: #fff;
    float: right;
    line-height: 50px;
    font-size: 24px;
    cursor: pointer;
    display: none;
  }

  @media (max-width: 991px) {

    header {
      padding: 0 20px;
    }

    .menu-toggle {
      display: block;
    }

    header nav {
      /*display: none;*/
      position: absolute;
      width: 100%;
      height: 45vh;
      background: #333333;
      top: 50px;
      left: -100%;
      transition: 0.5s;
    }

    header nav.active {
      left: 0;
    }

    header nav ul {
      display: block;
      text-align: center;
    }

    header nav ul li a {
      border-bottom: 1px solid rgba(0,0,0,.2);
    }
  }
</style>
