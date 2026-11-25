
package com.example.appescola

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AlunosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.alunos_activity)

        val btnVoltar = findViewById<Button>(R.id.btnVoltar)

        btnVoltar.setOnClickListener {
            finish()
        }
    }
}
