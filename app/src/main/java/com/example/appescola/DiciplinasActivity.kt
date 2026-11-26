
package com.example.appescola

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DiciplinasActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.disciplinas_activity)

        val btnVoltar = findViewById<Button>(R.id.btnVoltar)

        btnVoltar.setOnClickListener {
            finish()
        }
    }
}
