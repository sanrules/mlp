<template>
  <div id="app">
    <Navbar />
    <div class="container-fluid text-center">
      <div class>
        <h2>Productos</h2>
      </div>
      <router-view></router-view>
    </div>
    <Footer />
  </div>
</template>

<script>
import Navbar from "./components/Navbar";
import Footer from "./components/Footer";

export default {
  name: "App",
  components: { Navbar, Footer }
};
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
.container-fluid {
  margin-top: 6%;
}
</style>
