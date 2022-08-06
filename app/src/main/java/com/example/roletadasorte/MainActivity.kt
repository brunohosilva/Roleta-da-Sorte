package com.example.roletadasorte

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import android.widget.Button
import android.widget.EditText
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
            val textoNumeroDigitado  = findViewById<EditText>(R.id.input_numero)
            val textoResultado = findViewById<TextView>(R.id.text_result)
            val textoSorteado = findViewById<TextView>(R.id.text_valor_sorteado)

            val numeroSorteado = Random().nextInt(11)
            val intNumeroDigitado = textoNumeroDigitado.text.toString().toInt()
            val intNumeroSorteado = numeroSorteado.toString().toInt()

            if (intNumeroDigitado < 0 || intNumeroDigitado > 10 ) {
                val renderText = "Erro: Digite valores entre 0 e 10"
                textoResultado.text = renderText
            } else {
                if(intNumeroDigitado >= numeroSorteado) {
                    val renderText = "Parabens o numero digitado é maior que o sorteado"
                    val renderTextSorteado = "Valor sorteado: $intNumeroSorteado"
                    textoResultado.text = renderText
                    textoSorteado.text = renderTextSorteado
                } else {
                    val renderText = "Infelizmente o numero digitado é menor que o sorteado"
                    val renderTextSorteado = "Valor sorteado: $intNumeroSorteado"
                    textoResultado.text = renderText
                    textoSorteado.text = renderTextSorteado
                }
            }
        }
    }
}

