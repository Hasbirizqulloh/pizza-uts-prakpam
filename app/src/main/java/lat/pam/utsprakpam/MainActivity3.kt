package lat.pam.utsprakpam


import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import kotlin.math.log

class MainActivity3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val user1 = findViewById<TextView>(R.id.user1)
        val name = intent.getStringExtra("EXTRA_NAMA")

        user1.text = name

        val makanPz = findViewById<LinearLayout>(R.id.makanpizza)
        val makanSp = findViewById<LinearLayout>(R.id.makanSpagheti)
        val makanBg = findViewById<LinearLayout>(R.id.makanBurger)
        val makanSt = findViewById<LinearLayout>(R.id.makanSteak)

        makanPz.setOnClickListener{
            Intent(this, MainActivity4::class.java).also {
                it.putExtra("EXTRA_NAMA", name)
                startActivity(it)
            }
        }
        makanSp.setOnClickListener{
            Intent(this, MainActivity4::class.java).also {
                it.putExtra("EXTRA_NAMA", name)
                it.putExtra("EXTRA_IMAGE_RES_ID", R.drawable.banner2)
                startActivity(it)
            }
        }
        makanBg.setOnClickListener{
            Intent(this, MainActivity4::class.java).also {
                it.putExtra("EXTRA_NAMA", name)
                startActivity(it)
            }
        }
        makanSt.setOnClickListener{
            Intent(this, MainActivity4::class.java).also {
                it.putExtra("EXTRA_NAMA", name)
                startActivity(it)
            }
        }
    }
}