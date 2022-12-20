<template>
  <div class="row">
    <div class="col-12">
      <hr class="my-4">
    </div>
    <router-link
      v-for="product in collection"
      :key="product.id"
      :to="'/products/' + product.id"
      class="col-3 text-decoration-none"
    >
      <img
        class="img-fluid mb-3"
        :src="require('@/assets/' + (product?.previewImage ? product.previewImage : 'images/logo.png'))"
      >
      <p class="text-left text-dark">
        {{ product.title }}
      </p>
    </router-link>
  </div>
</template>
<script>

export default {
  props: {
    collection: {
      type: Array,
      default () {
        return []
      }
    }
  }
}
</script>
