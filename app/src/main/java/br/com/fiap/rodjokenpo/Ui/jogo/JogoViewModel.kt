package br.com.fiap.rodjokenpo.Ui.jogo

import android.os.Parcelable
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.fiap.rodjokenpo.R
import br.com.fiap.rodjokenpo.model.Constantes
import kotlinx.android.parcel.Parcelize
import kotlin.random.Random

class JogoViewModel : ViewModel() {

    val venceu = MutableLiveData<Boolean>()

    fun configuraImagem(resourceID: Int, imageView: ImageView) {
        imageView.setImageDrawable(ContextCompat.getDrawable(this, resourceID))
    }

    fun configuraImagemDaJogada(jogadaPlayer: Int, imageView: ImageView) {
        when(jogadaPlayer) {
            Constantes.PAPEL -> {configuraImagem(R.drawable.papel, imageView)}
            Constantes.PEDRA -> {configuraImagem(R.drawable.pedra, imageView)}
            Constantes.TESOURA -> {configuraImagem(R.drawable.tesoura, imageView)}
        }
    }

    fun realizarJogada(jogadaPlayer: Int) {
        val jogadaAndroid = Random.nextInt(3)

        configuraImagemDaJogada(jogadaPlayer, ivJogadaPlayer)
        configuraImagemDaJogada(jogadaAndroid, ivJogadaPlayer)


        when (jogadaPlayer) {
            Constantes.PAPEL -> {
                when(jogadaAndroid) {
                    Constantes.PAPEL -> {empate()}
                    Constantes.PEDRA -> {vitoria()}
                    Constantes.TESOURA -> {derrota()}
                }
            }

            Constantes.PEDRA -> {
                when(jogadaAndroid) {
                    Constantes.PAPEL -> {derrota()}
                    Constantes.PEDRA -> {empate()}
                    Constantes.TESOURA -> {vitoria()}
                }
            }

            Constantes.TESOURA -> {
                when(jogadaAndroid) {
                    Constantes.PAPEL -> {vitoria()}
                    Constantes.PEDRA -> {derrota()}
                    Constantes.TESOURA -> {empate()}
                }
            }
        }
    }

    fun vitoria() {
        tvStatusRodada.text = "Você venceu"
    }

    fun empate() {
        tvStatusRodada.text = "Você empatou"
    }

    fun derrota() {
        tvStatusRodada.text = "Você perdeu"
    }

}