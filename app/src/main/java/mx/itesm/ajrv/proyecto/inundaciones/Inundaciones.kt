package mx.itesm.ajrv.proyecto.inundaciones

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import mx.itesm.ajrv.proyecto.databinding.ActivityInundacionesBinding
import mx.itesm.ajrv.proyecto.databinding.ActivityMainBinding

class Inundaciones : AppCompatActivity() {
    private lateinit var binding: ActivityInundacionesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = ActivityInundacionesBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        registrarEventos()
    }
}