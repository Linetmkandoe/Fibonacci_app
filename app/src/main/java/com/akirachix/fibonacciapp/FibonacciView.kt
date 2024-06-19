package com.akirachix.fibonacciapp

import android.provider.BlockedNumberContract.BlockedNumbers
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FibonacciView (var numbers: List<Int>) :RecyclerView.Adapter<DisplayNumbers>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DisplayNumbers {
       var itemView = LayoutInflater.from((parent.context))
           .inflate(R.layout.fibonucci_list_items,parent,false)
        return DisplayNumbers(itemView)
    }

    override fun getItemCount(): Int {
     return numbers.size
    }

    override fun onBindViewHolder(holder: DisplayNumbers, position: Int) {
      holder.tvView.text = numbers[position].toString()
    }

}
class DisplayNumbers(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvView = itemView.findViewById<TextView>(R.id.tvView)

}