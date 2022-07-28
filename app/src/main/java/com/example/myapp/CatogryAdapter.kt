package com.example.myapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapp.data.domin.Catogry
import com.example.myapp.databinding.CatogryButtonBinding

class CatogryAdapter(private val items: List<Catogry>): RecyclerView.Adapter<CatogryAdapter.CatogryViewHolder>()  {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatogryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.catogry_button,parent,false)
        return CatogryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CatogryViewHolder, position: Int) {
        val currentitem=items[position]
        holder.binding.apply {
            labelName.text=currentitem.name
        }
    }

    override fun getItemCount()=items.size


    class CatogryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = CatogryButtonBinding.bind(itemView)
    }

}