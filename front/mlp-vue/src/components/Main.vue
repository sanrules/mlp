<template>
  <div>
    <Product v-for="producto in productos" :key="producto.id" :producto="producto" />
  </div>
</template>

<script>
import axios from "axios";

const SERVER_URL = "http://localhost:8080/products";
const instance = axios.create({ baseURL: SERVER_URL, timeout: 10000 });

export default {
  name: "Main",
  props: {
    productos,
    producto: {
      id: "0",
      name: "productoPrueba",
      description: "producto de prueba",
      category: "categoría"
    }
  },
  data() {
    return {
      Main: {}
    };
  },
  created() {
    instance.get("all").then(response => (this.productos = response.data));
  }
};
</script>

<style scoped>
</style>