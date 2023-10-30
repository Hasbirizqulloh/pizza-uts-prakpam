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
        val name = intent.getStringExtra("EXTRA_NAMA")

        val image = findViewById<ImageView>(R.id.imageView)
        val imageResId = intent.getIntExtra("EXTRA_IMAGE_RES_ID", 0)

        if (imageResId != 0) {
            // Set the image resource in the ImageView
            image.setImageResource(imageResId)
        } else {
            // Handle the case where the image resource ID is not provided in the Intent
            // You can set a default image or take some other action here.
        }

        orderButton.setOnClickListener {
            Intent(this, MainActivity5::class.java).also {
                it.putExtra("EXTRA_NAMA", name)
                startActivity(it)
            }
        }
        backButton.setOnClickListener {
            // Menggunakan onBackPressed() untuk kembali ke activity sebelumnya
            onBackPressed()
        }
    }
}