package caique.me.caiqueme

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Window
import android.view.WindowManager
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_about_me.*

class AboutMeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN)

        setContentView(R.layout.activity_about_me)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        Picasso.get().load(R.drawable.presidente).into(about_img_caique)
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}
