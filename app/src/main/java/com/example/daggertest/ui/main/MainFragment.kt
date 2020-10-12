package com.example.daggertest.ui.main

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.daggertest.databinding.MainFragmentBinding
import com.example.daggertest.di.ApplicationComponent
import com.example.daggertest.di.Cat
import com.example.daggertest.di.DaggerApplicationComponent
import javax.inject.Inject

class MainFragment : Fragment() {

    private val mainViewModel by viewModels<MainViewModel>()
    private lateinit var mainFragmentBinding: MainFragmentBinding

    @Inject
    lateinit var cat: Cat

    companion object {
        fun newInstance() = MainFragment()
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        DaggerApplicationComponent.builder().build().inject(this)
        mainFragmentBinding = MainFragmentBinding.inflate(inflater, container, false)
        Log.i("TAG", "onCreateView: $cat")
        return mainFragmentBinding.root
    }

}