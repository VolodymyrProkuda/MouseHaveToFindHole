package com.mhtfh.mousehavetofindhole


import android.os.Bundle

import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.mhtfh.mousehavetofindhole.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var listImg = mutableListOf<ImageView>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mouseToHole = mutableListOf<Int>(0,4,0,
                                            0,0,4,
                                            8,0,9)
        val mouseWayPicture = listOf<Int>(R.drawable.mouse_left_up_corner,R.drawable.mouse_right_up_corner,R.drawable.mouse_right_down_corner, R.drawable.mouse_left_down_corner,
            R.drawable.mouse_gorizontal, R.drawable.mouse_vertical,R.drawable.mouse_gorizontal, R.drawable.mouse_vertical,
            R.drawable.mouse_mouse,R.drawable.mouse_hole)
        listImg.add(findViewById(R.id.imageView1))
        listImg.add(findViewById(R.id.imageView2))
        listImg.add(findViewById(R.id.imageView3))
        listImg.add(findViewById(R.id.imageView4))
        listImg.add(findViewById(R.id.imageView5))
        listImg.add(findViewById(R.id.imageView6))
        listImg.add(findViewById(R.id.imageView7))
        listImg.add(findViewById(R.id.imageView8))
        listImg.add(findViewById(R.id.imageView9))

        for (i in 0..8){

            listImg[i].setImageResource(mouseWayPicture[mouseToHole[i]])
            listImg[i].setOnClickListener {

                listImg[i].setImageResource(mouseWayPicture[mouseToHole[i]++])
                if (mouseToHole == listOf(2,4,3,1,3,5,8,0,9))  binding.textView.text = "WIN!!!!"

                if (mouseToHole[i] == 4) mouseToHole[i] = 0
                if (mouseToHole[i] == 8) mouseToHole[i] = 4
            }

        }



    }

}