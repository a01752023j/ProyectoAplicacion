package mx.itesm.ajrv.proyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import mx.itesm.ajrv.proyecto.databinding.ActivityMainBinding
import mx.itesm.ajrv.proyecto.general.general
import mx.itesm.ajrv.proyecto.model.InfoInundaciones
import mx.itesm.ajrv.proyecto.view.*
import mx.itesm.ajrv.proyecto.viewmodel.InundacionesVM

class MainActivity : AppCompatActivity() {
    // binding
    private lateinit var binding: ActivityMainBinding

    // ViewModel
    private val viewModel: InundacionesVM by viewModels()

    // Fuente de datos del RecyclerView
    var adaptadorInundacion: AdaptadorInundacion? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        registrarEventos()
        configurarObservables()
    }

    private fun configurarObservables() {
        viewModel.listainundacion.observe(this) { lista ->
            val arrInundacion = arrayOf<InfoInundaciones>()
            adaptadorInundacion?.arrInundaciones = arrInundacion
            adaptadorInundacion?.notifyDataSetChanged() // Recargue todo
        }
    }

    override fun onStart() {
        super.onStart()
        viewModel.descargarDatosInundacion()
    }

    private fun registrarEventos() {
        //Boton que nos manda a la vista general
        binding.btnGeneral.setOnClickListener {
            val intGeneral = Intent(this, general::class.java)
            startActivity(intGeneral)
//          finish()//termina la app
        }
        // Boton que nos manda a la vista inundaciones
        binding.btnInundaciones.setOnClickListener{
            println("Voy a inundaciones")
            val intInundaciones = Intent(this, Inundaciones::class.java)
            startActivity(intInundaciones)
        }
        //Boton que nos manda a la vista Accidentes automovilisticos
        binding.btnAccidentes.setOnClickListener{
            val intAccidentes = Intent(this, accidentesAutomovilisticos::class.java)
            startActivity(intAccidentes)
        }

        //Boton que nos manda a la vista incendios
        binding.btnIncendios.setOnClickListener{
            val intIncendios = Intent(this, incendios::class.java)
            startActivity(intIncendios)
        }

        //Boton que nos manda a la vista trafico
        binding.btnTrafico.setOnClickListener{
            val intTrafico = Intent(this, trafico::class.java)
            startActivity(intTrafico)
        }

        //Boton que nos manda a la vista sismos
        binding.btnSismos.setOnClickListener{
            val intSismos = Intent(this, sismos::class.java)
            startActivity(intSismos)
        }

        //Boton que nos manda a la vista otros
        binding.btnIncendios.setOnClickListener{
            val intOtros = Intent(this, otros::class.java)
            startActivity(intOtros)
        }
        binding.btnCategorias.setOnClickListener{
            val intCategorias = Intent(this, MainActivity ::class.java)
            startActivity(intCategorias)
        }

    }
}