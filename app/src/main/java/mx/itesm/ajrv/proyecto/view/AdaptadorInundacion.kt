package mx.itesm.ajrv.proyecto.view

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.activity.viewModels
import androidx.recyclerview.widget.RecyclerView
import mx.itesm.ajrv.proyecto.model.InfoInundaciones
import mx.itesm.ajrv.proyecto.R
import mx.itesm.ajrv.proyecto.databinding.ActivityInundacionesBinding
import mx.itesm.ajrv.proyecto.viewmodel.InundacionesVM

class AdaptadorInundacion(private val contexto: Context, var arrInundaciones: Array<InfoInundaciones>) :
    RecyclerView.Adapter<AdaptadorInundacion.RenglonInundaciones>()
{
    // Se llama cada vez que se va a poblar un renglon
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RenglonInundaciones {
        val vista = LayoutInflater.from(contexto).inflate(R.layout.activity_inundaciones, parent, false)
        return RenglonInundaciones(vista)
    }

    // Para poblar un renglón (poner los datos en el renglón 'position')
    override fun onBindViewHolder(holder: RenglonInundaciones, position: Int) {
        val inundacion = arrInundaciones[position]
        holder.set(inundacion)
    }

    // El número de renglones que tendra el recyclerview
    override fun getItemCount(): Int {
        return arrInundaciones.size
    }

    class RenglonInundaciones (var renglonInundaciones: View) : RecyclerView.ViewHolder(renglonInundaciones)
    {
        fun set(inundacion: InfoInundaciones) {
            renglonInundaciones.findViewById<TextView>(R.id.tvInundacionT).text = inundacion.items.toString()
            //renglonInundaciones.findViewById<TextView>(R.id.tvInundacionT).text = inundacion.items.toString()
            //renglonInundaciones.findViewById<TextView>(R.id.tvInundacionI).text = inundacion.lugar
            //renglonInundaciones.findViewById<TextView>(R.id.tvInundacionI2).text = "${inundacion.latitud}"
            //renglonInundaciones.findViewById<TextView>(R.id.tvInundacionI3).text = "${inundacion.longitud}"
            //renglonInundaciones.findViewById<ImageView>(R.id.imgBandera).setImageResource(R.drawable.bandera)
        }
    }


}