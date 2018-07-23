<template>
  <div class="hello">
    <button class="button"
            @click="callRestService()"
    >MyButton
    </button>
    {{msg}}
    <progress class="uk-progress" value="10" max="50"></progress>
    <h3>{{ response }}</h3>
    <div>
      All their equipment and instruments are alive.
    </div>
    <div>
      Is Authenticated = {{isAuthenticated}}
    </div>
  </div>
</template>

<script>
  // import axios from 'axios'
  import {AXIOS} from './http-common';
  import Hamburger from "./parts/Hamburger";

  export default {
    name: 'HelloWorld',
    props: ['isAuthenticated'],
    components: {Hamburger},
    data() {
      return {
        msg: 'Welcome to Your Vue.js App',
        inputClass: 'input',
        btnClass:'btn',
        response: [],
        errors: [],
        clicked: false,
        messages: [],
      };
    },
    methods: {
      callRestService() {
        AXIOS.get(`/hello`)
          .then(response => {
            this.response = response.data;
            this.messages.push({message: this.response, status: 'success'})
          })
          .catch(e => {
            this.errors.push(e)
          })
      },
      openSearch(){
        if (!this.clicked){
          this.inputClass = 'input inclicked';
          this.btnClass = 'btn close';
        } else {
          this.inputClass = 'input';
          this.btnClass = 'btn';
        }
        console.log(this.clicked)
        this.clicked=!this.clicked;
      }
    }
  };
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  .hello {
    margin-top: 50px;
  }

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

  .container{
    position: absolute;
    left:50%;
    top: 45%;
    transform: translate(-50%);
  }

</style>
