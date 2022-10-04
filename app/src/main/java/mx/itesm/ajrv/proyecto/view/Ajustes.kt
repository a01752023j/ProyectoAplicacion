package mx.itesm.ajrv.proyecto.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import mx.itesm.ajrv.proyecto.databinding.ActivityMainBinding
import mx.itesm.ajrv.proyecto.databinding.AjustesBinding

class ajustes:AppCompatActivity() {
    private lateinit var binding: AjustesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = AjustesBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

}