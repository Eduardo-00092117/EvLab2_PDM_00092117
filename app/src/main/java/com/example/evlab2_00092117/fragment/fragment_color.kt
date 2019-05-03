package com.example.evlab2_00092117.fragment

import android.content.Context
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.evlab2_00092117.R
import kotlinx.android.synthetic.main.fragment_fragment_color.*
import kotlinx.android.synthetic.main.fragment_fragment_color.view.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [fragment_color.OnFragmentInteractionListener] interface
 * to handle interaction events.
 *
 */
class fragment_color : Fragment() {
    private var listener: OnFragmentInteractionListener? = null

    var initVerde : Int = 0
    var initAzul : Int = 0
    var initRojo : Int = 0

    interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        fun mas() : Int
        fun menos() : Int
    }

    companion object {
        fun newIntance(red : Int, green : Int, blue : Int) : fragment_color {
            var instancia = fragment_color()
            instancia.initVerde = green
            instancia.initRojo = red
                instancia.initAzul = blue
            return instancia
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_fragment_color, container, false)

        view.tv_color.setBackgroundColor(Color.rgb(initRojo, initVerde, initAzul))

        view.btn_mas.setOnClickListener {
            if (initRojo != 0){
                initRojo = initRojo + 10
                if (initRojo > 255){
                    initRojo = 1
                }
            } else if (initAzul != 0){
                initAzul = initAzul + 10
                if (initAzul > 255){
                    initAzul = 1
                }
            } else if (initVerde != 0){
                initVerde = initVerde + 10
                if (initVerde > 255){
                    initVerde = 1
                }
            }
            view.tv_color.setBackgroundColor(Color.rgb(initRojo, initVerde, initAzul))
        }

        view.btn_menos.setOnClickListener {
            if (initRojo != 0){
                initRojo = initRojo - 10
                if (initRojo <= 0){
                    initRojo = 255
                }
            } else if (initAzul != 0){
                initAzul = initAzul - 10
                if (initAzul <= 0){
                    initAzul = 255
                }
            } else if (initVerde != 0){
                initVerde = initVerde - 10
                if (initVerde <= 0){
                    initVerde = 255
                }
            }
            view.tv_color.setBackgroundColor(Color.rgb(initRojo, initVerde, initAzul))
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
