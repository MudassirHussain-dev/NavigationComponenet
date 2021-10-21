package dev.hmh.kotlinnavigation.transition.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import dev.hmh.kotlinnavigation.R
import kotlinx.android.synthetic.main.fragment_firt_tran.view.*

class FirtTranFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_firt_tran, container, false)
        view.navBackFromFirst_btn.setOnClickListener {

            findNavController().navigate(R.id.action_firtTranFragment_to_homeTranFragment)
        }

        return view
    }
}