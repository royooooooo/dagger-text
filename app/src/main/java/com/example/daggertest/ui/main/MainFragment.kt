package com.example.daggertest.ui.main

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.daggertest.databinding.MainFragmentBinding
import com.example.daggertest.model.Cat
import com.example.daggertest.ui.viewmodel.MainViewModel

class MainFragment : Fragment() {

    private val mainViewModel by viewModels<MainViewModel>()
    private lateinit var mainFragmentBinding: MainFragmentBinding

    companion object {
        fun newInstance() = MainFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mainFragmentBinding = MainFragmentBinding.inflate(inflater, container, false)
        mainViewModel.userInfo.observe(viewLifecycleOwner,
            Observer<Array<Cat>> { cat -> Log.i("TAG", "source : ${cat[0].type}") })
        return mainFragmentBinding.root
    }

}