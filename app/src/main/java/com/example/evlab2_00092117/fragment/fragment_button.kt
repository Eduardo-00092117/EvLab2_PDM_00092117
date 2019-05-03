package com.example.evlab2_00092117.fragment

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.evlab2_00092117.R
import kotlinx.android.synthetic.main.fragment_fragment_button.view.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [fragment_button.OnFragmentInteractionListener] interface
 * to handle interaction events.
 *
 */
class fragment_button : Fragment() {
    private var listener: OnFragmentInteractionListener? = null

    interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        fun next()
        fun prev()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_fragment_button, container, false)

        view.btn_next.setOnClickListener {
            listener?.next()
        }

        view.btn_back.setOnClickListener {
            listener?.prev()
        }

        return view
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnFragmentInteractionListener) {
            listener = context
        } else {
            throw RuntimeException(context.toString() + " must implement OnFragmentInteractionListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

}
