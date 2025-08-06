import axios from 'axios';

const API = axios.create({
  baseURL: 'http://localhost:8080/api', // Spring Boot backend running on Tomcat
});

export default API;
