<template>
  <div>
    <router-link class="card" tag="div" :to="{ name: 'productDetail', params: { id: product.id }}">
      <img class="card-img-top" src="../assets/6332_salmonnoruego3.jpg" alt="Card image cap" />
      <div class="card-body text-center">
        <h4 class="card-title align-content-center">{{ product.name }} {{ product.variety }}</h4>
        <p class="card-text text-center overflow-auto">{{ product.description }}</p>
      </div>
      <div class="card-footer">
        <div class="b-form-tags" v-for="(category,key) in product.categories" v-bind:key="key">
          <b-icon-tag />
          {{ category.description }}
        </div>
      </div>
    </router-link>
  </div>
</template>

<script>
export default {
  name: "Product",
  props: {
    product: {
      name: String,
      description: String,
      categories: Array
    }
  },
  data() {
    return {
      productDetail: {}
    };
  }
};
</script>

<style scoped>
.card {
  width: 400px;
  height: 50vh;
}

.card-text {
  height: 100px;
}

.card-footer {
  height: 50px;
}
</style>