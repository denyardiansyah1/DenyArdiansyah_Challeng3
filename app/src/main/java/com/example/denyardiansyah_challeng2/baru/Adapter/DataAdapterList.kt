package com.example.denyardiansyah_challeng2.baru.Adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.denyardiansyah_challeng2.R
import com.example.denyardiansyah_challeng2.baru.data.DataList
import com.example.denyardiansyah_challeng2.databinding.ItemListFoodBinding

class DataAdapterList(private val listData : ArrayList<DataList>):RecyclerView.Adapter<DataAdapterList.ViewHolder>() {
    class ViewHolder(var binding : ItemListFoodBinding):RecyclerView.ViewHolder(binding.root) {
            fun bindingList(list : DataList){
                binding.namaMakanan.text = list.name
                binding.txtPrice.text = list.price
                binding.ratingTxt.text = list.rating.toString()
                Glide.with(itemView).load(list.image).into(binding.imgViewMenu)
                binding.root.setOnClickListener {
                    val bundle = Bundle()
                    bundle.putString("inputmakanan", list.name)
                    bundle.putString("inputprice", list.price)
                    bundle.putDouble("inputrating", list.rating)
                    bundle.putInt("inputgambar", list.image)
                    Navigation.findNavController(it).navigate(R.id.action_homeF_to_detailFragment, bundle)
                }
            }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataAdapterList.ViewHolder {
        val binding = ItemListFoodBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DataAdapterList.ViewHolder, position: Int) {
        holder.bindingList(listData[position])
    }

    override fun getItemCount() = listData.size
}