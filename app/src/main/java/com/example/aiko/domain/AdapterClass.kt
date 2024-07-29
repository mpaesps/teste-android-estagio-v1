package com.example.aiko.domain

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.aiko.R

class AdapterClass  (private var dataList:ArrayList<DataClass>): RecyclerView.Adapter<AdapterClass.ViewHolderClass>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return ViewHolderClass(itemView)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {
        val currentItem = dataList[position]
        holder.rvImage.setImageResource(currentItem.dataImage)
        holder.rvTitle.text=currentItem.dataTitle
    }

    class ViewHolderClass(itemView: View):RecyclerView.ViewHolder(itemView){
        val rvImage:ImageView=itemView.findViewById(R.id.imagem)
        val rvTitle: TextView =itemView.findViewById(R.id.titulo)
    }
    fun updateData(newDataList: ArrayList<DataClass>) {
        dataList = newDataList
        notifyDataSetChanged()
    }


}
