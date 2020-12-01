<template>
  <form class ="new-book-form"
  @submit.prevent='addNewBook'>
      <div class="form-item">
          <label for="title">Title:</label>
          <input type="text" name="title" class="title-input" v-model="newBook.title"/>
      </div>
      <div class="form-item">
          <label for="author">Author:</label>
          <input type="text" name="author" class="author-input" v-model="newBook.author"/>
      </div>
      <div class="form-item">
                    <label for="isbn">ISBN:</label>
          <input type="text" name="ISBN" class="isbn-input" v-model="newBook.isbn"/>
      </div>
      <input class="form-item" type='submit' value="Add"/>
   </form>   
</template>
<script>
export default {
    name: 'new-book-form',
    data() {
        return {
        newBook: {
            title: '',
            author: '',
            isbn: '',
            read: false
        }
        }
    },
    methods: {
        addNewBook() {
            this.$store.commit('ADD_NEW_BOOK', this.newBook);
            this.resetForm();
        },
        resertForm() {
            this.newBook = {
                title: '',
                author: '',
                isbn: '',
                read: false
            }
        }
    }
}
</script>
<style>
.form-item {
    margin: 0.5em;
    text-align: 0.5em;
}
</style>