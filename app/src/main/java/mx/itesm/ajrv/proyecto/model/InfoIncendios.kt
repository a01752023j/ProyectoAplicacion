package mx.itesm.ajrv.proyecto.model

import com.google.gson.annotations.SerializedName

data class InfoIncendios(
    @SerializedName("items")
    val items: List<IncendiosDatos>
    )
