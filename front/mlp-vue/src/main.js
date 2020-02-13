import Vue                           from 'vue'
import App                           from './App.vue'
import { BootstrapVue, IconsPlugin } from 'bootstrap-vue';
import VueRouter                     from 'vue-router';
import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'
import LandPage                      from './components/LandPage';
import ProductDetail                 from './components/ProductDetail';

Vue.config.productionTip = false
Vue.use(VueRouter);
Vue.use(BootstrapVue);
Vue.use(IconsPlugin);

const router = new VueRouter(
		{
				routes: [
						{
								path     : '/*',
								name     : 'main',
								component: LandPage,
						},
						{
								path     : '/productDetail/:id?',
								name     : 'productDetail',
								component: ProductDetail,
								props    : true
						}
				]
		}
);

new Vue({
						render: h => h(App),
						router,
				}).$mount('#app')
