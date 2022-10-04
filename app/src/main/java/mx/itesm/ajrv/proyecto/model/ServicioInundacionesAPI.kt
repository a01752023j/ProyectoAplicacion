package mx.itesm.ajrv.proyecto.model

import retrofit2.Call
import retrofit2.http.GET

interface ServicioInundacionesAPI {
    @GET("floodAreas")
    fun descargarDatosInundacion(): Call<InfoInundaciones>
}