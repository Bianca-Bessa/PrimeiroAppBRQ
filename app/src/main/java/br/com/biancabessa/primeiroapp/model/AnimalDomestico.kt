package br.com.biancabessa.primeiroapp.model

open class AnimalDomestico(

        override val nomeRaca: AnimalEspecie,
        override val tempoDeVida: Int,
        val nome: String,
        val idade: Int,
        val sexo: Genero

        ): Raca(nomeRaca, tempoDeVida){

            open fun descricaoAnimal(): String{
                return "$nomeRaca, $tempoDeVida, $nome, $idade, $sexo"
            }
}