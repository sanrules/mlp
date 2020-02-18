<template>
  <b-navbar id="navbar" toggleable="lg" type="light" class="shadow fixed-top">
    <b-navbar-brand class="flex-fill" to="/">Mariscos La Paz</b-navbar-brand>
    <b-navbar-toggle target="nav-collapse"></b-navbar-toggle>

    <b-collapse id="nav-collapse" is-nav>
      <b-navbar-nav>
        <b-nav-item to="/">Productos</b-nav-item>
        <b-nav-item to="/categorias">Categorías</b-nav-item>
      </b-navbar-nav>

      <!-- Right aligned nav items -->
      <b-navbar-nav class="ml-auto">
        <p class="h3 mb-2">
          <font-awesome-icon :icon="['fas', 'faShoppingCart@']"></font-awesome-icon>
        </p>
      </b-navbar-nav>
    </b-collapse>
  </b-navbar>
</template>

<script>
export default {
  name: "Navbar"
};
</script>

<style scoped>
#navbar {
  background-color: white;
}
</style>