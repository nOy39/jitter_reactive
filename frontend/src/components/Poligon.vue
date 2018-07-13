<template>
  <div class="container">
    <h3>CSS Полигон</h3>
    <hr>
    <div class="row">
      <div class="col-2">
        <div class="but">
          <a href="#">button</a>
        </div>
      </div>
      <div class="col-3">
        <div class="s-m">
          <a href="#"><i class="fab fa-telegram-plane"></i></a>
          <a href="#"><i class="fab fa-google-plus-g"></i></a>
          <a href="#"><i class="fab fa-vk"></i></a>
          <a href="#"><i class="fab fa-facebook-f"></i></a>
          <a href="#"><i class="fab fa-github"></i></a>
          <a href="#"><i class="fab fa-telegram-plane"></i></a>
          <a href="#"><i class="fab fa-youtube"></i></a>
          <a href="#"><i class="fab fa-instagram"></i></a>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
  export default {
    name: "Poligon"
  }
</script>

<style scoped>
  *{
    text-decoration: none;
  }
  .but a {
    position: absolute;
    color: #262626;
    height: 60px;
    width: 200px;
    line-height: 60px;
    text-align: center;
    font-family: Bahnschrift;
    font-size: 24px;
    text-decoration: none;
    text-transform: uppercase;
    letter-spacing: 2px;
  }
  .but a:before {
    content: '';
    height: 90px;
    width: 200px;
    top: -15px;
    left: 0;
    position: absolute;
    border-left: 2px solid #262626;
    border-right: 2px solid #262626;
    transition: 1s;
  }
  .but a:after {
    content: '';
    height: 60px;
    width: 230px;
    top: 0px;
    left: -15px;
    position: absolute;
    border-top: 2px solid #262626;
    border-bottom: 2px solid #262626;
    transition: 1s;
  }
  .but a:hover:before {
    transform: rotateY(180deg);
  }
  .but a:hover:after {
    transform: rotateX(180deg);
  }
  .s-m{
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%,-50%);
  }
  .s-m a{
    display: inline-flex;
    width: 40px;
    height: 40px;
    background: #2c3e50;
    color: white;
    margin: 0 6px;
    border-radius: 50%;
    justify-content: center;
    align-items: center;
    transition: 0.4s;
    font-size: 22px;
  }
  .s-m a:hover {
    background: #e67e22;
  }
  .s-m i {
    transition: 0.4s all;
  }
  .s-m a:hover > i {
    transform: scale(1.6) rotate(25deg);
  }
</style>
