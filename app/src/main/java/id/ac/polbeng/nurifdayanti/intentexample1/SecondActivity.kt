package id.ac.polbeng.nurifdayanti.intentexample1

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import id.ac.polbeng.nurifdayanti.intentexample1.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.i("SecondActivity", "onCreate")
        binding.btnExitActivity.setOnClickListener {
            finish()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("SecondActivity", "onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.i("SecondActivity", "onStop")
    }
}
