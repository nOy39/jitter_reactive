
<template>
  <div class="hello">
    <vk-button
    @click="callRestService()"
    >MyButton</vk-button>
    <vk-spinner
    v-show="spinner">
    </vk-spinner>
    <progress class="uk-progress" value="10" max="50"></progress>
    <h3>{{ response }}</h3>
  </div>
</template>

<script>
// import axios from 'axios'
import { AXIOS } from './http-common';

export default {
  name: 'HelloWorld',
  data() {
    return {
      msg: 'Welcome to Your Vue.js App',
      response: [],
      errors: [],
      spinner: false,
      messages: [],
    };
  },
  methods:{
  callRestService() {
    this.spinner = true;
    AXIOS.get(`/hello`)
      .then(response => {
        this.response = response.data;
        this.messages.push({message: this.response, status: 'success'})
        this.spinner = false;
      })
      .catch(e => {
        this.errors.push(e)
      })
  }
  },
  spinner(){
    this.spinner = true;
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
