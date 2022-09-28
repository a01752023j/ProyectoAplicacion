package mx.itesm.ajrv.proyecto.general

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import mx.itesm.ajrv.proyecto.MainActivity
import mx.itesm.ajrv.proyecto.databinding.ActivityMainBinding
import mx.itesm.ajrv.proyecto.databinding.GeneralBinding

class general : AppCompatActivity() {
    private lateinit var binding: GeneralBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = GeneralBinding.inflate(layoutInflater)
        setContentView(binding.root)
        registrarEventos()

}

    private fun registrarEventos() {
        binding.btnCategorias.setOnClickListener{
            val intCategorias = Intent(this, MainActivity ::class.java)
            startActivity(intCategorias)
        }
        binding.btnGeneral.setOnClickListener {
            val intGeneral = Intent(this, general::class.java)
            startActivity(intGeneral)
//          finish()//termina la app
        }
    }


}