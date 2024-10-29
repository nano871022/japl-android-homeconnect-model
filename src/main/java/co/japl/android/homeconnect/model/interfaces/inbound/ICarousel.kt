package co.japl.android.homeconnect.model.interfaces.inbound

import co.japl.android.homeconnect.model.models.Carousel


interface ICarousel {

    suspend fun getList():List<Carousel>
}