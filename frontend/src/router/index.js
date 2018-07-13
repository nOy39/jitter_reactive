import Vue from 'vue';
import Router from 'vue-router';
import HelloWorld from '@/components/HelloWorld';
import MainComponent from '@/components/MainComponent';
import Users from '@/components/Users';
import Login from '@/components/Login';
import Tasks from '@/components/Tasks';
import Poligon from '@/components/Poligon';
import Lavrik from '@/components/Lavrik';

Vue.use(Router);

export default new Router({
  routes: [
    {
      path: '/hello',
      name: 'HelloWorld',
      component: HelloWorld,
    },
    {
      path: '/',
      name: 'MainComponent',
      component: MainComponent,
    },
    {
      path: '/users',
      name: 'Users',
      component: Users,
    },
    {
      path: '/login',
      name: 'Login',
      component: Login,
    },
    {
      path: '/tasks',
      name: 'Tasks',
      component: Tasks,
    },
    {
      path: '/poligon',
      name: 'Poligon',
      component: Poligon,
    },
    {
      path: '/lavrik',
      name: 'Lavrik',
      component: Lavrik,
    },

  ],
});
