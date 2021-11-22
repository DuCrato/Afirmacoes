package com.example.afirmaoes.modelo

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Afirmacao(@StringRes   val idDaString: Int,
                     @DrawableRes val idDaImagem: Int) {
}