package co.japl.android.homeconnect.model.models

import java.time.LocalDateTime

data class Document(
    val id: String,
    val name: String,
    val url: String,
    val date: LocalDateTime,
    val version:String,
    val mimeType:String,
    val description:String?=null
)
