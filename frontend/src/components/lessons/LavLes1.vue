<template>
  <div class="sample">
    <hr>
    <button class="btn btn-primary" @click="p1Show=!p1Show">Реактивное добавление в массив</button>
    <button class="btn btn-primary" @click="p2Show=!p2Show">Перебор ассоциативного массива</button>
    <button class="btn btn-danger" @click="hWShow=!hWShow">Домашнее задание</button>

    <div class="row my-3">
      <div class="col-4" v-show="p1Show">
        <div class="group-inline">
          <button class="btn btn-success" @click="addNumber()">Добавить число</button>
          <button class="btn btn-secondary" @click="sortingArray()">Отсортировать массив</button>
        </div>
        <ul>
          <li v-for="(number, index) in numbers"
              @mouseenter="onMouseEnter($event,index)"
              @mouseleave="onMouseLeave($event,index)">
            {{index}} - {{ number }}
          </li>
        </ul>
      </div>
      <div class="col-10" v-show="p2Show">
        <table class="table table-bordered">
          <tr v-for="(value, key, i) in info">
            <td>{{i}}</td>
            <td>{{key}}</td>
            <td>{{value}}</td>
          </tr>
        </table>
      </div>
      <div class="col-6" v-show="hWShow">
        <h4>Домашнее задание:</h4>
        <h5>Создать форму с "отправкой" на таблицу</h5>
        <h4>Решение:</h4>
        <form v-show="formShow">
          <div class="form-group">
            <label class="my-1">E-mail</label>
            <input type="email" class="form-control" placeholder="email" v-model="user.email">
            <label class="my-1">Имя</label>
            <input type="text" class="form-control" placeholder="firstName" v-model="user.firstName">
            <label class="my-1">Фамилия</label>
            <input type="text" class="form-control" placeholder="lastName" v-model="user.lastName">
            <label class="my-1">Телефон</label>
            <input type="tel" class="form-control" placeholder="phone" v-model="user.phone">
            <button class="btn btn-primary my-2"
                    @click="addSomeField">+</button>
            <ul v-for="(guest, index) in user.guest">
              <label class="my-1" @click="deleteForm(index)"><b>Guest {{index+1}}</b></label>
              <input type="text" class="form-control" placeholder="guest" v-model="user.guest[index]">
            </ul>
          </div>
          <button class="btn btn-success" @click="saveForm">Сохранить</button>
        </form>
        <div v-show="!formShow">
          <table class="table table-bordered">
            <tr v-for="(value, key, i) in user">
              <td>{{i}}</td>
              <td>{{key}}</td>
              <td>{{value}}</td>
            </tr>
          </table>
          <button class="btn btn-outline-primary" @click="formShow=!formShow">Назад</button>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
  import Label from "vuikit/src/library/label/elements/label";
  export default {
    name: "LavLes1",
    components: {Label},
    data() {
      return {
        numbers: [],
        p1Show: false,
        p2Show: false,
        hWShow: false,
        formShow: true,
        info:{
          name: 'Andrey',
          age: '35',
          gender: 'male'
        },
        user:{
          email:'',
          firstName:'',
          lastName:'',
          phone:'',
          guest:[],
        },
      }
    },
    methods: {
      addNumber() {
        this.numbers.push(Math.floor(Math.random() * 10));
      },
      sortingArray() {
        this.numbers.sort((a, b) => {
          return a > b ? 1 : -1;
        })
      },
      onMouseEnter(e, number) {
        if (number & 1) {
          e.target.style.color = 'red';
        }
      },
      onMouseLeave(e, number) {
        e.target.style.color = 'black';
        e.target.style.cursor = 'pointer';
      },
      addSomeField() {
        this.user.guest.push('');
      },
      deleteForm(index) {
        this.user.guest.splice(index);
      },
      saveForm() {
        this.formShow = !this.formShow;
      }
    }
  }
</script>

<style scoped>

</style>
