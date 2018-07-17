import Vue from 'vue';
import Router from 'vue-router';
import HelloWorld from '@/components/HelloWorld';
import MainComponent from '@/components/MainComponent';
import Task from '@/components/Task';

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
      path: '/task',
      name: 'Task',
      component: Task,
    },
  ],
});
