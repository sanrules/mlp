import Vue from 'vue'
import App from './App.vue'
import {
	BootstrapVue,
	IconsPlugin
} from 'bootstrap-vue';
import VueRouter from 'vue-router';
import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'

Vue.config.productionTip = false

Vue.use(VueRouter);
Vue.use(BootstrapVue);
Vue.use(IconsPlugin);

const router = new VueRouter({
	routes: [{
			path: '/',
			name: 'home',
			component: () => import('./components/ProductPage'),
		},
		{
			path: '/productDetail/:id?',
			name: 'productDetail',
			component: () => import('./components/ProductDetail'),
			props: true
		},
		{
			path: '*',
			redirect: '/'
		}
	]
});

new Vue({
	render: h => h(App),
	router,
}).$mount('#app')