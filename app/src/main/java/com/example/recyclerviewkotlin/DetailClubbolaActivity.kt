package com.example.recyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.recyclerviewkotlin.fragment.HomeFragment

class DetailClubbolaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_clubbola)

        if (supportActionBar !=null){
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            supportActionBar?.setTitle("DETAIL CLUBBOLA")
        }

        val clubbola = intent.getParcelableExtra<Clubbola>(HomeFragment.INTENT_PARCELABLE)

        val imgClubbola = findViewById<ImageView>(R.id.img_item_photo)
        val nameClubbola = findViewById<TextView>(R.id.tv_item_name)
        val descClubbola = findViewById<TextView>(R.id.tv_item_description)

        imgClubbola.setImageResource(clubbola?.imgClubbola!!)
        nameClubbola.text = clubbola.nameClubbola
        descClubbola.text = clubbola.descClubbola
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}