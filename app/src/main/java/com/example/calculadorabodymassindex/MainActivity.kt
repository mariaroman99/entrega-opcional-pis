package com.example.calculadorabodymassindex

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import java.math.BigDecimal
import java.math.RoundingMode


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calcular_btn.setOnClickListener {
            if (altura.text.isNotEmpty() && peso.text.isNotEmpty()) {
                val a: Float = altura.text.toString().toFloat() / 100
                val p: Float = peso.text.toString().toFloat()
                val resultado: Float = p / (a * a)
                resultado.text = "%.2f".format(resultado)
            } else {
                showErrorSnack("Incorrect Values")
            }
            else {
            showErrorSnack("A filed is missing")
        }
        }
        }
    }
}