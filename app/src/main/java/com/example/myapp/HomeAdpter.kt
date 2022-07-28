package com.example.myapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapp.data.domin.HomeItem
import com.example.myapp.data.domin.Catogry
import com.example.myapp.data.domin.Post
import com.example.myapp.data.domin.enumm.HomeItemType
import com.example.myapp.databinding.CardPostBinding
import com.example.myapp.databinding.CatogryButtonListBinding

class HomeAdpter(private  val items:List<HomeItem<Any>>): RecyclerView.Adapter<HomeAdpter.BaseHomeViewHolder>() {


    override fun getItemCount()=items.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseHomeViewHolder {
       return when(viewType){
           VIEW_TYPE_CATOGRY ->{
               val view = LayoutInflater.from(parent.context).inflate(R.layout.catogry_button_list,parent,false)
               CatogryListViewHolder(view)
           }
           VIEW_TYPE_POST ->{
               val view = LayoutInflater.from(parent.context).inflate(R.layout.card_post,parent,false)
               CardPostViewHolder(view)
              }
           else -> throw Exception("UNKNOWN VIEW TYPE")
       }
    }

    override fun onBindViewHolder(holder: BaseHomeViewHolder, position: Int) {
        when(holder){
            is CatogryListViewHolder -> bindCatogry(holder,position)
            is CardPostViewHolder -> bindPost(holder,position)
        }
    }

    private fun bindPost(holder: CardPostViewHolder, position: Int) {
     val currentitem=items[position].item as Post
        holder.binding.apply {
            nameOfLabel.text=currentitem.name
            labelItemContent.text=currentitem.content
            Glide.with(this.root.context).load(currentitem.ImageUrl).into(postImage)
        }
    }

    private fun bindCatogry(holder: CatogryListViewHolder, position: Int) {
       val catogry=items[position].item as List<Catogry>
        val adapter=CatogryAdapter(catogry)
        holder.binding.apply {
            recyclerCatogry.adapter=adapter
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when(items[position].type){
            HomeItemType.TYPE_CATOGRY -> VIEW_TYPE_CATOGRY
            HomeItemType.TYPE_POST -> VIEW_TYPE_POST
        }
    }
    abstract class BaseHomeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
     class CatogryListViewHolder(itemView: View) : BaseHomeViewHolder(itemView) {
         val binding = CatogryButtonListBinding.bind(itemView)
    }
    class CardPostViewHolder(itemView: View) : BaseHomeViewHolder(itemView) {
         val binding = CardPostBinding.bind(itemView)
    }

    companion object{
        private  const val VIEW_TYPE_CATOGRY=1
        private  const val VIEW_TYPE_POST=2
    }
}