package lat.pam.utsprakpam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val user = findViewById<TextView>(R.id.user)
        val edlokasi = findViewById<TextView>(R.id.tempat)
        val name = intent.getStringExtra("EXTRA_NAMA")
        val lokasi = intent.getStringExtra("EXTRA_SELECTED_OPTION")

        user.text = name
        edlokasi.text= lokasi

        val seeMenus = findViewById<Button>(R.id.seeMenus)

        seeMenus.setOnClickListener {
            Intent(this, MainActivity3::class.java).also {
                it.putExtra("EXTRA_NAMA", name)
                it.putExtra("EXTRA_SELECTED_OPTION", lokasi)
                startActivity(it)
            }
        }
    }
}