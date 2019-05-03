package com.example.evlab2_00092117

import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.evlab2_00092117.fragment.fragment_button
import com.example.evlab2_00092117.fragment.fragment_color

class MainActivity : AppCompatActivity(), fragment_color.OnFragmentInteractionListener, fragment_button.OnFragmentInteractionListener {
    override fun mas(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun menos(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    var cont = 0
    var initGreen : Int = 100
    var initBlue : Int = 100
    var initRed : Int = 100
    override fun next() {
        ++cont
        if(cont == 0){
            var instancia = fragment_color.newIntance(0, 0, initBlue)
            supportFragmentManager.beginTransaction().replace(R.id.secundario, instancia).commit()
        } else if (cont == 1){
            var instancia = fragment_color.newIntance(0, initGreen, 0)
            supportFragmentManager.beginTransaction().replace(R.id.secundario, instancia).commit()
        } else if (cont == 2){
            var instancia = fragment_color.newIntance(initRed, 0, 0)
            supportFragmentManager.beginTransaction().replace(R.id.secundario, instancia).commit()
        }
        if (cont == 2){
            cont = -1
        }
    }

    override fun prev() {
        --cont
        if (cont == -1){
            cont = 2
        } else if (cont < -1){
            cont = 1
        }
        if(cont == 0){
            var instancia = fragment_color.newIntance(0, 0, initBlue)
            supportFragmentManager.beginTransaction().replace(R.id.secundario, instancia).commit()
        } else if (cont == 1){
            var instancia = fragment_color.newIntance(0, initGreen, 0)
            supportFragmentManager.beginTransaction().replace(R.id.secundario, instancia).commit()
        } else if (cont == 2){
            var instancia = fragment_color.newIntance(initRed, 0, 0)
            supportFragmentManager.beginTransaction().replace(R.id.secundario, instancia).commit()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var instancia = fragment_color.newIntance(0, 0, 100)
        supportFragmentManager.beginTransaction().replace(R.id.secundario, instancia).commit()
    }
}
