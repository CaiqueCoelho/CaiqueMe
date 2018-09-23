package caique.me.caiqueme

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Window
import android.view.WindowManager
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN)

        setContentView(R.layout.activity_main)

        main_card_aboutme.setOnClickListener { startActivity(Intent(this, AboutMeActivity::class.java)) }

        main_card_timeline.setOnClickListener { startActivity(Intent(this, TimelineActivity::class.java)) }

        main_card_projects.setOnClickListener { startActivity(Intent(this, ProjectsActivity::class.java)) }

        main_card_aboutapp.setOnClickListener { startActivity(Intent(this, AboutAppActivity::class.java)) }

        Picasso.get().load(R.drawable.caique1).into(main_img_caique)
    }
}
