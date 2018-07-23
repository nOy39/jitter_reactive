<template>
    <div>
      <div class="middle">
        <form action="#" class="search" method="post">
          <input type="text" :class="inputClass" name="" value="">
          <button :class="btnClass" type="button" name="button" @click="openSearch()"></button>
        </form>
      </div>
    </div>
</template>

<script>
    export default {
        name: "Search",
      data(){
          return{
            inputClass: 'input',
            btnClass:'btn',
          }
      }, methods:{
        openSearch(){
          if (!this.clicked){
            this.inputClass = 'input inclicked';
            this.btnClass = 'btn close';
          } else {
            this.inputClass = 'input';
            this.btnClass = 'btn';
          }
          console.log(this.clicked);
          this.clicked=!this.clicked;
        }
      }
    }
</script>

<style scoped>
  .middle{
    position: absolute;
    top: 80px;
    right: 10px;
    transform: translate(-50%, -50%);
  }

  .input{
    width: 40px;
    height: 40px;
    background: none;
    border-radius: 50%;
    border: 4px solid #fff;
    box-sizing: border-box;
    outline: none;
    transition: width 0.4s ease-in-out,
    border-radius 0.8s ease-in-out,
    padding-top 0.2s;
    transition-delay: 0.4s;
    color: #8b4212;
    font-size: 30px;
    text-transform: uppercase;
  }

  .inclicked{
    width: 480px;
    border-radius: 0;
    padding: 0 45px 0 15px;
    color: white;
    font-size: 24px;
    text-transform: none;

  }
  .btn{
    position: absolute;
    width: 40px;
    height: 40px;
    top: 0;
    right: 0;
    box-sizing: border-box;
    background: none;
    border: none;
    outline: none;
    cursor: pointer;
  }

  .btn::before{
    content: "";
    width: 4px;
    height: 25px;
    background: white;
    position: absolute;
    transform: rotate(-45deg);
    bottom: -16px;
    right: -6px;
    transition: .3s;
  }

  .close::before, .close::after{
    content: "";
    width: 4px;
    height: 34px;
    background: white;
    position: absolute;
    bottom: 3px;
    right: 17px;
  }

  .close::before{
    transform: rotate(-45deg);
  }

  .close::after{
    transform: rotate(45deg);
  }
</style>
