<template>
  <div>
    <div class="header">
      <h3 class="post-title">Create a new post.</h3>
    </div>
    <div class="text-form">
      <p>Title post:</p>
      <input class="title-body" type="text"/>
      <p>Post:</p>
      <textarea class="post-body" type="text" maxlength="2048"/>
      <button type="submit">Save</button>
    </div>
  </div>
</template>

<script>
  export default {
    name: "Create"
  }
</script>

<style scoped>
  .header {

  }
</style>
