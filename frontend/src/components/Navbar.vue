<template>
  <div>
    <header>
      <div class="logo">
        Typewriter Blog
      </div>
      <nav :class="navToggle">
        <ul>
          <li><a href="/">Home</a></li>
          <li><a href="/hello">About</a></li>
          <li><a href="#">Contact</a></li>
          <li><a href="#">Profile</a></li>
          <li><a href="#">LogIn</a></li>
        </ul>
      </nav>
      <div class="menu-toggle">
        <i class="fa fa-bars" aria-hidden="true" @click="toggleMenu"/>
      </div>
    </header>
  </div>
</template>

<script>
  export default {
    name: "navi",
    props: ['active'],
    data() {
      return {
        msg: 'Navbar',
        navToggle: '',
        active: false,
      };
    },
    methods:{
      toggleMenu() {
        this.active = !this.active;
        console.log(this.active);
        if (this.active) {
          return this.navToggle = 'active';
        } else {
          return this.navToggle = 'disable';
        }

      },
    }
  };

</script>

<style scoped>

  header {
    font-family: 'Special Elite', cursive;
    position: absolute;
    top: 0;
    left: 0;
    padding: 0 100px;
    background: #000000;
    width: 100%;
    box-sizing: border-box;
    opacity: 50%;
    margin-bottom: 10px;
    font-size: 20px;
  }

  header .logo {
    color: #fff;
    height: 50px;
    line-height: 50px;
    font-size: 24px;
    float: left;
    font-weight: bold;
    font-family: 'Special Elite', cursive;
  }

  header nav {
    float: right;
    opacity: 50%;
  }

  header nav ul {
    margin: 0;
    padding: 0;
    display: flex;
    opacity: 50%;
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
      height: 60vh;
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
