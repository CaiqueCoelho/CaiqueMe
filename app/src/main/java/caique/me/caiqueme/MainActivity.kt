package caique.me.caiqueme

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Window
import android.view.WindowManager
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_desc_project.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN)

        setContentView(R.layout.activity_main)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        main_card_aboutme.setOnClickListener { startActivity(Intent(this, AboutMeActivity::class.java)) }

        main_card_timeline.setOnClickListener { startActivity(Intent(this, TimelineActivity::class.java)) }

        main_card_projects.setOnClickListener { startActivity(Intent(this, ProjectsActivity::class.java)) }

        main_card_aboutapp.setOnClickListener { startActivity(Intent(this, AboutAppActivity::class.java)) }

        Picasso.get().load(R.drawable.caique1).into(main_img_caique)
        Picasso.get().load(R.drawable.phone).into(main_phone)
        Picasso.get().load(R.drawable.linkedin).into(main_linkedin)
        Picasso.get().load(R.drawable.git).into(main_git)
        Picasso.get().load(R.drawable.facebook).into(main_facebook)
        Picasso.get().load(R.drawable.email).into(main_email)

        main_linkedin.setOnClickListener { clickButtonWebview("https://www.linkedin.com/in/caiquecoelho/") }
        main_git.setOnClickListener { clickButtonWebview("https://github.com/CaiqueCoelho") }
        main_facebook.setOnClickListener { clickButtonWebview("https://www.facebook.com/Caique.Coelho.GGA") }

        main_phone.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:67 9 84371783")
            startActivity(intent)
        }

        main_email.setOnClickListener {
            val emailIntent = Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                    "mailto", "caiquedpfc@gmail.com", null))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Portfólio para Magazine Luiza")
            emailIntent.putExtra(Intent.EXTRA_TEXT, "Oi Caíque, tudo bem?")
            startActivity(Intent.createChooser(emailIntent, "Enviando e-mail..."))
        }
    }

    fun clickButtonWebview(url: String){
        val intent = Intent(this, WebviewActivity::class.java)
        intent.putExtra("url", url)
        startActivity(intent)
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }

}
