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

class LoginFragment : Fragment() {

    private var _binding: LoginScreenBinding? = null
    private val binding get() = _binding!!
    public var email: String? = null
    public var password: String? = null
    private val requestLogin: RequestLogin by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = LoginScreenBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.ButtonLogin.setOnClickListener{
//            requestLogin.email       = binding.LoginTextMail.getText().toString();
//            requestLogin.password    = binding.LoginTextPassword.getText().toString();
              requestLogin.username = binding.LoginTextMail.getText().toString();


            findNavController().navigate(R.id.Login_to_First)
        }

        binding.ButtonToRegister.setOnClickListener {
            Log.d("LoginFragment", "Navigating to Register Screen")
            findNavController().navigate(R.id.Go_To_Reg)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}