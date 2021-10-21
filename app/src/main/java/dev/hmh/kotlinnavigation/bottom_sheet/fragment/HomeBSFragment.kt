package dev.hmh.kotlinnavigation.bottom_sheet.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import dev.hmh.kotlinnavigation.R
import kotlinx.android.synthetic.main.fragment_home_bs.view.*

class HomeBSFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home_bs, container, false)
        view.btn_bottom_sheet.setOnClickListener {
            findNavController().navigate(R.id.action_homeBSFragment_to_bottomSheetFragment)
        }
        return view
    }

}