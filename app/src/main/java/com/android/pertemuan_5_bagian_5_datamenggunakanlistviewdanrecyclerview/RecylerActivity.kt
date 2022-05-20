package com.android.pertemuan_5_bagian_5_datamenggunakanlistviewdanrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recyler.*

class RecylerActivity : AppCompatActivity() {
    //deklarasi
    var dataBuah =
        arrayOf("alpukat","durian","jambuair","manggis","strawberry")
    var dataGambar= arrayOf(
        R.drawable.bg1,
        R.drawable.bg2,
        R.drawable.bg3,
        R.drawable.bg4,
        R.drawable.bg5)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyler)
        //custom adapter, nnt dibuatkan constructor nnti akan di buat contrut di custom adpater
        var adapter = CustomAdapter(this, dataBuah, dataGambar)
        //buat layout manaager
        var liner = LinearLayoutManager(applicationContext)
        //manggil listnya
        recylerview.adapter = adapter
        recylerview.layoutManager = liner
    }
}
