package com.example.viewmodel_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.textfield.TextInputLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: TestViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel= ViewModelProvider(this)[TestViewModel::class.java]

        viewModel.currentNumber.observe(this, Observer {
            number_text.text=it.toString()
        })

        viewModel.currentId.observe(this, Observer {
            id_customerId.editText!!.text=it
            Log.d("qwe",it.toString())
        })


        increment_button.setOnClickListener {
            viewModel.currentNumber.value=++viewModel.number
            val customerId=findViewById<TextInputLayout>(R.id.id_customerId)
            val input=customerId.editText!!.text
            viewModel.currentId.value=input
            Log.d("qwe",input.toString())
        }

    }




}
