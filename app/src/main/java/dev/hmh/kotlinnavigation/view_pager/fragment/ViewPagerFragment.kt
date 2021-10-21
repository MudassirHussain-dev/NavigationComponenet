package dev.hmh.kotlinnavigation.view_pager.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dev.hmh.kotlinnavigation.R
import dev.hmh.kotlinnavigation.view_pager.adapter.ViewPagerAdapter
import dev.hmh.kotlinnavigation.view_pager.fragment.screen.FirstScreen
import dev.hmh.kotlinnavigation.view_pager.fragment.screen.SecondScreen
import dev.hmh.kotlinnavigation.view_pager.fragment.screen.ThirdScreen
import kotlinx.android.synthetic.main.fragment_view_pager.view.*


class ViewPagerFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_view_pager, container, false)

        val fragmentList = arrayListOf<Fragment>(FirstScreen(), SecondScreen(), ThirdScreen())

        val adapter = ViewPagerAdapter(fragmentList, requireActivity().supportFragmentManager, lifecycle)

        view.viewPager.adapter = adapter

        return view;
    }


}