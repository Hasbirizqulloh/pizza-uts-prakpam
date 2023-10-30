package lat.pam.utsprakpam

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val title = findViewById<TextView>(R.id.title)
        val price = findViewById<TextView>(R.id.price)
        val desc = findViewById<TextView>(R.id.textview2)
        val orderButton = findViewById<Button>(R.id.order)
        val backButton = findViewById<Button>(R.id.back)

        // data Intent
        val name = intent.getStringExtra("EXTRA_NAMA")
        val lokasi = intent.getStringExtra("EXTRA_SELECTED_OPTION")
        val Ititle = intent.getStringExtra("EXTRA_TITLE")
        val Iprice = intent.getStringExtra("EXTRA_PRICE")
        val Idesc = intent.getStringExtra("EXTRA_DESC")

        // Input Data
        title.text = Ititle
        price.text = Iprice
        desc.text = Idesc

        orderButton.setOnClickListener {

            Intent(this, MainActivity5::class.java).also {
                it.putExtra("EXTRA_NAMA", name)
                it.putExtra("EXTRA_SELECTED_OPTION", lokasi)
                it.putExtra("EXTRA_TITLE", Ititle)
                startActivity(it)
            }
        }
        backButton.setOnClickListener {
            // Menggunakan onBackPressed() untuk kembali ke activity sebelumnya
            onBackPressed()
        }
    }
}