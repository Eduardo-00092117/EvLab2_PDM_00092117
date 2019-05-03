package com.naldana.ejemplo06

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var insideCounter = 0
    private var outsideCounter = 0
    private val insideCounterKey = "insideCounter"
    private val outsideCounterKey = "outsideCounter"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        if (savedInstanceState != null) {
            restoreCounters(savedInstanceState)
        }

        addEventListener()

    }

    private fun restoreCounters(savedInstanceState: Bundle) {

        insideCounter = savedInstanceState.getInt(insideCounterKey)
        outsideCounter = savedInstanceState.getInt(outsideCounterKey)

        displayInside.text = insideCounter.toString()
        displayOutside.text = outsideCounter.toString()
    }

    private fun addEventListener() {

        addInside.setOnClickListener {
            insideCounter++
            displayInside.text = insideCounter.toString()
        }

        addOutside.setOnClickListener {
            outsideCounter++
            displayOutside.text = outsideCounter.toString()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putInt(insideCounterKey, insideCounter)
        outState.putInt(outsideCounterKey, outsideCounter)
    }
}