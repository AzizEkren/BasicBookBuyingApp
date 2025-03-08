package com.example.basicbookapplication

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class BooksAdapter(private val mContext: Context,private val booksList:List<Books>)
    :RecyclerView.Adapter<BooksAdapter.CardDesignObjectsHolder>() {
    inner class CardDesignObjectsHolder(view:View):RecyclerView.ViewHolder(view){
        var imageViewBookİmage:ImageView
        var textViewBookTittle:TextView
        var textViewBookPrice:TextView
        var buttonAddToCard:Button
        init {
            imageViewBookİmage=view.findViewById(R.id.imageViewBookİmage)
            textViewBookTittle=view.findViewById(R.id.textViewBookTittle)
            textViewBookPrice=view.findViewById(R.id.textViewBookPrice)
            buttonAddToCard=view.findViewById(R.id.buttonAddToCard)

        }
    }

    override fun getItemCount(): Int {

            Log.e("BooksAdapter", "Books list size: ${booksList.size}")
            return booksList.size

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignObjectsHolder {
        val tasarim=LayoutInflater.from(mContext).inflate(R.layout.card_book_design,parent,false)
        return CardDesignObjectsHolder(tasarim)
    }

    override fun onBindViewHolder(holder: CardDesignObjectsHolder, position: Int) {
        val book=booksList[position]
        holder.textViewBookTittle.text=book.book_name
        holder.textViewBookPrice.text=book.book_price.toString()
        holder.imageViewBookİmage.setImageResource(mContext.resources.getIdentifier(book.book_image_name,"drawable",mContext.packageName))

        holder.buttonAddToCard.setOnClickListener {
            Toast.makeText(mContext,"${book.book_name} Added To Card",Toast.LENGTH_SHORT).show()

        }

    }
}