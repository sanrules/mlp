<template>
    <div>
        <Navbar/>
        <div class="container-fluid text-center">
            <Product
                    triggers="hover"
                    class="d-inline-flex p-2"
                    v-for="product in products"
                    :key="product.id"
                    :product="product"/>
        </div>
    </div>
</template>

<script>
		import Navbar       from './Navbar';
		import Product      from './Product';
		import { instance } from '../variables';

		export default {
				name      : "LandPage",
				components: { Navbar, Product },
				props     : {
						products: {
								product: Product,
						}
				},
				beforeMount() {
						instance.get('products/all').then((response) => {
								this.products = response.data;
						}, (error) => {
								console.log(error);
								this.timeout = false;
						});
				},
		}
</script>

<style scoped>


</style>