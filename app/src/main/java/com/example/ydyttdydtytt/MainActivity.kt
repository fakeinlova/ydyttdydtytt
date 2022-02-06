package com.example.ydyttdydtytt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.cardi.*
import okhttp3.Request
import okio.Timeout
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rec  = findViewById<RecyclerView>(R.id.recycle)
        val recyl = listOf<Model>(
            Model("tv1", "tv2"),
            Model("tv1", "tv2"),
            Model("tv1", "tv2"),
            Model("tv1", "tv2")
        )
        rec.adapter = Adapter(recyl)
        rec.layoutManager = LinearLayoutManager(this)


        val service = Inst.api
        val call = service.getR()
        call.enqueue(object : Callback<Modell>{
            override fun onResponse(call: Call<Modell>, response: Response<Modell>) {
                Log.d("RET", response.body().toString())
                val result : List<Modell>  = response.body() as List<Modell>
                textView2.text = result[0].message
            }

            override fun onFailure(call: Call<Modell>, t: Throwable) {
                Log.d("RET", t.toString())
            }
        })
    }

}