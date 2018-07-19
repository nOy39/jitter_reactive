<template>
  <div class="main">
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
</style>
