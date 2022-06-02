package com.example.dmuel.model

data class UserDTO(
    var id : String? = null,
    var password : String? = null,
    var nickname : String? = null,
    var email_address : String? = null,
    var profile_image : String? = null,
    var fcm_token : String? = null,
    var gender : String? = null,
    var height : Int = 0,
    var weight : Int = 0
)