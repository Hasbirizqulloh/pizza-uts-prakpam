package lat.pam.utsprakpam

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity5 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        val cekout = findViewById<TextView>(R.id.chekout)
        val name = intent.getStringExtra("EXTRA_NAMA")
        val doneButton = findViewById<Button>(R.id.done)


        cekout.text = name
    }
}