<template>
  <div class="main">
    <div :class="iconStatus" @click="setActive">
      <div class="hamburger">
      </div>
    </div>
  </div>
</template>

<script>
  export default {
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
    background: #ffaaaa;
  }

  .icon {
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    width: 100px;
    height: 100px;
    cursor: pointer;
  }

  .hamburger {
    width: 50px;
    height: 6px;
    background: #fff;
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    box-shadow: 0 2px 5px rgba(0, 0, 0, .2);
    transition: .5s;
  }

  .hamburger:before,
  .hamburger:after {
    content: '';
    position: absolute;
    width: 50px;
    height: 6px;
    background: #fff;
    box-shadow: 0 2px 5px rgba(0, 0, 0, .2);
    transition: .5s;
  }

  .hamburger:before {
    top: -16px;
  }

  .hamburger:after {
    top: 16px;
  }

  .icon.active .hamburger {
    background: rgba(0, 0, 0, 0);
    box-shadow: 0 2px 5px rgba(0, 0, 0, 0);
  }

  .icon.active .hamburger:before {
    top: 0;
    transform: rotate(45deg);
  }

  .icon.active .hamburger:after {
    top: 0;
    transform: rotate(135deg);
  }
</style>
