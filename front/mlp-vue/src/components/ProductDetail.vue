<template>
    <div>
        <div class="container-fluid">
            <div class="card-body text-left">
                <h4 class="card-title">{{ productDetail.name }} {{ productDetail.variety }} </h4>
                <div class="card-text">{{ productDetail.description }}
                    <h5> Categorías: </h5>
                    <p v-for="(cat, key) in productDetail.categories" v-bind:key="key">
                        {{ cat.description }}
                    </p>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
		import { instance } from '../variables';

		export default {
				name      : "ProductDetail.vue",
				components: { },
				props     : [ 'id' ],
				data() {
						return {
								productDetail: {}
						}
				},
				beforeMount() {
						instance.get('products/' + this.id).then(response => this.productDetail = response.data).catch(function(error) {
								console.log(error);
						});
				},

		}
</script>

<style scoped>

</style>