import Vue from 'vue';
import Router from 'vue-router';
import HelloWorld from '@/components/HelloWorld';
import MainComponent from '@/components/MainComponent';
import Task from '@/components/Task';

Vue.use(Router);

const router = new Router({
  mode: 'history',
  routes: [
    {path: '/task', component: Task},
    {path: '/', component: MainComponent},
    {path: '/hello', component: HelloWorld}
  ]
});

export default router

