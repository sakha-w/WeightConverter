package org.d3if3102.weightconverter

import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import org.d3if3102.weightconverter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.root);

        binding.button.setOnClickListener(object : OnClickListener {
            override fun onClick(v: View?) {
                val n = binding.editTextNumberDecimal.getText().toString();
                val kg = n.toFloat()
                val pound = 2.20462 * kg
                binding.results.setText("The Weight is $pound Pounds")
                Toast.makeText(this@MainActivity, "Successful conversion", Toast.LENGTH_SHORT).show()
            }
        });

        binding.button2.setOnClickListener(object : OnClickListener{
            override fun onClick(v: View?){
                val n = binding.editTextNumberDecimal.getText().toString();
                val pound = n.toFloat()
                val kg = 0.453592 * pound
                binding.results.setText("The Weight is $kg Kg")
                Toast.makeText(this@MainActivity, "Successful conversion", Toast.LENGTH_SHORT).show()
            }
        });
    }
}