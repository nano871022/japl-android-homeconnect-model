package co.japl.android.homeconnect.model.models

import java.time.LocalDateTime

data class Message(
    var id: Int? = null,
    var message: String? = null,
    var date: LocalDateTime? = null
)
