// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue';
import App from './App';
import router from './router';
import Snotify, { SnotifyPosition } from 'vue-snotify'
import Vuelidate from 'vuelidate'
import store from './store/index'


const options = {
  toast: {
    position: SnotifyPosition.rightTop
  }
};

Vue.config.productionTip = false;
Vue.use(Snotify,options);
Vue.use(Vuelidate);

export const eventEmitter = new Vue();

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  store,
  components: { App },
  template: '<App/>',
});


