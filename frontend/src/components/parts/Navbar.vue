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
      <div :class="iconStatus" @click="setActive">
        <div class="hamburger">
        </div>
      </div>
      <!--<div class="menu-toggle" @click="toggleMenu">-->
      <!--<i class="fa fa-bars" aria-hidden="true"/>-->

      <!--</div>-->
    </header>
  </div>
</template>

<script>
  export default {
    name: "navi",
    data() {
      return {
        msg: 'Navbar',
        navToggle: '',
        active: false,
        iconStatus: 'icon',
      };
    },
    methods: {
      setActive() {
        this.active = !this.active;
        if (this.active) {
          this.iconStatus = 'icon active';
          this.navToggle = 'active';
        } else {
          this.iconStatus = 'icon';
          this.navToggle = '';
        }
      },
    },
    computed: {},
  };
</script>

<style scoped>
  a {
    /* color: white; */
  }

  header {
    position: absolute;
    top: 0;
    left: 0;
    padding: 0 100px;
    width: 100%;
    box-sizing: border-box;
    background: teal;
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
    position: relative;
  }

  header nav ul li.sub-menu:before {
    content: '\f078';
    font-family: fontAwesome;
    position: absolute;
    line-height: 50px;
    color: #fff;
    right: 1px;
  }

  header nav ul li.active.sub-menu:before {
    content: '\f077';
  }

  header nav ul li ul {
    position: absolute;
    left: 0;
    background: #333;
    display: none
  }

  header nav ul li.active ul {
    display: block;
  }

  header nav ul li ul li {
    display: block;
    width: 200px;
  }

  header nav ul li a {
    height: 50px;
    line-height: 50px;
    padding: 0 20px;
    color: #fff;
    text-decoration: none;
    display: block;
  }

  header nav ul li a:hover {
    color: #fff;
    background: #2196f3;
  }

  header nav ul li a.active {
    background: #2196f3;
  }

  .menu-toggle {
    color: #fff;
    float: right;
    line-height: 50px;
    font-size: 24px;
    cursor: pointer;
    display: none
  }

  .main {
    background: #ffaaaa;
  }

  .icon {
    position: absolute;
    top: 50%;
    right: 0;
    transform: translate(-50%, -50%);
    width: 30px;
    height: 50px;
    cursor: pointer;
    display: none;
  }

  .hamburger {
    width: 30px;
    height: 4px;
    background: #fff;
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    box-shadow: 0 2px 5px rgba(0, 0, 0, .2);
    transition: .5s;
  }

  .hamburger:before {
    width: 20px;
    height: 4px;
  }

  .hamburger:after {
    width: 10px;
    height: 4px;
  }

  .hamburger:before,
  .hamburger:after {
    content: '';
    position: absolute;
    background: #fff;
    box-shadow: 0 2px 5px rgba(0, 0, 0, .2);
    transition: .5s;
  }


  .icon:hover .hamburger:hover:before,
  .icon:hover .hamburger:hover:after {
    content: '';
    position: absolute;
    width: 30px;
    height: 4px;
    background: #fff;
    box-shadow: 0 2px 5px rgba(0, 0, 0, .2);
    transition: .5s;
  }

  .hamburger:before {
    top: -12px;
  }

  .hamburger:after {
    top: 12px;
  }

  .icon.active .hamburger {
    background: rgba(0, 0, 0, 0);
    box-shadow: 0 2px 5px rgba(0, 0, 0, 0);
  }

  .icon.active .hamburger:before {
    width: 30px;
    top: 0;
    transform: rotate(45deg);
  }

  .icon.active .hamburger:after {
    width: 30px;
    top: 0;
    transform: rotate(135deg);
  }

  .icon.active .hamburger:hover:before {
    width: 30px;
  }

  .icon.active .hamburger:hover:after {
    width: 30px;
  }

  @media (max-width: 860px) {
    header {
      padding: 0 20px;
    }

    .icon {
      display: block;
    }

    header nav {
      /* use display none or left:-100% to hide the nav  */
      /* display: none; */
      position: absolute;
      top: 50px;
      left: -100%;
      width: 50%;
      height: auto;
      background: #333;
      transition: 0.5s;
    }

    header nav.active {
      left: 0;
      height: auto;
    }

    header nav ul {
      display: block;
      text-align: center;
    }

    header nav ul li a {
      border-bottom: 0.9px solid rgba(0, 0, 0, .2);
    }

    header nav ul li.active ul {
      position: relative;
      background: #003e6f;
    }

    header nav ul li ul li {
      width: 100%;
    }
  }
</style>
