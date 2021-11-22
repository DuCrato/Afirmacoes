package com.example.afirmaoes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.afirmaoes.adaptador.ItemAdaptador
import com.example.afirmaoes.dados.FonteDeDados

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val meuConjuntoDeDados = FonteDeDados().carregarDados()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        recyclerView.adapter = ItemAdaptador(this, meuConjuntoDeDados)
        recyclerView.setHasFixedSize(true)
    }
}