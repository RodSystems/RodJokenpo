package br.com.fiap.rodjokenpo.Ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.fiap.rodjokenpo.R
import br.com.fiap.rodjokenpo.Ui.jogador.JogadorActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btNewGame.setOnClickListener {
            val nextScreen = Intent(this, JogadorActivity::class.java)
            startActivity(nextScreen)
        }

        btExit.setOnClickListener {
            finish()
        }

    }
}
