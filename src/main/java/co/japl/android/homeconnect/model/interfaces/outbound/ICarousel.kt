package co.japl.android.homeconnect.model.interfaces.outbound

import co.japl.android.homeconnect.model.models.CarouselDTO

interface ICarousel {

    suspend fun getCarousel():List<CarouselDTO>
}