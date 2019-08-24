package br.com.fiap.rodjokenpo.Ui.jogador

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.fiap.rodjokenpo.R
import br.com.fiap.rodjokenpo.Ui.jogo.JogoActivity
import kotlinx.android.synthetic.main.activity_jogador.*

class JogadorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jogador)

        btNextStep.setOnClickListener {
            val nextScreen = Intent(this, JogoActivity::class.java)
            nextScreen.putExtra("player", inputPlayer.text.toString())
            startActivity(nextScreen)
        }
    }
}
