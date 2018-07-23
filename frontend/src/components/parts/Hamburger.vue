<template>
  <div>
    <div :class="iconStatus" @click="setActive()">
      <div class="hamburger">
      </div>
    </div>
  </div>
</template>

<script>
  export default {
    name: "Hamburger",
    data() {
      return {
        navToggle: '',
        active: false,
        iconStatus: 'icon',
      }
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
    }
  }
</script>

<style scoped>
  .icon {
    position: absolute;
    top: 50%;
    right: 0;
    transform: translate(-50%, -50%);
    width: inherit;
    height: inherit;
    cursor: pointer;
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
    width: inherit;
    height: inherit;
  }

  .hamburger:after {
    width: inherit;
    height: inherit;
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
</style>
