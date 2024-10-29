package co.japl.android.homeconnect.model.interfaces.inbound

interface IPQRs {

    suspend fun getUrlBilling():String?

    suspend fun getUrlGeneral():String?

}