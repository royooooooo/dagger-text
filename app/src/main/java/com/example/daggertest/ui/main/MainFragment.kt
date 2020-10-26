package com.example.daggertest.ui.main

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.daggertest.MyApplication
import com.example.daggertest.databinding.MainFragmentBinding
import com.example.daggertest.model.repository.UserRemoteDataSource
import javax.inject.Inject

class MainFragment : Fragment() {

    private val mainViewModel by viewModels<MainViewModel>()
    private lateinit var mainFragmentBinding: MainFragmentBinding

    @Inject
    lateinit var userRemoteDataSource: UserRemoteDataSource

    companion object {
        fun newInstance() = MainFragment()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (activity?.application as MyApplication).applicationComponent.inject(this)
//        Log.i("TAG", "onCreateView: " + userRemoteDataSource.getUserList())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mainFragmentBinding = MainFragmentBinding.inflate(inflater, container, false)
        return mainFragmentBinding.root
    }

}