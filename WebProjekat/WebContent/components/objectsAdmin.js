Vue.component("objectsAdmin", {
  data: function () {
    return {
      id: this.$route.params.id,
    }
  },
  template: ` 
<div>
    
		

          <h1>Sports Objects</h1>
</div>
        `,
        methods: {
          redirect: function(){
            this.$router.push("/profile/"+this.id)
          },
          goToAllUsers: function(){
            this.$router.push("/allUsersAdmin/"+this.id)
          },
          goToObjects: function(){
            this.$router.push("/objectsAdmin/"+this.id)
          },
          goToHome: function(){
              this.$router.push("/homeLoggedIn/"+this.id)
            }      
        }
        
    
    
});