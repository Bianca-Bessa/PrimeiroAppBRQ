package br.com.biancabessa.primeiroapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import br.com.biancabessa.primeiroapp.R
import br.com.biancabessa.primeiroapp.model.*

class PrincipalActivity : AppCompatActivity() {

    lateinit var btnTelaPrincipal : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        val gato = AnimalDomestico(nomeRaca = AnimalEspecie.MAMIFEROS, tempoDeVida = 18, nome = "Frajola", idade = 2, sexo = Genero.MASCULINO)

        val descricao = gato.descricaoAnimal()
        println(descricao)

        val gol = Carro(nome = "Gol", ano = 2015, cor = CarroCor.VERMELHO)
        gol.acelerar()
        val descricaoCarro = gol.buscarDescricaoCompleta()
        println(descricaoCarro)

        val jipe = Jipe(nome = "jeep", ano = 2015, cor = CarroCor.VERMELHO, numeroDoChassi = 1234)
        //Vem da classe automovel
        jipe.parar()

        val descricaoJipe = jipe.descricaoJipe()
        println(descricaoJipe)

        carregarElementos()
        carregarEventosClick()
    }

    fun carregarElementos(){
        btnTelaPrincipal = findViewById(R.id.button_telaPrincipal)
    }

    fun carregarEventosClick(){
        btnTelaPrincipal.setOnClickListener {

            val intent = Intent(this, TerceiraTelaActivity::class.java)
            startActivity(intent)
        }
    }
}