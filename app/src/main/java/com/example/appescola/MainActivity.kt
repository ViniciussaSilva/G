
package com.example.appescola

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val btnDisciplinas = findViewById<Button>(R.id.btnDisciplinas)
        val btnAlunos = findViewById<Button>(R.id.btnAlunos)
        val btnNotas = findViewById<Button>(R.id.btnNotas)
        val btnMatriculas = findViewById<Button>(R.id.btnMatriculas)

        btnDisciplinas.setOnClickListener {
            startActivity(Intent(this, DiciplinasActivity::class.java))
        }

        btnAlunos.setOnClickListener {
            startActivity(Intent(this, AlunosActivity::class.java))
        }

        btnNotas.setOnClickListener {
            startActivity(Intent(this, NotasActivity::class.java))
        }

        btnMatriculas.setOnClickListener {
            startActivity(Intent(this, MatriculasActivity::class.java))
        }
    }
}
