<template>
  <div class="card" :id="book.isbn"
  :class="{ read: book.read }">
      <h2 class="book-title">{{ book.title }}</h2>
      <img v-if="book.isbn" v-bind:src="'http://covers.openlibrary.org/b/isbn/' + book.isbn + '-M.jpg'" />
      <h2 class="book-author">{{ book.author }}</h2>
      <button @click="toggleRead(book)"
      :class="{ 'mark-unread' : book.read, 'mark-read': !book.read }">{{ book.read ? 'Mark Unread' : 'Mark Read' }}</button>
  </div>
</template>
<script> 
export default {
    name: 'book-card',
    props: [ 'book' ],
    methods: {
        toggleRead(book) {
            this.$store.commit("TOGGLE_READ", book);
        }
    }
}
</script>
<style>
.card {
    border: 2px solid black;
    border-radius: 10px;
    width: 250px;
    height: 550px;
    margin: 20px;
}
.card.read {
    background-color: lightgray;
}
.card .book-title {
    font-size: 1.5rem;
}
.card .book-author {
    font-size: 1rem;
}
</style>