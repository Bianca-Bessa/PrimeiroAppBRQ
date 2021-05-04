package br.com.biancabessa.primeiroapp.model

open class Carro(
        open val nome: String,
        open val ano: Int,
        open val cor: CarroCor
) : Automovel() {

    override fun acelerar(){
        super.acelerar()
        println("$nome esta acelerando...")
    }

    private fun frear(){
        println("$nome parado.")
    }

    fun buscarDescricaoCompleta(): String{
        frear()
        return "$nome --- $ano --- $cor"
    }
}