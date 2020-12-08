<template>
  <form v-on:submit.prevent>
    <div class="field">
      <label for="title">Title</label>
      <input type="text" v-model="title" />
    </div>
    <div class="actions">
      <button type="submit" v-on:click="updateTopic()">Save Document</button>
    </div>
  </form>
</template>
<script>
import topicService from "../services/TopicService";
export default {
  name: "create-topic",
  props: ["topicID"],
  data() {
    return {
      title: ""
    };
  },
  methods: {
    updateTopic() {
      const topic = { id: this.topicID, title: this.title };
      // call topic service update method
      topicService.update(topic.id, topic).then(response => {
        if(response.status===200){
          this.$router.push('/');
        }
      });
    }
  },
  created() {
    topicService
      .get(this.topicID)
      .then(response => {
        this.$store.commit("SET_ACTIVE_TOPIC", response.data);
        this.title = response.data.title;
      })
      .catch(error => {
        if (error.response.status == 404) {
          this.$router.push("/not-found");
        }
      });
  }
};
</script>
<style>
</style>
2:18 PM
MessageService in services:
import axios from 'axios';
const http = axios.create({
  baseURL: "http://localhost:3000"
});
export default {
  get(id) {
    return http.get(`/messages/${id}`);
  },
  create(message){
    return http.post(`/messages`, message);
  },
  update(id, message){
    return http.put(`/messages/${id}`, message);
  },
  delete(id){
    return http.delete(`/messages/${id}`);
  }
}
2:18 PM
TopicService in services:
import axios from 'axios';
//import { create } from 'core-js/fn/object';
const http = axios.create({
  baseURL: "http://localhost:3000"
});
export default {
  list() {
    return http.get('/topics');
  },
  get(id) {
    return http.get(`/topics/${id}`);
  },
  create(topic){
    return http.post(`/topics/`, topic);
  },
  update(id, topic){
    return http.put(`/topics/${id}`, topic);
  },
  delete(id){
    return http.delete(`/topics/${id}`);
  }
}