<template>
    <div class="row">
        <router-link :to="{ name: 'productDetail', params: { id: p.id }}" tag="div"
                     class="card col-md-3" v-for="(p, key) in product" v-bind:key="key">
            <div class="card-body">
                <h4 class="card-title">{{ p.name }} {{ p.variety }} </h4>
                <p class="card-text">{{ p.description }}</p>
            </div>
        </router-link>
    </div>

</template>

<script>
		import axios from 'axios';

		const SERVER_URL = 'http://localhost:8080/products';
		const instance   = axios.create({ baseURL: SERVER_URL, timeout: 10000 });

		export default {
				name : "Product",
				props: [ 'link' ],

				data() {
						return {
								product: {}
						}
				},
				methods: {
						productDetail() {
								//let link = p._links.self.href;
						}
				},
				created() {
						instance.get('all').then(response => this.product = response.data);
				},
		}
</script>

<style scoped>

</style>