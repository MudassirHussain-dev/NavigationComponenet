package dev.hmh.kotlinnavigation.safe_args.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import dev.hmh.kotlinnavigation.R
import dev.hmh.kotlinnavigation.safe_args.model.User
import kotlinx.android.synthetic.main.fragment_a.view.*

class FragmentA : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_a, container, false)

        view.btn_sent.setOnClickListener {
            val firstName = view.et_firstname.text.toString()
            val lastName = view.et_lastname.text.toString()
            val user = User(firstName, lastName)

            val action = FragmentADirections.actionFragmentAToFragmentB(user)
            findNavController().navigate(action)
        }

        return view
    }

}