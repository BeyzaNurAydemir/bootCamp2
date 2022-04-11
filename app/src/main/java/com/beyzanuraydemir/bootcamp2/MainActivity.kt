package com.beyzanuraydemir.bootcamp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import java.util.RandomAccess
import kotlin.random.Random as Random

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var button: Button
    private  var dice: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button= findViewById(R.id.mybutton)
        dice= findViewById(R.id.imageView)

        button.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.mybutton -> {
                rollDice()
            }

        }
    }

    private fun rollDice(){
        val randomInt = java.util.Random().nextInt(6)+1
        val drawableSource = when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6


        }
        dice?.setImageResource(drawableSource)


    }
}