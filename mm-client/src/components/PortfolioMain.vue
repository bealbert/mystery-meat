<template>
  <section>

    <slideshow-component></slideshow-component>
    <div>
      <ul>
        <li>Willohwitch</li>
        <li>Kaijujungle</li>
        <li>Three Rat Moon</li>
      </ul>
    </div>
  </section>
</template>

<script>
import SlideshowComponent from '../components/SlideshowComponent.vue';

export default {
  components: {
    SlideshowComponent
  }
}
</script>

<style>
body {
  background-image: url('../assets/MM_BACKGROUND_BLANK_1.png.png');
}
</style>
