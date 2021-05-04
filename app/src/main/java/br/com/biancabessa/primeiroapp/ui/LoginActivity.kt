package br.com.biancabessa.primeiroapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import br.com.biancabessa.primeiroapp.R
import br.com.biancabessa.primeiroapp.model.User
import com.google.android.material.snackbar.Snackbar

class LoginActivity : AppCompatActivity() {

    lateinit var txtSubTitulo : TextView
    lateinit var btnLogin : Button
    lateinit var editTextEmail: EditText
    lateinit var editTextSenha: EditText
    lateinit var txtViewErro: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        carregarElementos()
        carregarEventosClick()
    }

    fun carregarElementos(){
        btnLogin = findViewById(R.id.button_entrar)
        //txtSubTitulo = findViewById(R.id.textView_subTitulo)
        editTextEmail = findViewById(R.id.editText_email)
        editTextSenha = findViewById(R.id.editText_senha)
        //txtViewErro = findViewById(R.id.textView_erro)
    }

    fun carregarEventosClick(){


        btnLogin.setOnClickListener {
            //txtSubTitulo.text = "Novo texto"
            //Snackbar.make(it, editTextEmail.text, Snackbar.LENGTH_LONG).show()
            //val intent = Intent(this, PrincipalActivity::class.java)
            //startActivity(intent)

            var email = editTextEmail.text.toString()
            var senha = editTextSenha.text.toString()
            var user = User(email = email, senha = senha)

            //txtViewErro.text = ""

            if (user.validarEmail() && user.validarSenha()){
                println("E-mail e Senha VALIDO TRUE")
                val intent = Intent(this, PrincipalActivity::class.java)
                startActivity(intent)
            }
            else{
                //txtViewErro.text = "E-mail ou Senha INVALIDO"
                Snackbar.make(it, "E-mail ou Senha INVALIDO", Snackbar.LENGTH_LONG).show()
            }
            //user.email = "bianca"
        }
    }
}