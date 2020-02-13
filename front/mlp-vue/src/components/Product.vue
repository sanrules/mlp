<template>
    <div>
        <router-link class="card" tag="div"
                     :to="{ name: 'productDetail', params: { id: product.id }}">
            <div class="card-body text-center">
                <h4 class="card-title align-content-center">{{ product.name }} {{ product.variety }}</h4>
                <p class="card-text text-center overflow-auto">{{ product.description }}</p>
                <div class="b-form-tags" v-for="(category,key) in product.categories" v-bind:key="key">
                    <b-icon-tag/>
                    {{ category.description }}
                </div>

            </div>
        </router-link>
    </div>

</template>

<script>
		export default {
						name : "Product",
						props: {
								product: {
										name       : String,
										description: String,
										categories : Array,
								}
						},
						data() {
								return {
										productDetail: {}
								}
						},
				}
</script>

<style scoped>
    .card {
        width: 300px;
        height: 300px;
    }

    .card-text {
        height: 65%;
    }

</style>