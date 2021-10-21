package dev.hmh.kotlinnavigation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import dev.hmh.kotlinnavigation.R
import kotlinx.android.synthetic.main.fragment_first.view.*

class FirstFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        view.txt1.setOnClickListener {

            //first video
            //Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_secondFragment)
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(363)
            Navigation.findNavController(view).navigate(action)
        }
        return view;
    }

}