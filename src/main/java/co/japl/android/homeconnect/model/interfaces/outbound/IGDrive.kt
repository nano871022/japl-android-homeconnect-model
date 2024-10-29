package co.japl.android.homeconnect.model.interfaces.outbound

import co.japl.android.homeconnect.model.models.Carousel
import co.japl.android.homeconnect.model.models.Document
import java.io.File

interface IGDrive {

    suspend fun getFiles():List<Document>
    suspend fun getImg():List<Carousel>
    fun downloadFile(idFile:String): File?
}