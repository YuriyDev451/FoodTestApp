package com.gukunov.foodtestapp.feature

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gukunov.foodtestapp.R
import com.gukunov.foodtestapp.databinding.FragmentMainScreenBinding
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.WithFragmentBindings


@AndroidEntryPoint
class MainScreenFragment : Fragment() {

    private lateinit var binding: FragmentMainScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentMainScreenBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }


}