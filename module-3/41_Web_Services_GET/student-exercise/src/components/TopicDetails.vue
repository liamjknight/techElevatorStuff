<template>
  <div class="topic-details">
    <h1>{{ topic.title }}</h1>
    <div v-for="message in topic.messages" v-bind:key="message.id" class="topic-message bubble">
      <h3 class="message-title">{{ message.title }}</h3>
      <p class="message-body">
        {{ message.messageText }}
      </p>
    </div>
  </div>
</template>
<script>
import topicService from '../services/TopicService';
export default {
  name: 'topic-details',
  props: {
    'topicId': Number
  },
  data() {
    return {
      topic: {
        id: 0,
        title: '',
        messages: []
      },
    }
  },
  created(){
    topicService.getTopic(this.$route.params.id).then((response) => {
      this.topic = response.data;
    })
  }
}
</script>
<style>
/** page structure **/
.topic-details {
  padding: 20px 20px;
  margin: 0 auto;
  max-width: 600px;
}
/** ios1-ios6 bubbles **/
.topic-details .bubble {
  box-sizing: border-box;
  width: auto;
  position: relative;
  clear: both;
  background: #95C2FD;
  background-image: -webkit-gradient(linear, left bottom, left top, color-stop(0.15, #BEE2FF), color-stop(1, #95C2FD));
  background-image: -webkit-linear-gradient(bottom, #BEE2FF 15%, #95C2FD 100%);
  background-image: -moz-linear-gradient(bottom, #BEE2FF 15%, #95C2FD 100%);
  background-image: -ms-linear-gradient(bottom, #BEE2FF 15%, #95C2FD 100%);
  background-image: -o-linear-gradient(bottom, #BEE2FF 15%, #95C2FD 100%);
  background-image: linear-gradient(to top, #BEE2FF 15%, #95C2FD 100%);
  filter: progid:DXImageTransform.Microsoft.gradient(GradientType=0,startColorstr='#95C2FD', endColorstr='#BEE2FF');
  border: solid 1px rgba(0,0,0,0.5);
  -webkit-border-radius: 20px;
  -moz-border-radius: 20px;
  border-radius: 20px;
  -webkit-box-shadow: inset 0 8px 5px rgba(255,255,255,0.65), 0 1px 2px rgba(0,0,0,0.2);
  -moz-box-shadow: inset 0 8px 5px rgba(255,255,255,0.65), 0 1px 2px rgba(0,0,0,0.2);
  box-shadow: inset 0 8px 5px rgba(255,255,255,0.65), 0 1px 2px rgba(0,0,0,0.2);
  margin-bottom: 20px;
  padding: 6px 20px;
  color: #000;
  text-shadow: 0 1px 1px rgba(255,255,255,0.8);
  word-wrap: break-word;
}
</style>