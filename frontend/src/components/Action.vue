<template>
  <div>
    <button class="btn btn-danger" @click="upCount(1)">Up counter</button>
    <button class="btn btn-info" @click="upCount(-1)">Down counter</button>
  </div>
</template>

<script>
  export default {
    name: "Action",
    methods: {
      upCount(val) {
        this.$store.dispatch('asyncChangeCounter', val)
      }
    }
  }
</script>

<style scoped>

</style>
