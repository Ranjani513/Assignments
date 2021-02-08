<template>
  <div id="app">
    
    <Firstapp/>
 
  </div>
</template>

<script>

import Firstapp from './components/Firstapp.vue'
export default {
  name: 'App',
  components: {
   
    Firstapp
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
}
</style>
