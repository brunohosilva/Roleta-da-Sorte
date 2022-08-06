package com.example.roletadasorte

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        // Declarado variavel para resgatar o objeto do botão na view     
        val btnRodarRoleta = findViewById<Button>(R.id.btn_rodar)
        
        // Acessa a propriedade on click do botão
        // onde é chadado o metodo Radom de o a 10
        // e mostrado ao usuário na tela
        btnRodarRoleta.setOnClickListener{
            val texto = findViewById<TextView>(R.id.text_result)
            val numeroSorteado = Random().nextInt(2)
            val renderText = "Número sorteado é $numeroSorteado"
            texto.text = renderText
        }
    }
}