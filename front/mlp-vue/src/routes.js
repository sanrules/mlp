import product       from './components/Product.vue'
import productDetail from './components/ProductDetail.vue'

export default [

		{ path: '/', component: product },
		{ path: '/productDetail/:id', name: 'productDetail', component: productDetail, props: true }
]