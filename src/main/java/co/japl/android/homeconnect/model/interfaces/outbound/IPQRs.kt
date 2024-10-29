package co.japl.android.homeconnect.model.interfaces.outbound

interface IPQRs {

    suspend fun getPqrsGeneral():String

    suspend fun getPqrsBilling():String
}