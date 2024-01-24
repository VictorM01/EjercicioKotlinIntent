package e.iesoretania.ejerciciokotlinintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import e.iesoretania.ejerciciokotlinintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEvaluar.setOnClickListener{
            val n1 = binding.editTextNumberMAT.text.toString().toInt();
            val n2 = binding.editTextNumberFIS.text.toString().toInt();
            val n3 = binding.editTextNumberQUI.text.toString().toInt();

            val intent = Intent(this, SecondActivity::class.java)
        }
    }
}