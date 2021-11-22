package com.example.afirmaoes.adaptador

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.afirmaoes.R
import com.example.afirmaoes.modelo.Afirmacao

class ItemAdaptador(private val contexto: Context,
                    private val conjuntoDeDados: List<Afirmacao>
                    ): RecyclerView.Adapter<ItemAdaptador.SuporteVisualizacao>() {

    class SuporteVisualizacao(private val imagem: View): RecyclerView.ViewHolder(imagem){

        val textView: TextView = imagem.findViewById(R.id.item_titulo)
        val imagemView: ImageView = imagem.findViewById(R.id.item_imagem)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuporteVisualizacao {

        val adaptadorLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.lista_item, parent, false)

        return SuporteVisualizacao(adaptadorLayout)
    }

    override fun onBindViewHolder(holder: SuporteVisualizacao, posicao: Int) {

        val item = conjuntoDeDados[posicao]
        holder.textView.text = contexto.resources.getString(item.idDaString)
        holder.imagemView.setImageResource(item.idDaImagem)

    }

    override fun getItemCount(): Int {
        return conjuntoDeDados.size
    }
}