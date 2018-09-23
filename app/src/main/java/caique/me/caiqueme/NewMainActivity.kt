package caique.me.caiqueme

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.*
import android.widget.ImageView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_new_main.*


class NewMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN)

        setContentView(R.layout.activity_new_main)

        Picasso.get().load(R.drawable.caique1).into(main_new_img)
        Picasso.get().load(R.drawable.cancel).into(main_new_cancel)
        Picasso.get().load(R.drawable.info).into(main_new_info)
        Picasso.get().load(R.drawable.ok).into(main_new_match)

        main_new_info.setOnClickListener { startActivity(Intent(this, MainActivity::class.java)) }
        main_new_match.setOnClickListener { startActivity(Intent(this, MatchActivity::class.java)) }
        main_new_cancel.setOnClickListener { setDialog() }
    }

    private fun setDialog() {

        val viewCriada = criaLayout()

        val luSad = viewCriada.findViewById<ImageView>(R.id.cancel_lu_sad)
        val caiqueSad = viewCriada.findViewById<ImageView>(R.id.cancel_caique_sad)

        Picasso.get().load(R.drawable.lu_sad).into(luSad)
        Picasso.get().load(R.drawable.sad).into(caiqueSad)

        AlertDialog.Builder(this)
                .setView(viewCriada)
                .setPositiveButton("Cancelar") { dialog, it -> dialog.dismiss()}
                .setNegativeButton("Sair") { _, _ -> tchau() }
                .create()
                .show()
    }

    private fun criaLayout(): View {

        return LayoutInflater.from(this)
                .inflate(R.layout.cancel_activity,
                        window.decorView as ViewGroup,
                        false)
    }

    private fun tchau(){
        startActivity(Intent(this, TchauActivity::class.java))
        finish()
    }
}
