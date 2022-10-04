package mx.itesm.ajrv.proyecto.model

import com.google.gson.annotations.SerializedName

data class InundacionDatos(
    @SerializedName("county")
    val estado: String,
    @SerializedName("riverOrSea")
    val lugar: String,
    @SerializedName("lat")
    val latitud: Double,
    @SerializedName("long")
    val longitud: Double

)
