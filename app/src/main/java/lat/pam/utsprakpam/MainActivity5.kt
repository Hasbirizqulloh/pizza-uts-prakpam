package lat.pam.utsprakpam

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast

class MainActivity5 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        val cekout = findViewById<TextView>(R.id.chekout)
        val alert = findViewById<TextView>(R.id.alert)
        val name = intent.getStringExtra("EXTRA_NAMA")
        val lokasi = intent.getStringExtra("EXTRA_SELECTED_OPTION")
        val Ititle = intent.getStringExtra("EXTRA_TITLE")
        val doneButton = findViewById<Button>(R.id.done)


        val dataCk = "$name \n" +
                     "Store: $lokasi \n" +
                     "$Ititle sudah dipesan"

        cekout.text = dataCk

        val checkBox = findViewById<CheckBox>(R.id.checkBox)
        val checkBox1 = findViewById<CheckBox>(R.id.checkBox1)

        checkBox.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // Teks "Ambil Sendiri" akan ditampilkan
                val ceked = "Ambil Sendiri"
                val dataAlert = "Terima kasih $name sudah memesan ditoko kami, pesanan $Ititle Anda menggunakan pilihan $ceked"
                doneButton.setOnClickListener {
                    alert.text = dataAlert
                    alert.visibility = View.VISIBLE
                }
            }
        }

        checkBox1.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // Teks "Fast Delivery (minimal 30 menit sampai)" akan ditampilkan
                val ceked = "Fast Delivery"
                val dataAlert = "Terima kasih $name sudah memesan ditoko kami, pesanan $Ititle anda dikirim menggunakan $ceked"
                doneButton.setOnClickListener {
                    alert.text = dataAlert
                    alert.visibility = View.VISIBLE
                }
            }
        }

    }
}