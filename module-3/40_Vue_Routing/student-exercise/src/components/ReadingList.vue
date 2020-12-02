<template>
  <div class="book-container">
    <router-link :to="{name: book, params: {isbn: isbn}}">
    <book-card :book="book" 
    v-for="book in $store.state.books" 
    :key="book.isbn"
    />
    </router-link>
  </div>
</template>

<script>
import BookCard from '@/components/BookCard.vue';

export default {
    name: 'reading-list',
    components: {
        BookCard
    },
    methods: {
      openDetails(isbn){
        this.$router.push({name: 'book', params: {isbn: isbn}})
      }
    }
}
</script>

<style>
.book-container {
    display:flex;
    justify-content: space-evenly;
    flex-wrap: wrap;
}
</style>