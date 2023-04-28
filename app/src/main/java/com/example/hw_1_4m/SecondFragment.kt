@file:Suppress("UNCHECKED_CAST")

package com.example.hw_1_4m

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.hw_1_4m.databinding.FragmentSecondBinding


@Suppress("DEPRECATION")
class SecondFragment : Fragment(), MainAdapter.SelectedListener {

    private lateinit var binding: FragmentSecondBinding
    private lateinit var adapter : MainAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val value = arguments?.getSerializable("key") as ArrayList<ImageModel>

        adapter = MainAdapter(value, requireContext(), this)
        binding.rvImg.adapter = adapter

    }

    override fun select(selectImg: ImageModel) {

    }
}
