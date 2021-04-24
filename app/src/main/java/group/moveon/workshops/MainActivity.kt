package group.moveon.workshops

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    /*
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val secondWorkshopButton = findViewById<Button>(R.id.secondWorkshopButton)
        secondWorkshopButton.setOnClickListener{
            val intent = Intent(this, SecondWorkshop::class.java)
            startActivity(intent)
        }

        val thirdWorkshopButton = findViewById<Button>(R.id.thirdWorkshopButton)
        thirdWorkshopButton.setOnClickListener{
            val intent = Intent(this, ThirdWorkshop::class.java)
            startActivity(intent)
        }
    }

     */


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_workshop)
        val intent = Intent(this, SecondWorkshop::class.java)
        startActivity(intent)
    }

}