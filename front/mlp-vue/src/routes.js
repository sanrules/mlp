import product       from './components/Product.vue'
import productDetail from './components/ProductDetail.vue'

export default [

		{ path: '/*', name: 'main', component: () => import(product) },
		{ path: '/productDetail/:id?', name: 'productDetail', component: productDetail, props: true }
]