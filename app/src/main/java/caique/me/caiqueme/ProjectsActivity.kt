package caique.me.caiqueme

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.CardView
import android.view.Window
import android.view.WindowManager
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_projects.*

class ProjectsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN)

        setContentView(R.layout.activity_projects)

        projects_card_eneagrama.setOnClickListener { clickSeeMore(projects_card_eneagrama) }
        projects_card_tcc.setOnClickListener { clickSeeMore(projects_card_tcc) }
        projects_card_ia.setOnClickListener { clickSeeMore(projects_card_ia) }
        projects_card_textos.setOnClickListener { clickSeeMore(projects_card_textos) }
        projects_card_gas.setOnClickListener { clickSeeMore(projects_card_gas) }
        projects_card_cam.setOnClickListener { clickSeeMore(projects_card_cam) }

    }

    private fun clickSeeMore(card: CardView) {

        when (card.id) {

            projects_card_eneagrama.id ->{
                val intent = Intent(this, DescProjectActivity::class.java)
                intent.putExtra("origin", ENEAGRAMA.toString())
                startActivity(intent)
            }

            projects_card_tcc.id ->{
                val intent = Intent(this, DescProjectActivity::class.java)
                intent.putExtra("origin", TCC.toString())
                startActivity(intent)
            }

            projects_card_ia.id ->{
                val intent = Intent(this, DescProjectActivity::class.java)
                intent.putExtra("origin", IA.toString())
                startActivity(intent)
            }

            projects_card_textos.id ->{
                val intent = Intent(this, DescProjectActivity::class.java)
                intent.putExtra("origin", TEXTS.toString())
                startActivity(intent)
            }

            projects_card_gas.id ->{
                val intent = Intent(this, DescProjectActivity::class.java)
                intent.putExtra("origin", GASOLINA.toString())
                startActivity(intent)
            }

            projects_card_cam.id ->{
                val intent = Intent(this, DescProjectActivity::class.java)
                intent.putExtra("origin", CAM.toString())
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
