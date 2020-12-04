import axios from 'axios';
const http = axios.create({
  baseURL: "http://localhost:3000"
});
export default {
  list() {
    return http.get('/topics');
  },
  getTopic(id) {
    return http.get(`/topics/${id}`);
  }
}