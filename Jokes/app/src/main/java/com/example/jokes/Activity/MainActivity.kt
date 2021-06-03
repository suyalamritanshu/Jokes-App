package com.example.jokes.Activity

import android.R.attr.label
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModelProvider
import com.example.jokes.Model.JokesViewmodel
import com.example.jokes.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    lateinit var jokesViewmodel: JokesViewmodel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        this.getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()


        jokesViewmodel = ViewModelProvider(this).get(JokesViewmodel::class.java)


        mainJokes.text = jokesViewmodel.getRandomJokes()
        nextJokes.setOnClickListener{
            mainJokes.text = jokesViewmodel.getRandomJokes()
        }

        copyJokes.setOnClickListener{
            val clipboard: ClipboardManager = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
            val clip = ClipData.newPlainText("Random Jokes", mainJokes.text)
            clipboard.setPrimaryClip(clip)
            Toast.makeText(this, "Copied to Clipboard.", Toast.LENGTH_SHORT).show()
        }



        changeBack.setOnClickListener{
            val random = (1 until 4).random()
            when(random){
                1->{
                  mainBack.background=ContextCompat.getDrawable(this, R.drawable.background_1)
                }
                2->{
                    mainBack.background=ContextCompat.getDrawable(this, R.drawable.background_2)
                    }
                3->{
                    mainBack.background=ContextCompat.getDrawable(this, R.drawable.background_3)

                }

                4->{
                    mainBack.background=ContextCompat.getDrawable(this, R.drawable.background_4)
                }
            }
        }
    }
}