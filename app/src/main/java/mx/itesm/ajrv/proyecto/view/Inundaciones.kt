package mx.itesm.ajrv.proyecto.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import mx.itesm.ajrv.proyecto.databinding.ActivityInundacionesBinding
import mx.itesm.ajrv.proyecto.viewmodel.InundacionesVM

class Inundaciones : AppCompatActivity() {
    private lateinit var binding: ActivityInundacionesBinding
    private val viewModel: InundacionesVM by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInundacionesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        println("Estoy en inundaciones")
        viewModel.descargarDatosInundacion()
    }

}