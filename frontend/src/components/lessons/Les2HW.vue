<template>
  <div my-2>
    <h3>Домашнее задание по уроку #2</h3>
    <br>
    <button class="btn btn-success" @click="showP1=!showP1">Первое задание</button>
    <button class="btn btn-success" @click="showP2=!showP2">Второе задание</button>

    <div class="row">
      <div class="col-12 my-2" v-show="showP1">
        <div class="sample col-8">
          <form>
            <div class="progress">
              <div class="progress-bar"
                   role="progressbar"
                   :style="incrWidth"
                   aria-valuenow="500"
                   aria-valuemin="0"
                   aria-valuemax="50">25%</div>
            </div>
            <div>
              <div class="form-group">
                <label>Name</label>
                <input type="text" class="form-control" v-model="info[0].value">
              </div>
              <div class="form-group">
                <label>Phone</label>
                <input type="text" class="form-control" v-model="info[1].value">
              </div>
              <div class="form-group">
                <label>Email</label>
                <input type="text" class="form-control" v-model="info[2].value">
              </div>
              <div class="form-group">
                <label>Some Field 1</label>
                <input type="text" class="form-control" v-model="info[3].value">
              </div>
              <div class="form-group">
                <label>Some Field 2</label>
                <input type="text" class="form-control" v-model="info[4].value">
              </div>
            </div>
            <button class="btn btn-primary">
              Send Data
            </button>
          </form>
          <div>
            <table class="table table-bordered">
              <tr v-for="(value, name, pattern) in info">
                <td>{{value.name}}</td>
                <td>{{value.value}}</td>
              </tr>
            </table>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
  export default {
    name: "Les2HW",
    data() {
      return {
        showP1: false,
        showP2: false,
        info: [
          {
            name: 'Name',
            value: '',
            pattern: /^[a-zA-Z ]{2,30}$/
          },
          {
            name: 'Phone',
            value: '',
            pattern: /^[0-9]{7,14}$/
          },
          {
            name: 'Email',
            value: '',
            pattern: /.+/
          },
          {
            name: 'Some Field 1',
            value: '',
            pattern: /.+/
          },
          {
            name: 'Some Field 2',
            value: '',
            pattern: /.+/
          }
        ],
        inc:0,
      }
    },
    computed: {
      incrWidth() {
        if (this.info[0].value.length > 1) {
          this.inc=this.inc+25;
        }
        return {
          width: inc+'%'
        };
      }
    }
  }
</script>

<style scoped>

</style>
