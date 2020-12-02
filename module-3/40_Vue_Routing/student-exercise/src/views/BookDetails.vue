<template>
  <div>

    <h1>{{ book.title }}</h1>
    <h2>{{ book.author }}</h2>
    <img v-if="book.isbn" :src="'http://covers.openlibrary.org/b/isbn/' + book.isbn + '-M.jpg'"/>
    <p>{{ book.read ? 'I have read this book' : 'I have not read this book'}}</p>
  </div>
</template>

<script>

export default {
  name: 'book-details',
  computed: {
      book(){
          return this.$store.state.books.find( book =>
          book.isbn == this.$route.params.isbn
          );
      }
  },
//   created(){
//       const activeBookIsbn = this.$route.params.id;
//   }
}
</script>

<style>

</style>