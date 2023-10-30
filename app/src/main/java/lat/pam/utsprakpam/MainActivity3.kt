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
        val lokasi = intent.getStringExtra("EXTRA_SELECTED_OPTION")

        user1.text = name

        // data title Makanan
        val tpiz = findViewById<TextView>(R.id.pitsa)
        val tspa = findViewById<TextView>(R.id.tspag)
        val tburg = findViewById<TextView>(R.id.tburg)
        val tstea = findViewById<TextView>(R.id.tstea)

        // data desc Makanan
        val desPiz = "Pepperoni pizza adalah pizza yang memiliki topping daging pepperoni sapi asli. Di Italia, pepperoni disebut salame piccante (salami panas). Biasa menjadi bahan baku pizza di Amerika Serikat, yang sering mewakili 30% pelengkap. Pizza ini cocok untuk santap siang ataupun malam anda"
        val desSpa = "Spaghetti adalah hidangan pasta yang terbuat dari seutas tali panjang dan tipis, biasanya disajikan dengan saus tomat, daging cincang, atau berbagai varian saus lainnya. Rasanya lezat, teksturnya kenyal, dan cocok untuk makan malam yang memuaskan."
        val desBurg = "Burger adalah hidangan cepat saji yang terdiri dari sepotong daging panggang, biasanya diletakkan di dalam roti berbulu, dan sering disertai dengan saus, sayuran, dan keju. Rasanya gurih, lezat, dan cocok untuk dinikmati di berbagai suasana."
        val desStea = "Steak adalah potongan daging panggang yang disiapkan sesuai selera, seringkali dipanggang, dibakar, atau digoreng. Dagingnya tender, beraroma, dan memiliki rasa gurih alami. Steak sering disajikan dengan saus dan pelengkap seperti kentang dan sayuran."

        // data price Makanan
        val prPiz = "Price: RP 66.000.000"
        val prSpa = "Price: RP 50.000.000"
        val prBurg = "Price: RP 35.000.000"
        val prStea = "Price: RP 100.000.000"

        // data button Makanan
        val makanPz = findViewById<LinearLayout>(R.id.makanpizza)
        val makanSp = findViewById<LinearLayout>(R.id.makanSpagheti)
        val makanBg = findViewById<LinearLayout>(R.id.makanBurger)
        val makanSt = findViewById<LinearLayout>(R.id.makanSteak)

        makanPz.setOnClickListener{
            val pname = tpiz.text.toString()
            Intent(this, MainActivity4::class.java).also {
                it.putExtra("EXTRA_NAMA", name)
                it.putExtra("EXTRA_SELECTED_OPTION", lokasi)
                it.putExtra("EXTRA_TITLE", pname )
                it.putExtra("EXTRA_DESC", desPiz )
                it.putExtra("EXTRA_PRICE", prPiz )
                startActivity(it)
            }
        }
        makanSp.setOnClickListener{
            val sname = tspa.text.toString()
            Intent(this, MainActivity4::class.java).also {
                it.putExtra("EXTRA_NAMA", name)
                it.putExtra("EXTRA_SELECTED_OPTION", lokasi)
                it.putExtra("EXTRA_TITLE", sname )
                it.putExtra("EXTRA_DESC", desSpa )
                it.putExtra("EXTRA_PRICE", prSpa )
                startActivity(it)
            }
        }
        makanBg.setOnClickListener{
            val bname = tburg.text.toString()
            Intent(this, MainActivity4::class.java).also {
                it.putExtra("EXTRA_NAMA", name)
                it.putExtra("EXTRA_SELECTED_OPTION", lokasi)
                it.putExtra("EXTRA_TITLE", bname )
                it.putExtra("EXTRA_DESC", desBurg )
                it.putExtra("EXTRA_PRICE", prBurg )
                startActivity(it)
            }
        }
        makanSt.setOnClickListener{
            val stname = tstea.text.toString()
            Intent(this, MainActivity4::class.java).also {
                it.putExtra("EXTRA_NAMA", name)
                it.putExtra("EXTRA_SELECTED_OPTION", lokasi)
                it.putExtra("EXTRA_TITLE", stname)
                it.putExtra("EXTRA_DESC", desStea)
                it.putExtra("EXTRA_PRICE", prStea )
                startActivity(it)
            }
        }
    }
}