package com.example.dmuel.model

data class WorkoutRecordDTO(
    var id : String? = null,
    var user_id : String? = null,
    var total_count : Int = 0,
    var total_volume : Int = 0,
    var total_time : Long? = null,
    var description : String? = null
)
