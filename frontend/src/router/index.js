import Vue from 'vue';
import Router from 'vue-router';
import HelloWorld from '@/components/HelloWorld';
import MainComponent from '@/components/MainComponent';
import Task from '@/components/Task';
import Create from '@/components/Create';
import Contacts from '@/components/Contacts';
import Login from '@/components/Login';

Vue.use(Router);

const router = new Router({
  mode: 'history',
  routes: [
    {path: '/task', component: Task},
    {path: '/', component: MainComponent},
    {path: '/hello', component: HelloWorld},
    {path: '/create', component: Create},
    {path: '/contacts', component: Contacts},
    {path: '/login', component: Login},
  ]
});

export default router

