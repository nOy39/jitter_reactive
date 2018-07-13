<template>
  <div class="hello">
    <vk-button
      @click="callRestService()"
    >MyButton
    </vk-button>
    <vk-spinner
      v-show="spinner">
    </vk-spinner>
    <div class="col-12">
    <progress class="uk-progress" :value="valueBar" :max="maxBar"></progress>
      <b-progress class="my-3" :max="maxBar" show-value>
        <b-progress-bar :value="valueBar"
                        :variant="variantType"
                        show-progress animated></b-progress-bar>
      </b-progress>

    <h3>{{ response }}</h3>

    </div>
    <btn class="btn btn-outline-success" @click="incBar">Ghbfn</btn>
  </div>
</template>

<script>
  // import axios from 'axios'
  import {AXIOS} from './http-common';

  export default {
    name: 'HelloWorld',
    data() {
      return {
        msg: 'Welcome to Your Vue.js App',
        valueBar: 0,
        response: [],
        errors: [],
        spinner: false,
        messages: [],
        maxBar: 50,
        variant:'',
      };
    },
    methods: {
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
      },
      spinner() {
        this.spinner = true;
      },
      incBar() {
        if (this.valueBar < this.maxBar) {
          this.valueBar += 5;
        } else {
          this.valueBar = 50;
        }
      }
    },
    computed: {
      variantType() {
        if (this.valueBar < this.maxBar * .25) {
          return 'success';
        } else if (this.valueBar > this.maxBar * .25 &&
          this.valueBar < this.maxBar * .5) {
          return '';
        } else if (this.valueBar > this.maxBar * .5 &&
          this.valueBar < this.maxBar * .75) {
          return 'warning';
        } else if (this.valueBar > this.maxBar * .75) {
          return 'danger';
        }
      }
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
