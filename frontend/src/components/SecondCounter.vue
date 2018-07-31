<template>
  <div>
    <h2>Counter: {{counter}}</h2>
    <br>
  </div>
</template>

<script>
  export default {
    name: "SecondCounter",
    computed: {
      counter() {
        return this.$store.getters.computedCounter
      }
    }
  }
</script>

<style scoped>

</style>
