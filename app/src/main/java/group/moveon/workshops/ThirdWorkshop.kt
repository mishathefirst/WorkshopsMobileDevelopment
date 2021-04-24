package group.moveon.workshops

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ThirdWorkshop : AppCompatActivity(), ClickListener {

    private val colors: Array<Int> = arrayOf(Color.RED, Color.BLUE, Color.GRAY, Color.GREEN, Color.YELLOW, Color.WHITE)
    private val square: ThirdWorkshopSquare = ThirdWorkshopSquare()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_workshop)

        supportFragmentManager.beginTransaction().add(R.id.third_container, square).commit()
    }

    override fun onIncreaseValueButtonClicked() {
        square.increaseValue()
    }

    override fun onChangeBackgroundButtonClicked() {
        square.changeColor(colors[(colors.indices).random()])
    }

}