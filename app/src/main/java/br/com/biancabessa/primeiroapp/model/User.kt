package br.com.biancabessa.primeiroapp.model

class User (
    var email: String,
    var senha: String,

    ){

    fun validarEmail() : Boolean{
        return email != ""
    }

    fun validarSenha() : Boolean{
        return senha != "" && senha.length >= 6
    }

    //sobrescreve as funções
    override fun toString(): String {
        return "$email $senha"
    }
}