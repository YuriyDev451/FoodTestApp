package com.gukunov.foodtestapp.feature

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.gukunov.foodtestapp.R
import com.gukunov.foodtestapp.databinding.FragmentMainScreenBinding
import com.gukunov.foodtestapp.entity.BannerImage
import com.gukunov.foodtestapp.feature.adapter.BannerAdapter
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.WithFragmentBindings


@AndroidEntryPoint
class MainScreenFragment : Fragment() {

    private lateinit var binding: FragmentMainScreenBinding
    private lateinit var adapter: BannerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentMainScreenBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }


    val list = listOf<BannerImage>(
        BannerImage(image = R.drawable.banner_first),
        BannerImage(image = R.drawable.banner_second)
    )


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerAdapter()


        val tab1 = binding.tabLayout.newTab().setText("Пицца")
        val tab2 = binding.tabLayout.newTab().setText("Комбо")
        val tab3 = binding.tabLayout.newTab().setText("Десерты")

        binding.tabLayout.addTab(tab1)
        binding.tabLayout.addTab(tab2)
        binding.tabLayout.addTab(tab3)

        for (i in 0..3 ){
            val textView = LayoutInflater.from(requireContext()).inflate(R.layout.tab_title, null)
            as TextView
            binding.tabLayout.getTabAt(i)?.customView = textView
        }

    }

    fun initRecyclerAdapter() {
        adapter = BannerAdapter(list)
        binding.horizontalRecyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.horizontalRecyclerView.adapter = adapter
    }
}