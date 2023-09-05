package com.example.animationoperations

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationSet
import android.view.animation.BounceInterpolator
import android.view.animation.OvershootInterpolator
import androidx.databinding.DataBindingUtil
import com.example.animationoperations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
         binding.mainactivityobyekt=this

      //    buttonstartanimation()


    }


    fun buttonclick(){
        ardianim()
       // coxluanim()
       // alphaanimasiya()
       // scaleanimasiya()
       // rotateanimasiya()
      //  translationanimation()
    }

    fun alphaanimasiya(){
        val a=ObjectAnimator.ofFloat(binding.textView,"alpha",0.0F,1.0F).apply {

            duration=1000
            repeatCount=ObjectAnimator.INFINITE
            repeatMode=ObjectAnimator.REVERSE
        }

        a.start()

    }

    fun scaleanimasiya(){
        val a=ObjectAnimator.ofFloat(binding.imageView,"scaleX",0.0F,1.0F).apply {
            duration=3000
        }
        a.start()

    }

    fun rotateanimasiya(){
        val a=ObjectAnimator.ofFloat(binding.textView,"rotation",45.0F,90.0F).apply {
            duration=3000
        }
        a.start()

    }
    fun ardianim(){

        val a=ObjectAnimator.ofFloat(binding.imageView,"alpha",0.0F,1.0F)
        val sx=ObjectAnimator.ofFloat(binding.imageView,"scaleX",1.0F,2.0F)
        val sy=ObjectAnimator.ofFloat(binding.imageView,"scaleY",1.0F,3.0F)


        val ard=AnimatorSet().apply {

            duration=1000
            playSequentially(a,sx,sy)
        }

        ard.start()

    }
    fun coxluanim(){

        val a=ObjectAnimator.ofFloat(binding.imageView,"alpha",1.0F,0.0F)
         val sx=ObjectAnimator.ofFloat(binding.imageView,"scaleX",1.0F,2.0F)
        val sy=ObjectAnimator.ofFloat(binding.imageView,"scaleY",1.0F,3.0F)


        val coxlu=AnimatorSet().apply {

            duration=1000
            playTogether(a,sx,sy)
        }

        coxlu.start()

    }
    fun translationanimation(){
        val t=ObjectAnimator.ofFloat(binding.textView,"translationX",0.0F,50F).apply{

            duration=3000
        }
        t.start()
    }

    fun buttonstartanimation() {
        val t = ObjectAnimator.ofFloat(binding.button, "translationY", 800.0F, 0.0F).apply {

            duration = 3000
        }
        t.start()
    }
}