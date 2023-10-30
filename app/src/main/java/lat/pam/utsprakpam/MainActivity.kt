package lat.pam.utsprakpam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Deklarasikan Spinner
        val spinner = findViewById<Spinner>(R.id.spinner)

        // Data untuk dropdown
        val data = arrayOf("Cihampelas", "Cinunuk", "Cilengkrang")

        // Buat adapter untuk Spinner
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, data)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // Atur adapter ke Spinner
        spinner.adapter = adapter

        val submitButton = findViewById<Button>(R.id.submit)
        val edname = findViewById<EditText>(R.id.inputnama)

        var selectedOption: String = "" // Variabel untuk menyimpan pilihan dari Spinner

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                // Aksi yang akan diambil saat pilihan dipilih
                selectedOption = data[position] // Simpan pilihan dalam variabel
                Toast.makeText(applicationContext, "Anda memilih: $selectedOption", Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Aksi yang akan diambil jika tidak ada yang dipilih
            }
        }

        submitButton.setOnClickListener {
            val nama = edname.text.toString()

            // Membuat intent untuk memulai MainActivity2
            Intent(this, MainActivity2::class.java).also {
                it.putExtra("EXTRA_NAMA", nama)
                it.putExtra("EXTRA_SELECTED_OPTION", selectedOption) // Menambahkan data Spinner ke Intent
                startActivity(it)
            }

        }
    }
}
