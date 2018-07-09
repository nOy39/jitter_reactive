<template>
  <div class="wrapper">
    <nav>
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
    margin: 100px;
    padding: 100px;
    font-family: "Ebrima";
    background: #000;
  }
  ul {
    position: absolute;
    top: 50px;
    left: 50px;
    transform: translate(-50px,-50px);
    margin: 100px;
    padding: 50px;
    display: flex;
    background: transparent;
  }

  ul li{
    list-style: none;
  }

  ul li a{
    position: relative;
    display: block;
    padding: 10px;
    margin: 0px 10px;
    text-transform: uppercase;
    text-decoration: none;
    color: #ffffff;
  }

  ul li a:before {
    content: '';
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    border-top: 2px solid #ffeb3b;
    border-left: 2px solid #ffeb3b;
    transform-origin: left;
    transition: .5s;
    box-sizing: border-box;
  }

  ul li a:hover:before {
    width: 10px;
    height: 10px;
    transform: rotate(360deg);
  }

  ul li a:after {
    content: '';
    position: absolute;
    bottom: 0;
    right: 0;
    width: 100%;
    height: 100%;
    border-bottom: 2px solid #ffeb3b;
    border-right: 2px solid #ffeb3b;
    transform-origin: right;
    transition: .5s;
    box-sizing: border-box;
  }

  ul li a:hover:after {
    width: 10px;
    height: 10px;
    transform: rotate(-360deg);
    transition-delay: .5s;
  }

</style>
