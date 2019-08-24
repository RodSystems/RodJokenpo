package br.com.fiap.rodjokenpo.Ui.jogo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.fiap.rodjokenpo.R
import kotlinx.android.synthetic.main.activity_jogo.*

class JogoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jogo)
        setExtra()
    }

    fun setExtra()
    {
        tvPlayerName.text = intent.getStringExtra("player")
    }
}
