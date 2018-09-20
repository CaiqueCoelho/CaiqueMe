package caique.me.caiqueme

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.CardView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_projects.*

class ProjectsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_projects)


    }

    private fun clickSeeMore(card: CardView) {

        when (card.id) {

            projects_card_eneagrama.id ->{
                val intent = Intent(this, DescProjectActivity::class.java)
                intent.putExtra("origin", ENEAGRAMA)
                startActivity(intent)
            }

            projects_card_tcc.id ->{
                val intent = Intent(this, DescProjectActivity::class.java)
                intent.putExtra("origin", TCC)
                startActivity(intent)
            }

            projects_card_ia.id ->{
                val intent = Intent(this, DescProjectActivity::class.java)
                intent.putExtra("origin", IA)
                startActivity(intent)
            }

            projects_card_textos.id ->{
                val intent = Intent(this, DescProjectActivity::class.java)
                intent.putExtra("origin", TEXTS)
                startActivity(intent)
            }

            projects_card_gas.id ->{
                val intent = Intent(this, DescProjectActivity::class.java)
                intent.putExtra("origin", GASOLINA)
                startActivity(intent)
            }

            projects_card_cam.id ->{
                val intent = Intent(this, DescProjectActivity::class.java)
                intent.putExtra("origin", CAM)
                startActivity(intent)
            }

        }
    }

    companion object {
        private const val ENEAGRAMA = 1
        private const val TCC = 2
        private const val IA = 3
        private const val TEXTS = 4
        private const val GASOLINA = 5
        private const val CAM = 6
    }
}
