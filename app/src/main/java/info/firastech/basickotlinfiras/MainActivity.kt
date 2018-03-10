package info.firastech.basickotlinfiras

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnFindAge.setOnClickListener {

            if(etYear.text.isNotEmpty()){
                val year: Int = etYear.text.toString()?.toInt()
                val currentYear: Int = Calendar.getInstance().get(Calendar.YEAR)

                val resultYear = currentYear - year

                tvMyAge.text = "Your Age is : ${resultYear.toString()} years old"
            }else{
                etYear.error = "Please enter valid year!"
                etYear.requestFocus()
            }
        }
    }
}
