package co.japl.android.homeconnect.model.interfaces.inbound

import co.japl.android.homeconnect.model.models.Document
import java.io.File

interface IDocument {
    suspend fun getDocuments(): List<Document>

    fun getFile(idFile: String): File?
}