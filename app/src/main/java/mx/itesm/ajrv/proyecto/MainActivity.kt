package mx.itesm.ajrv.proyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import mx.itesm.ajrv.proyecto.accidentes.accidentesAutomovilisticos
import mx.itesm.ajrv.proyecto.databinding.ActivityMainBinding
import mx.itesm.ajrv.proyecto.general.general
import mx.itesm.ajrv.proyecto.incendios.incendios
import mx.itesm.ajrv.proyecto.inundaciones.Inundaciones
import mx.itesm.ajrv.proyecto.otros.otros
import mx.itesm.ajrv.proyecto.sismos.sismos
import mx.itesm.ajrv.proyecto.trafico.trafico

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        registrarEventos()
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



    }
}