<template>
  <div class="book-container">
    <book-card v-for="book in books" :key="book.isbn"
    :book="book"
    :title="book.isbn"
    :author="book.title"
    :read="book.read"
    :isbn="book.isbn"
    ></book-card>
    </div>
</template>
<script>
import BookCard from './BookCard.vue'
export default {
  components: { BookCard },
    name: 'reading-list',
    props: ['books']
}
</script>
<style>
.book-container {
    display:flex;
    justify-content: space-evenly;
    flex-wrap: wrap;
}
</style>