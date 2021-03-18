package com.example.android_view_binding_practice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.android_view_binding_practice.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private var viewBinding: FragmentMainBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentMainBinding.inflate(inflater, container, false)
        binding.text.text = "Hello from Main Fragment"
        viewBinding = binding
        return binding.root
    }

    override fun onDestroyView() {
        // Release reference to binding, because binding life cycle shorter than fragment
        viewBinding = null
        super.onDestroyView()
    }
}