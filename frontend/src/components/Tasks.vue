<template>
  <div class="container">
    <h2>Список задач</h2>
    <hr>
    <div class="row">
      <div class="col-3 tab">
        <button class="btn-list"
                v-for="group in categories"
                @click="showTask(group)">{{ group.categoryName }}
        </button>
        <div v-show="showTree">{{ category.categoryName }} jhghj</div>
      </div>
      <div class="col-9">
      <a href="#">button</a>
      </div>
    </div>
  </div>

</template>

<script>
  import {AXIOS} from './http-common';
  import Tabs from "./blocks/Tabs";

  export default {
    name: "TaskScreen",
    components: {Tabs},
    data() {
      return {
        errors: [],
        tasks: [],
        categories: [],
        showTree: false,
        task: [{
          id: '',
          name: '',
          description: '',
          created: '',
          deadline: ''
        }],
        category: [{
          id: '',
          categoryName: '',
        }]
      }
    },

    created: function () {
      this.fetchTasks();
      this.fetchGroup();
    },

    methods: {
      fetchTasks() {
        AXIOS.get(`/get/task`)
          .then(response => {
            this.tasks = response.data;
          })
          .catch(e => {
            this.errors.push(e);
          })
      },
      fetchGroup() {
        AXIOS.get('/get/group')
          .then(response => {
            this.categories = response.data;
          })
          .catch(e => {
            this.errors.push(e);
          })
      },
      showTask(type) {
        this.category = type;
        this.showTree = !this.showTree;
      }
    },
  }
</script>

<style scoped>
  li {
    list-style: none;
  }

  button {
    padding: 6px 8px;
    border-top-left-radius: 15px;
    border-top-right-radius: 5px;
    border: 1px solid #ccc;
    cursor: pointer;
    background: #444444;
    margin-bottom: -1px;
    margin-right: -1px;
    color: white;
  }

  button:hover {
    background: #e0e0e0;
    color: black;
  }

  button:active {
    background: #e0e0e0;
    color: black;
  }

  button:focus {
    background: #f0f0f0;
    outline: none;
    color: black;
  }

  .tab {
    border: 1px solid #ccc;
    padding: 15px;
  }
</style>
