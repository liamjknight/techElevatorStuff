 <template>
  <div id="app">
    <product-reviews></product-reviews>
    <img alt="Vue logo" src="./assets/logo.png">
    <!--<HelloWorld msg="Welcome to Your Vue.js App"/>-->
  </div>
</template>

<script>
//import HelloWorld from './components/HelloWorld.vue'
import ProductReviews from './components/ProductReviews.vue'

export default {
  name: 'App',
  components: {
    //HelloWorld,
    ProductReviews
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
  max-width: 800px;
  margin: 60px, auto, 0px, auto;
}
</style>
