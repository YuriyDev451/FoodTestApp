package com.gukunov.foodtestapp.feature

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.net.http.UrlRequest
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.getSystemService
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.tabs.TabLayout
import com.gukunov.foodtestapp.R
import com.gukunov.foodtestapp.common.NetworkUtils
import com.gukunov.foodtestapp.common.StatusR
import com.gukunov.foodtestapp.databinding.FragmentMainScreenBinding
import com.gukunov.foodtestapp.entity.BannerImage
import com.gukunov.foodtestapp.feature.adapter.BannerAdapter
import com.gukunov.foodtestapp.feature.adapter.MealsAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch


@AndroidEntryPoint
class MainScreenFragment : Fragment() {

    private lateinit var binding: FragmentMainScreenBinding
    private lateinit var adapter: BannerAdapter
    private lateinit var mealsAdapter: MealsAdapter
    private val viewModel: MainScreenViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainScreenBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }


    val list = listOf<BannerImage>(
        BannerImage(image = R.drawable.banner_first),
        BannerImage(image = R.drawable.banner_second)
    )


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initBannerRecyclerAdapter()


        viewModel.categoryData.observe(viewLifecycleOwner) {
            for (category in it.categories) {
                val tab = binding.tabLayout.newTab()
                    .setText(category.strCategory) // Предположим, что категория имеет свойство "name"
                binding.tabLayout.addTab(tab)

            }
            for (i in 0..it.categories.size) {
                val textView =
                    LayoutInflater.from(requireContext()).inflate(R.layout.tab_title, null)
                            as TextView
                binding.tabLayout.getTabAt(i)?.customView = textView
            }
        }


        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {

                tab?.let {
                    val selectedCategory =
                        viewModel.categoryData.value?.categories?.get(it.position)?.strCategory
                    selectedCategory?.let { category ->
                        viewModel.filterMealsByCategory(category)
                    }
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {}
            override fun onTabReselected(tab: TabLayout.Tab?) {}
        })


        initMealRecyclerAdapter()

        lifecycleScope.launch {
            viewModel.getCategories()
        }


        viewModel.filteredData.observe(viewLifecycleOwner) {
            mealsAdapter.setData(it)
        }


    }

    fun initBannerRecyclerAdapter() {
        adapter = BannerAdapter(list)
        binding.horizontalRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.horizontalRecyclerView.adapter = adapter
    }

    fun initMealRecyclerAdapter() {
        mealsAdapter = MealsAdapter()
        binding.mealList.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        binding.mealList.adapter = mealsAdapter
    }


}