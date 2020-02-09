<template>

    <div class="card-body">
        <h4 class="card-title">{{ productDetail.name }} {{ productDetail.variety }} </h4>
        <div class="card-text">{{ productDetail.description }}
            <h5> Categorías: </h5>
            <p v-for="(cat, key) in productDetail.categories" v-bind:key="key">
                {{ cat.description }}
            </p>
        </div>
    </div>

</template>

<script>
		import axios from 'axios';

		export default {
				name : "ProductDetail.vue",
				props: [ 'id' ],
				data() {
						return {
								productDetail: {}
						}
				},
				beforeMount() {
						axios.get('http://localhost:8080/products/' + this.id).then(response => this.productDetail = response.data);
				}
		}
</script>

<style scoped>

</style>