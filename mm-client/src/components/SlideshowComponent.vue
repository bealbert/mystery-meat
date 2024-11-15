<template>
    <section class="slideshow">
        <button id="move-left"></button>
        <div id="box">
        </div>
        <button id="move-right"></button>
    </section>
</template>

<script>
</script>

<style>
body {
    background: #333;
}

#box {
    background: white;
    width: 200px;
    height: 200px;
    position: relative;
    animation-name: img-slideshow;
    animation-duration: 4s;
}

@keyframes img-slideshow {

}
</style>