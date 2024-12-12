package com.example.kasir_mini

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.kasir_mini.Model.RequestLogin
import com.example.kasir_mini.databinding.LoginScreenBinding
import com.example.kasir_mini.databinding.RegisterScreenBinding

class RegisterFragment : Fragment() {

    private var _binding: RegisterScreenBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = RegisterScreenBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.ButtonToLogin.setOnClickListener{

            findNavController().navigate(R.id.action_keluar)
        }
        binding.ButtonLogin.setOnClickListener{

            findNavController().navigate(R.id.action_keluar)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}