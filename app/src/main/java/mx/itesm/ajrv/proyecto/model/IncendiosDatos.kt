package mx.itesm.ajrv.proyecto.model

import com.google.gson.annotations.SerializedName

data class IncendiosDatos (
    @SerializedName("hora_del_parte")
    val horainicio: String,
    @SerializedName("causa_probable")
    val causa: String,
    @SerializedName("situacion_actual")
    val situacion: Double,
    @SerializedName("fecha_inicio")
    val fechainicio: String,
    @SerializedName("fecha_del_parte")
    val fechafin: String,
    @SerializedName("provincia")
    val estado: String
)