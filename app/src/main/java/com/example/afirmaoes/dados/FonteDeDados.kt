package com.example.afirmaoes.dados

import com.example.afirmaoes.R
import com.example.afirmaoes.modelo.Afirmacao

class FonteDeDados {

    fun carregarDados(): List<Afirmacao>{

        return listOf<Afirmacao>(
            Afirmacao(R.string.afirmacao_1, R.drawable.image1),
            Afirmacao(R.string.afirmacao_2, R.drawable.image2),
            Afirmacao(R.string.afirmacao_3, R.drawable.image3),
            Afirmacao(R.string.afirmacao_4, R.drawable.image4),
            Afirmacao(R.string.afirmacao_5, R.drawable.image5),
            Afirmacao(R.string.afirmacao_6, R.drawable.image6),
            Afirmacao(R.string.afirmacao_7, R.drawable.image7),
            Afirmacao(R.string.afirmacao_8, R.drawable.image8),
            Afirmacao(R.string.afirmacao_9, R.drawable.image9),
            Afirmacao(R.string.afirmacao_10, R.drawable.image10)
        )
    }
}