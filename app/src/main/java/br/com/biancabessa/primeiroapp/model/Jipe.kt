package br.com.biancabessa.primeiroapp.model

class Jipe(
        override val nome: String,
        override val ano: Int,
        override val cor: CarroCor,
        val numeroDoChassi: Int

) : Carro(nome, ano, cor) {

    fun descricaoJipe(): String{
        return "$numeroDoChassi"
    }
}