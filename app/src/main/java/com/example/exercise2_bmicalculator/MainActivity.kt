package com.example.exercise2_bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        buttonCalculate.setOnClickListener(){
            val Weight:Double = editTextWeight.text.toString().toDouble();
            val Height:Double = editTextHeight.text.toString().toDouble();
            val BMI:Double = Weight/(Height * Height)

            textViewBMI.text = "BMI = %.2f" .format(BMI);

            if (BMI < 18.5 ){
                imageViewProfile.setImageResource(R.drawable.under)
            }
            else if (BMI >= 18.5 && BMI <= 24.9) {
                imageViewProfile.setImageResource(R.drawable.normal)
        }
            else{
                imageViewProfile.setImageResource(R.drawable.over)
            }

        }

        buttonReset.setOnClickListener(){
            editTextWeight.text = null;
            editTextHeight.text = null;
            textViewBMI.text = null;
            imageViewProfile.setImageResource(R.drawable.empty)
        }



    }
}
