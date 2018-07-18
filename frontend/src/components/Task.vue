<template>
  <div class="head-section my-2">
    <h3>Список задач</h3>
    <hr>
    <vk-grid matched class="uk-child-width-1-3@l uk-child-width-1-1@l">
      <div hover v-for="(task, index) in tasks">
        <v-if task.subtask="null">
        <vk-card type="blank" hover>
          <span class="uk-badge uk-position-small uk-position-top-right" >{{index}}</span>
          <vk-card-title class="uk-position-small uk-position-top-left">{{task.name}}</vk-card-title>
          <p>{{task.description}}</p>
        </vk-card>
        </v-if>
      </div>
    </vk-grid>
  </div>
</template>

<script>
  import {AXIOS} from './http-common';

  export default {
    name: "Task",
    data() {
      return {
        response: [],
        errors: [],
        tasks: [],
      }
    },
    created: function () {
      this.fetchTasks();
    },
    methods: {
      fetchTasks() {
        AXIOS.get(`/tasks`)
          .then(response => {
            this.response = response.data;
            this.tasks = response.data;
          })
          .catch(e => {
            this.errors.push(e)
          })
      },
    },

  }
</script>

<style scoped>
  .head-section{

  }
</style>
