package com.example.android_sprint3_challenge

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity(), Callback<Pokemon> {
    override fun onFailure(call: Call<Pokemon>, t: Throwable) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onResponse(call: Call<Pokemon>, response: Response<Pokemon>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        image_View_Search_icon.setOnClickListener {

        }

        RetrofitInstance.getPokemon().enqueue(this)

    }

    fun toggleVisibility(view: View){

        view.visibility = if (view.visibility == View.VISIBLE){
            View.INVISIBLE
        }else{
            View.VISIBLE
        }


    }
}
