package co.japl.android.homeconnect.model.interfaces.inbound

import co.japl.android.homeconnect.model.models.Message

interface IMessage {

    fun getMessage():List<Message>

    fun addMessage( message:String)
}