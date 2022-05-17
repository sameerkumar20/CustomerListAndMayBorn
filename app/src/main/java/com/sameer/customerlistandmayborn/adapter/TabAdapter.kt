package com.sameer.customerlistandmayborn.adapter

import android.content.Context
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.sameer.customerlistandmayborn.CustomerListFragment
import com.sameer.customerlistandmayborn.MayBornFragment

class TabAdapter(val context : Context,val fm : FragmentManager,var totalTab : Int) : FragmentPagerAdapter(fm) {


    override fun getCount(): Int {
        return totalTab
    }

    override fun getItem(position: Int): Fragment {

        when(position){
            0-> return CustomerListFragment()
            1-> return MayBornFragment()
        }
        return CustomerListFragment()
    }
}