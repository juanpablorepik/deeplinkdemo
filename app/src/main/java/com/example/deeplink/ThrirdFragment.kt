package com.example.deeplink

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.deeplink.databinding.FragmentThrirdBinding

class ThrirdFragment : Fragment() {

    private lateinit var binding:FragmentThrirdBinding

    private lateinit var viewModel: ThrirdViewModel

    private val args: ThrirdFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThrirdBinding.inflate(inflater)

       Log.d("Nombre:",args.nombre.toString())

        args.nombre.let {
            binding.nombre.text = it
        }

        return binding.root
    }


}