package com.example.android_sprint3_challenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class DetailsActivity : AppCompatActivity()/*, Callback<Pokemon> */{
    lateinit var myText: String
   /* override fun onFailure(call: Call<Pokemon>, t: Throwable) {
        t.printStackTrace()
        val response = "Failure: ${t.printStackTrace()}"
        Toast.makeText(this, response, Toast.LENGTH_SHORT).show()
    }

    override fun onResponse(call: Call<Pokemon>, response: Response<Pokemon>) {
        val myPokemon: Pokemon? = response.body()
        for (i in 0 until myPokemon?.types?.lastIndex!!.toInt()){
            myText = myPokemon?.id.toString()

        }


    }*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
    }
}
