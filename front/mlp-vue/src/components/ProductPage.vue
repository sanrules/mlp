<template>
  <div>
    <Product
      triggers="hover"
      class="d-inline-flex p-2"
      v-for="product in products"
      :key="product.id"
      :product="product"
    />
  </div>
</template>

<script>
import Product from "./Product";
import { instance } from "../variables";

export default {
  name: "LandPage",
  components: { Product },
  props: {
    products: {
      product: Product
    }
  },
  beforeMount() {
    instance.get("products/all").then(
      response => {
        this.products = response.data;
      },
      error => {
        console.log(error);
        this.timeout = false;
      }
    );
  }
};
</script>

<style scoped>
</style>