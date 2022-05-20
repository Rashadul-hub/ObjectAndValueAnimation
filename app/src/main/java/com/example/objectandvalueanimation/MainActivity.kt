package com.example.objectandvalueanimation

import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.objectandvalueanimation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Animation With Value Animator & Animation With Object Animator


        // This os 'Object' Animator Process
        ObjectAnimator.ofFloat(binding.ivCar, View.TRANSLATION_Y, -1000F).apply {
            duration = 1000
            start()
        }
        binding.btnRotate.setOnClickListener {
            ObjectAnimator.ofFloat(binding.ivCar, View.ROTATION, 0F, 180F).apply {
                duration = 1000
                start()
            }
        }
        binding.btnMoveDown.setOnClickListener {
            ObjectAnimator.ofFloat(binding.ivCar, View.TRANSLATION_Y, 10F).apply {
                duration = 1000
                start()
            }
            binding.btnMoveUp.setOnClickListener {
                ObjectAnimator.ofFloat(binding.ivCar, View.TRANSLATION_Y, 0F, -1000F).apply {
                    duration = 1000
                    start()
                }
            }
        }


        //This is 'Value' Animator Process
//
//        binding.btnMoveUp.setOnClickListener {
//            ValueAnimator.ofFloat(0F,-1000F).apply {
//                duration = 2000
//                start()
//                addUpdateListener {
//                    val animatedValue = it.animatedValue as Float
//                    binding.ivCar.translationY = animatedValue
//                }
//            }
    }

}

