package caique.me.caiqueme

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_tchau.*


class TchauActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN)

        setContentView(R.layout.activity_tchau)

        supportActionBar?.hide()

        Picasso.get().load(R.drawable.tchau).into(tchau_tchau)

        val mHandler = Handler()
        mHandler.postDelayed(Runnable {
            finish()
        }, 1000L)

    }
}
