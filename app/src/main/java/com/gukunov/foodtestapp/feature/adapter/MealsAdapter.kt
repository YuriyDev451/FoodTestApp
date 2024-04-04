package com.gukunov.foodtestapp.feature.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.example.Meals
import com.gukunov.foodtestapp.databinding.MealItemBinding
import com.gukunov.foodtestapp.entity.meal.mealUImodel.MealsStateUIModel
import com.gukunov.foodtestapp.entity.meal.mealUImodel.MealsUIModel
import java.lang.StringBuilder

class MealsAdapter: RecyclerView.Adapter<MealsAdapter.AllBurgerAdapterViewHolder>() {

    private val differ = AsyncListDiffer(this, diffCallback)


    fun setData(items: MealsStateUIModel) {
        differ.submitList(items.meals)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AllBurgerAdapterViewHolder {
        val inflate = LayoutInflater.from(parent.context)
        val binding = MealItemBinding.inflate(inflate, parent, false)
        return AllBurgerAdapterViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    override fun onBindViewHolder(holder: AllBurgerAdapterViewHolder, position: Int) {

        differ.currentList.getOrNull(position)?.let {
            holder.bind(it)

        }
    }



    companion object{
        private val diffCallback = object : DiffUtil.ItemCallback<MealsUIModel>(){
            override fun areItemsTheSame(
                oldItem: MealsUIModel,
                newItem: MealsUIModel
            ): Boolean {
                return oldItem.idMeal==newItem.idMeal
            }

            override fun areContentsTheSame(
                oldItem: MealsUIModel,
                newItem: MealsUIModel
            ): Boolean {
                return oldItem==newItem
            }

        }

    }


    inner class AllBurgerAdapterViewHolder(private val binding: MealItemBinding) :
        RecyclerView.ViewHolder(binding.root) {


        fun bind(viewModel: MealsUIModel){

            Glide.with(binding.root).load(viewModel.strMealThumb).into(binding.mealImage)


            binding.mealName.text = viewModel.strMeal

            val ingredientsBuilder = StringBuilder()

            viewModel.strIngredient1.let { ingredientsBuilder.append("$it,") }
            viewModel.strIngredient2.let { ingredientsBuilder.append("$it,") }
            viewModel.strIngredient3.let { ingredientsBuilder.append("$it,") }
            viewModel.strIngredient4.let { ingredientsBuilder.append("$it,") }
            viewModel.strIngredient5.let { ingredientsBuilder.append("$it,") }
            viewModel.strIngredient6.let { ingredientsBuilder.append("$it,") }
            viewModel.strIngredient7.let { ingredientsBuilder.append("$it,") }
            viewModel.strIngredient8.let { ingredientsBuilder.append("$it,") }
            viewModel.strIngredient9.let { ingredientsBuilder.append("$it,") }
            viewModel.strIngredient10.let { ingredientsBuilder.append("$it,") }
            viewModel.strIngredient11.let { ingredientsBuilder.append("$it,") }
            viewModel.strIngredient12.let { ingredientsBuilder.append("$it,") }
            viewModel.strIngredient13.let { ingredientsBuilder.append("$it,") }
            viewModel.strIngredient14.let { ingredientsBuilder.append("$it,") }
            viewModel.strIngredient15.let { ingredientsBuilder.append("$it,") }
            viewModel.strIngredient16.let { ingredientsBuilder.append("$it,") }
            viewModel.strIngredient17.let { ingredientsBuilder.append("$it,") }
            viewModel.strIngredient18.let { ingredientsBuilder.append("$it,") }
            viewModel.strIngredient19.let { ingredientsBuilder.append("$it,") }
            viewModel.strIngredient20.let { ingredientsBuilder.append("$it,") }

            val ingredientsString = ingredientsBuilder.toString().trimEnd(',', ' ')


            binding.ingredients.text = ingredientsString
        }


    }
}