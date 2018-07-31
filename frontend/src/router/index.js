import Vue from 'vue';
import Router from 'vue-router';
import HelloWorld from '@/components/HelloWorld';
import MainComponent from '@/components/MainComponent';
import Task from '@/components/Task';
import Create from '@/components/Create';
import Contacts from '@/components/Contacts';
import Login from '@/components/Login';
import Registration from '@/components/Registration';
import ErrorCmp from '@/components/Error';

Vue.use(Router);

const Poligon = resolve => {
  require.ensure(['../components/Poligon'], () => {
    resolve(
      require('../components/Poligon')
    )
  })
};

const router = new Router({
  mode: 'history',    //Убираем хеш-тэг
  routes: [
    {path: '/task', component: Task},
    {path: '', component: MainComponent},
    {path: '/hello', component: HelloWorld},
    {path: '/create', component: Create},
    {path: '/contacts', component: Contacts},
    {path: '/login', component: Login},
    {path: '/poligon', component: Poligon},
    {path: '/registration', component: Registration},
    {path: '/none', redirect: '/'},
    {path: '*', component: ErrorCmp},
  ],
  scrollBehavior(to, from, savedPosition) {
if (savedPosition) {
      return savedPosition
    }
    if (to.hash) {
      return { selector: to.hash}
    }
    return {
      x: 0,
      y: 0
    }
  }
});

export default router

