package dev.hmh.kotlinnavigation.safe_args.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import dev.hmh.kotlinnavigation.R
import kotlinx.android.synthetic.main.fragment_b.view.*


class FragmentB : Fragment() {

    private val args by navArgs<FragmentBArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_b, container, false)

        view.textView2.text = "FirstName: ${args.user.firstName}\nLastName: ${args.user.lastName}"

        return view
    }

}