package com.example.androidstudy.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.androidstudy.R
import com.example.androidstudy.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {


    private lateinit var binding : FragmentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)

        binding.storeTap.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_storeFragment)
        }

        binding.bookmarkTap.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_bookmarkFragment)
        }

        binding.talkTap.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_talkFragment)
        }

        binding.tipTap.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_tipFragment)
        }

        return binding.root
    }


}