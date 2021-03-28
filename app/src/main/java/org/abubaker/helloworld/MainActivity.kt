package org.abubaker.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import org.abubaker.helloworld.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        // We will use it store current value for how many times a user clicked on the Button
        var timesClicked = 0

        super.onCreate(savedInstanceState)

        // We are asking to load our activity_main.xml layout as the initial view
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // This listener will initialize our custom code whenever the Button will be clicked
        binding.button.setOnClickListener {

            // We are updating the value so the new clicked state can be stored
            timesClicked += 1

            /**
             * Using DataBinding we are first selecting @+id/textView stored in our XML file and
             * then updated its value with the newly updated timesClicked variable.
             *
             * Note:
             * toString() will convert the integer value to string, so the textView can show it.
             */
            binding.textView.text = timesClicked.toString()


            // It will display a Toast message
            Toast.makeText(
                this@MainActivity,
                "You clicked the button $timesClicked times.",
                Toast.LENGTH_SHORT
            ).show()

        }

    }

}