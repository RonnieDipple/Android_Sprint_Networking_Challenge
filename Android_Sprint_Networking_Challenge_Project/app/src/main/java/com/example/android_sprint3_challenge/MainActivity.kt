package com.example.android_sprint3_challenge

import android.content.Intent
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val progressBar = progress_bar
        val context = this

        image_View_Search_icon.setOnClickListener {



            RetrofitInstance.getPokemon(edit_Text_Search.text.toString()).enqueue(object : Callback<Pokemon> {
                override fun onFailure(call: Call<Pokemon>, t: Throwable) {
                    t.printStackTrace()
                    val response = "Failure: ${t.printStackTrace()}"
                    Toast.makeText(context, response, Toast.LENGTH_SHORT).show()
                }

                override fun onResponse(call: Call<Pokemon>, response: Response<Pokemon>) {

                    if (response.code() == 200 || response.code() == 201) {
                        toggleVisibility(progressBar)
                        val myPokemon: Pokemon? = response.body() // The Json response body
                        val intent = Intent(context, DetailsActivity::class.java)
                        intent.putExtra("id", myPokemon?.id.toString() ) // passes the id from the json body into the intent
                        intent.putExtra("spriteUrl", myPokemon?.sprites?.front_default) // passes the URL from the json body into the intent
                        startActivity(intent) // Starts the activity with the intent


                    }
                }
            })
            toggleVisibility(progressBar)

            

        }



    }

    //makes views visible or invisible

    fun toggleVisibility(view: View){

        view.visibility = if (view.visibility == View.VISIBLE){
            View.INVISIBLE
        }else{
            View.VISIBLE
        }


    }
}
