package com.gukunov.foodtestapp.feature.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.gukunov.foodtestapp.databinding.BannerCardItemBinding
import com.gukunov.foodtestapp.entity.BannerImage

class BannerAdapter(private val dataList: List<BannerImage>) : RecyclerView.Adapter<BannerAdapter.AllBurgerAdapterViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AllBurgerAdapterViewHolder {
        val inflate = LayoutInflater.from(parent.context)
        val binding = BannerCardItemBinding.inflate(inflate, parent, false)
        return AllBurgerAdapterViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: AllBurgerAdapterViewHolder, position: Int) {

        val currentItem = dataList[position]
        holder.bind(currentItem)
    }




    inner class AllBurgerAdapterViewHolder(private val binding: BannerCardItemBinding) :
        RecyclerView.ViewHolder(binding.root) {


        fun bind(viewModel: BannerImage){


            val context = binding.root.context
            val resourceId = context.resources.getIdentifier(viewModel.image.toString(), "drawable", context.packageName)
            binding.imageView.setImageResource(resourceId)




        }


    }
}