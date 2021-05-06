    package br.com.biancabessa.primeiroapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.biancabessa.primeiroapp.R
import br.com.biancabessa.primeiroapp.model.AnimalDomestico
import br.com.biancabessa.primeiroapp.model.AnimalEspecie
import br.com.biancabessa.primeiroapp.model.Genero

class TerceiraTelaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terceira_tela)

        val gato = AnimalDomestico(nomeRaca = AnimalEspecie.MAMIFEROS, tempoDeVida = 18, nome = "Frajola", idade = 2, sexo = Genero.MASCULINO)

        val descricao = gato.descricaoAnimal()
        println(descricao)
    }
}