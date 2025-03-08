package com.example.basicbookapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.basicbookapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var booksArrayList: ArrayList<Books>
    private lateinit var adapter: BooksAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rv.setHasFixedSize(true)
        binding.rv.layoutManager=StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        val b1=Books(1,"Aşkımız Eski Bir Roman","aebr",119.99)
        val b2=Books(2,"Kürk Mantolu Madonna","kmm",139.99)
        val b3=Books(3,"Toprak Ana","ta",99.99)
        val b4=Books(4,"Çalıkuşu","ck",199.99)
        val b5=Books(5,"Beyaz Diş","bd",129.99)
        val b6=Books(6,"Beyoğlunun En Güzel Abisi","bega",169.99)

        booksArrayList=ArrayList<Books>()
        booksArrayList.add(b1)
        booksArrayList.add(b2)S
        booksArrayList.add(b3)
        booksArrayList.add(b4)
        booksArrayList.add(b5)
        booksArrayList.add(b6)
        adapter=BooksAdapter(this,booksArrayList)
        binding.rv.adapter=adapter





    }
}