package com.example.mymenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.mymenu.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var b:ActivityMainBinding
    private var cont = 0
    companion object{
        private val ID_GROUP_BR = Menu.FIRST
        private val ID_ELEMENTO_CHECKBOX = Menu.FIRST
        private val ID_BOTONRADIO_1 = Menu.FIRST +1
        private val ID_BOTONRADIO_2 = Menu.FIRST +2
        private val ID_BOTONRADIO_3 = Menu.FIRST +3
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
//        // Creamos un elemento del tipo CheckBox
//        menu?.add(Menu.NONE, ID_ELEMENTO_CHECKBOX, Menu.NONE, "Checkbox")?.setCheckable(true)
//        // Creamos un grupo de botones Radio
//        menu?.add(ID_GROUP_BR, ID_BOTONRADIO_1, Menu.NONE, "Opción 1")
//        menu?.add(ID_GROUP_BR, ID_BOTONRADIO_2, Menu.NONE, "Opción 2")
//        menu?.add(ID_GROUP_BR, ID_BOTONRADIO_3, Menu.NONE, "Opción 3")?.setChecked(true)
//        val sub = menu?.addSubMenu(0,0,Menu.NONE, "Submenú")
//        sub?.setHeaderIcon(com.google.android.material.R.drawable.navigation_empty_icon)
//        val elementoSubmenu = sub?.add(0,0,Menu.NONE, "Elemento submenú")
        menuInflater.inflate(R.menu.custom_menu, menu)
        return true
    }
    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        super.onPrepareOptionsMenu(menu)
        cont++
        b.tvCount.text = cont.toString()
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        super.onOptionsItemSelected(item)
        when (item.itemId) {
//            ID_ELEMENTO_CHECKBOX -> {
//                Toast.makeText(this, "Hola Mundo", Toast.LENGTH_SHORT).show()
//                return true
//            }
//            ID_BOTONRADIO_1 -> {
//                Snackbar.make(b.root, "RadioButton 1", Snackbar.LENGTH_SHORT).show()
//                return true}
            R.id.itOp1 ->{
                Snackbar.make(b.root, "Esto son los ajustes", Snackbar.LENGTH_SHORT).show()
                return true
            }
            R.id.itOp2 ->{
                Snackbar.make(b.root, "Esto son las opciones", Snackbar.LENGTH_SHORT).show()
                return true
            }
            R.id.itOp3 ->{
                Snackbar.make(b.root, "Aquí puedes personalizar", Snackbar.LENGTH_SHORT).show()
                return true
            }
        }
        return false
    }
}