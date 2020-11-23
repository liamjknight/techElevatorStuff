<template>
  <div class="main">
      <h2>Product Reviews for {{ name }}</h2>
      <p class="description">{{ description }}</p>
  
    <div class="review" v-for="review in reviews" v-bind:key="review.id"><!--v-for is like a for loop in Vue, it can make this div appear for each review in the reviews array-->
        <h4>{{ review.reviewer }}</h4>                                  <!--v-bind:key lets v-for now that the thing to iterate over is the review key in the script below-->
        <div class="rating">
            <img src="../assets/star.png" v-for="n in review.rating" v-bind:key="n" v-bind:title="review.rating + ' star-review'"><!--the v-bind:key here is again attached to what is ACTUALLY iterating-->
        </div>                                                                         <!--the v-bind:title makes the img have a title when moused over that describes what is being displayed if it cannot be read otherwise.-->
        <h3>{{ review.title }}</h3>
        <p>{{ review.review }}</p>
    </div>
  </div>
</template>

<script>
export default {
    name : 'product-reviews',
    data(){
        return{
            name: 'Cigar Party for Dummies',
            description: 'This is how a party gets started!',
            reviews: [
                {
                reviewer: 'Malcom Gladwell',
                title: 'What a Book!',
                review: 'Really is quite a book, with pages too!',
                rating: 3,
                favorited: false
                },
                {
                reviewer: 'Liam',
                title: 'Its aight',
                review: 'Like real aight',
                rating: 4,
                favorited: false
                }
            ]
        }
    }
}
</script>

<style>
    div.main{
        margin: 1rem;
        padding: 15px, 10px;
    }
    div.review{
        background-color: aquamarine;
    }
    div.rating img{
        width: 2rem;
    }
</style>