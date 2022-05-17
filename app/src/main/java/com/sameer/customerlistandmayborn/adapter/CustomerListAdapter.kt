package com.sameer.customerlistandmayborn.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.sameer.customerlistandmayborn.databinding.CustomerListCardBinding
import com.sameer.customerlistandmayborn.vo.CustomerInfo

class CustomerListAdapter(val context : Context, private val mList: MutableList<CustomerInfo>) : RecyclerView.Adapter<CustomerListAdapter.ViewHolder>()  {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CustomerListAdapter.ViewHolder {
        return ViewHolder(CustomerListCardBinding.inflate(LayoutInflater.from(parent.context),
            parent,
            false))
    }

    override fun onBindViewHolder(holder: CustomerListAdapter.ViewHolder, position: Int) {
            holder.bind(mList[position])
    }

    override fun getItemCount(): Int {
       return mList.size
    }

    inner class ViewHolder(private val binding: CustomerListCardBinding) : RecyclerView.ViewHolder(binding.root){

        fun bind(data : CustomerInfo){

            binding.name.text = data.name
            binding.phone.text = data.phone
            binding.dob.text = data.dob
            binding.status.text = data.status
            Glide.with(context)
                .load(data.profileUrl)
                .into(binding.profileImage)


        }
    }
}