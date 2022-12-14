package com.example.dmuel.model

data class ContentDTO(var explain : String? = null,
                      var content : String? = null,
                      var imageUrl : String? = null,
                      var uid : String? = null,
                      var user_id : String? = null,
                      var timestamp : Long? = null,
                      var favoriteCount : Int = 0,
                      var favorites : MutableMap<String,Boolean> = HashMap()){
    data class Comment(var uid : String? = null,
                       var userId : String? = null,
                       var comment : String? = null,
                       var timestamp : Long? = null)
}
