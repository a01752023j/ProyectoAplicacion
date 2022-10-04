package mx.itesm.ajrv.proyecto.model

import com.google.gson.annotations.SerializedName
import mx.itesm.ajrv.proyecto.model.InundacionDatos

data class InfoInundaciones(
    @SerializedName("items")
    val items: List<InundacionDatos>
)
