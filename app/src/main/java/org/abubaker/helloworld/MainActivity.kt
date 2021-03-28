package org.abubaker.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import org.abubaker.helloworld.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // setOnClickListener() for Button.
        binding.button.setOnClickListener {
            Toast.makeText(this@MainActivity, "You clicked me", Toast.LENGTH_SHORT).show()
        }

    }

}