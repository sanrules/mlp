import Vue       from 'vue'
import App       from './App.vue'
import "bootstrap/dist/css/bootstrap.min.css"
import "bootstrap-vue/dist/bootstrap-vue.css"
import vueRouter from 'vue-router';
import Routes    from './routes'

Vue.config.productionTip = false
Vue.use(vueRouter);

const rutas = new vueRouter({
																routes: Routes
														})

new Vue({
						render: h => h(App),
						router: rutas
				}).$mount('#app')
