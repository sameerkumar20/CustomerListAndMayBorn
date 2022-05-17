package com.sameer.customerlistandmayborn

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.sameer.customerlistandmayborn.adapter.CustomerListAdapter
import com.sameer.customerlistandmayborn.databinding.FragmentCustomerListBinding

class CustomerListFragment : Fragment() {


    lateinit var binding : FragmentCustomerListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCustomerListBinding.inflate(inflater, container, false)

        binding.rvCustomerList.layoutManager = LinearLayoutManager(context)
        val customerListAdapter = CustomerListAdapter(requireContext(), getCustomerList())
        binding.rvCustomerList.adapter = customerListAdapter
        return binding.root
    }


}