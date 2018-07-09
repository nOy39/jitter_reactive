<template>
  <div class="container">
    <h3>Just some database interaction...</h3>
    <button @click="fetchUser()">Create User</button>
  </div>
</template>

<script>
  export default {
    data() {
      return {
        user: []
      }
    }
    name: "Login"
  }
</script>

<style scoped>
</style>
