package caique.me.caiqueme

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Window
import android.view.WindowManager
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_match.*

class MatchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN)

        setContentView(R.layout.activity_match)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        Picasso.get().load(R.drawable.lu).into(match_img_lu)
        Picasso.get().load(R.drawable.caique_ic).into(match_img_caique)
        Picasso.get().load(R.drawable.dono_ic).into(match_icon_dono)
        Picasso.get().load(R.drawable.gente_ic).into(match_icon_gente)
        Picasso.get().load(R.drawable.massa_ic).into(match_icon_massa)
        Picasso.get().load(R.drawable.foco_ic).into(match_icon_foco)
        Picasso.get().load(R.drawable.client_ic).into(match_icon_cliente)
        Picasso.get().load(R.drawable.abracos).into(match_img_abraco)
        Picasso.get().load(R.drawable.lu_rise).into(match_lu_happy)
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}
