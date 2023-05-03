package com.example.trent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import java.nio.ByteOrder

class View_productsActivity : AppCompatActivity() {
    lateinit var mImgOrder:ImageView
    lateinit var mImgPickUp:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_products)
        mImgOrder = findViewById(R.id.mImgOrder)
        mImgPickUp = findViewById(R.id.mImgPick_Up)
        // setting onclick listeners
        mImgOrder.setOnClickListener {
            var agiza = Intent(this,OrderActivity::class.java)
            startActivity(agiza)}
        mImgPickUp.setOnClickListener {
                var endea = Intent(this,Self_PickUpActivity::class.java)
                startActivity(endea)}
    }
}
