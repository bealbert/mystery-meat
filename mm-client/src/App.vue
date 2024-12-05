<script setup>
import { RouterLink } from 'vue-router'
</script>

<template>
  <header>
    <img alt="Mystery Meat logo" class="logo" src="@/assets/mm_logo_transparent.png" width="125" height="125" />
    <h1>Mystery Meat</h1>
    <nav class="wrapper">
      <router-link to="/portfolios">MEAT Our Staff</router-link>
      <i class="fa-solid fa-drumstick-bite" style="color: #3355dd;"></i>
      <a>Shop</a>
      <i class="fa-solid fa-drumstick-bite" style="color: #3355dd;"></i>
      <a>Calendar</a>
    </nav>
  </header>

</template>

<style scoped>
header {
  display: flex;
  background-color: #F2A735;
  border-radius: 10px;
}

h1 {
  color: #4D1BA4;
}

.wrapper {
  color: #4D1BA4;
  font-weight: bold;
}



@media (min-width: 1024px) {
  /* header {
    display: flex;
    padding-right: calc(var(--section-gap) / 2);
  }

  .logo {
    margin: 0 2rem 0 0;
  }

  header .wrapper {
    display: flex;
    place-items: flex-start;
  }

  nav {
    text-align: left;
    margin-left: -1rem;
    font-size: 1rem;
    padding: 1rem 0;
    margin-top: 1rem;
  } */
}
</style>
