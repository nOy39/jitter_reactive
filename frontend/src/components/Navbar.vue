<template>
  <div class="wrapper">
    <nav>
      <div class="logo">LOGO</div>
      <ul>
        <li><a href="#">Home</a></li>
        <li><a href="#">About</a></li>
        <li><a href="#">Blog</a></li>
        <li><a href="#">Contact</a></li>
        <li><a href="#">Log In</a></li>
      </ul>
    </nav>
  </div>
</template>

<script>
    export default {
        name: "navi",
      data() {
        return {
          msg: 'Navbar',
        };
      },
    };

</script>

<style scoped>
  nav {
    font-family: "Bahnschrift";
    position: fixed;
    top: 0;
    left: 0;
    width: 100%;
    height: 60px;
    padding: 10px 100px;
    box-sizing: border-box;
    transition: .3s;
    background: sienna;
  }
  nav.black {
    background: rgba(0,0,0,0.8);
    height: 100px;
    padding: 10px 100px;
  }

  nav .logo {
    line-height: 10px;
    padding: 22px 20px;
    height: 50px;
    float: left;
    font-size: 24px;
    transition: .3s;
  }

  nav.black .logo{
    color: #fff;
  }

  nav ul {
    list-style: none;
    float: right;
    margin: 0;
    padding: 0;
    display: flex;
  }

  nav li {
    list-style: none;
  }

  nav ul li a {
    line-height: 50px;
    color: #151515;
    padding: 12px 30px;
    text-decoration: none;
    text-transform: uppercase;
    transition: .5s;
  }

  nav.black ul li a {
    color: #fff;
  }
  nav ul li a:focus {
    outline: none;
    background: #e2472f;
    border-radius: 6px;
    color: #fff;
  }

  nav ul li a.active {
    background: #e2472f;
    color: #fff;
    border-radius: 6px;
  }
</style>
