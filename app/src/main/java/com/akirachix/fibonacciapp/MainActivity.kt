package com.akirachix.fibonacciapp

import android.app.Activity
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.akirachix.fibonacciapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val numbers = displayfibonnacci(100)
        binding.recycleview1.layoutManager=LinearLayoutManager(this)

        val numberAdapter = FibonacciView(numbers)
        binding.recycleview1.adapter=numberAdapter

        }
    fun displayfibonnacci(l:Int):List<Int>{
        val numbers = mutableListOf(0,1)
        while (numbers.size<l){
            numbers.add(numbers[numbers.lastIndex] + numbers[numbers.lastIndex-1])
        }
        return numbers

    }
    }
