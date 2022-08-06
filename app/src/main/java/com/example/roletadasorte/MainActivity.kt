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
        val btn_rodar_roleta = findViewById(R.id.btn_rodar) as Button
        
        // Acessa a propriedade on click do botão
        // onde é chadado o metodo Radom de o a 10
        // e mostrado ao usuário na tela
        btn_rodar_roleta.setOnClickListener{
            var texto = findViewById<TextView>(R.id.text_result)
            var numeroSorteado = Random().nextInt(11)
            texto.text = "Número sorteado é $numeroSorteado"
        }
    }
}