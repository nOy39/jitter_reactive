<template>
  <div class="sample">
    <hr>
    <button class="btn btn-success" @click="showP1=!showP1">hooks()</button>
    <button class="btn btn-success" @click="showP2=!showP2">Модификаторы событий</button>
    <button class="btn btn-success" @click="showP3=!showP3">Стилизация событий</button>
    <button class="btn btn-success" @click="showP4=!showP4">CSS мини</button>
    <button class="btn btn-danger" @click="showHW=!showHW">Домашнее задание</button>
    <div class="row">
      <div class="container" v-show="showP1">
        <div class="form-group my-2">
          <input type="text" class="form-control" v-model="firstName"/>
          {{firstName}}
          <br>
          <label>Для просмотра необходимо открыть консоль</label>
        </div>
      </div>
      <div class="container" v-show="showP2">
        <div class="form-group my-2">
          <label>Модификатор lazy</label>
          <input type="text"
                 class="form-control"
                 v-model.lazy="phoneLazy"/>
          <label>{{phoneLazy}}</label>
          <br>
          <label>Модификатор trim</label>
          <input type="text"
                 class="form-control"
                 v-model.trim="phoneTrim"/>
          <label>{{phoneTrim}}</label>

        </div>
      </div>
      <div class="container col-12 my-3" v-show="showP3">
        <div class="alert" :class="divClassName">{{divClass}} style.</div>
        <div class="form-check">
          <label class="form-check-label">
            <input type="radio"
                   class="form-check-input"
                   value="info"
                   v-model="divClass"/>
            Info
          </label>
        </div>
        <div class="form-check">
          <label class="form-check-label">
            <input type="radio"
                   class="form-check-input"
                   value="warning"
                   v-model="divClass"/>
            Warning
          </label>
        </div>
        <div class="form-check">
          <label class="form-check-label">
            <input type="radio"
                   class="form-check-input"
                   value="success"
                   v-model="divClass"/>
            Success
          </label>
        </div>
        <div class="form-check">
          <label class="form-check-label">
            <input type="radio"
                   class="form-check-input"
                   value="danger"
                   v-model="divClass"/>
            Danger
          </label>
        </div>
        <div class="form-check" v-for="(value, name) in flags">
          <label class="form-check-label">
            <input class="form-check-input"
                   type="checkbox" v-model="flags[name]">
            {{ name }}
          </label>
        </div>
        <hr>
        <table class="table" :class="flags">
          <thead>
          <th>1c</th>
          <th>2c</th>
          <th>3c</th>
          </thead>
          <tbody>
          <tr>
            <td>Title</td>
            <td>Some</td>
            <td>nz</td>
          </tr>
          <tr>
            <td>Title</td>
            <td>Some</td>
            <td>nz</td>
          </tr>
          <tr>
            <td>Title</td>
            <td>Some</td>
            <td>nz</td>
          </tr>
          </tbody>
        </table>
      </div>
      <div class="container col-12 my-3" v-show="showP4">
        <div class="alert" style="" :style="properties">CSS MINI.</div>
        <table class="table">
          <tr v-for="(value, name) in properties">
            <td>{{name}}</td>
            <td><input type="text"
            v-model="properties[name]">
            </td>
          </tr>
        </table>
      </div>
    </div>
    <les2-h-w v-show="showHW"></les2-h-w>
  </div>
</template>

<script>
  import Les2HW from "./Les2HW";
  export default {
    name: "LavLes2",
    components: {Les2HW},
    data() {
      return {
        showP1: false,
        showP2: false,
        showP3: false,
        showP4: false,
        showHW: false,
        firstName: '',
        phoneLazy: '',
        phoneTrim: '',
        divClass: 'info',
        flags: {
          'table-bordered':false,
          'table-hover':false,
          'table-dark':false,
          'table-striped':false,
        },
        properties: {
          color: 'inherit',
          backgroundColor: 'none',
          borderRadius: '10px'
        },
      }
    },
    computed: {
      divClassName() {
        return [
          'alert-' + this.divClass,
          'my-' + this.divClass
        ];
      }
    },
    beforeCreate() {
      console.log('Hooks: \'beforeCreate()\'');
    },
    created() {
      console.log('Hooks: \'created()\'');
    },
    beforeMount() {
      console.log('Hooks: \'beforeMount()\'');
    },
    mounted() {
      console.log('Hooks: \'mounted()\'');
    },
    beforeUpdate() {
      console.log('Hooks: \'beforeUpdate()\'');
      console.log('Before Update firstName: ' + this.firstName);
    },
    updated() {
      console.log('Hooks: \'updated()\'');
      console.log('Updated firstName: ' + this.firstName);
      this.firstName.toUpperCase();
    },
    beforeDestroy() {
      console.log('bd');
    },
    destroyed() {
      console.log('d');
    },
  }
</script>

<style scoped>
  .my-info {
    font-size: 25px;
  }

  .my-warning {
    font-family: 'UbuntuMono', monospace;
  }
</style>
