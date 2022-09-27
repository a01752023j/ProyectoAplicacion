package mx.itesm.ajrv.proyecto

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import mx.itesm.ajrv.proyecto.databinding.ActivityMainBinding
import mx.itesm.ajrv.proyecto.databinding.GeneralBinding

class general : AppCompatActivity() {
    private lateinit var binding: GeneralBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = GeneralBinding.inflate(layoutInflater)

        
    }

}