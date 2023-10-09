package com.example.currencyconverter

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    fun dollarConverted(view: View?) {
        val dollarText = findViewById<EditText>(R.id.dollarText)
        val amountInDollars: String = dollarText.getText().toString()
        val amountInDollarsDouble = amountInDollars.toDouble()
        val amountInPesosDouble = amountInDollarsDouble * 50
//        val amountInPesosString: String = amountInPesosInt.toString()
        val amountInPesosString = String.format("%.2f", amountInPesosDouble)
        Toast.makeText(this, "$$amountInDollars is P$amountInPesosString", Toast.LENGTH_LONG).show()
//        Toast.makeText(this, , Toast.LENGTH_LONG).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}




