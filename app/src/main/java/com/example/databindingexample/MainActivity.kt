package com.example.databindingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databindingexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        var btnsubmit = binding.btnsubmit

        btnsubmit.setOnClickListener{
            var editname : String = binding.txteditname.text.toString()
            var editoccupation : String = binding.txteditoccupation.text.toString()

            var person : Person = Person(editname,editoccupation)

            binding.p = person
        }
    }

}
