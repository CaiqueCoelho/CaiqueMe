package caique.me.caiqueme

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Window
import android.view.WindowManager
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_timeline.*

class TimelineActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN)

        setContentView(R.layout.activity_timeline)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        timeline_aiesec_more.setOnClickListener { clickSeeMore(timeline_aiesec_more) }
        timeline_ufms_more.setOnClickListener { clickSeeMore(timeline_ufms_more) }
        timeline_jera_more.setOnClickListener { clickSeeMore(timeline_jera_more) }
        timeline_jera2_more.setOnClickListener { clickSeeMore(timeline_jera2_more) }
        timeline_jera3_more.setOnClickListener { clickSeeMore(timeline_jera3_more) }
    }

    private fun clickSeeMore(textView: TextView) {

        when (textView.id) {

            timeline_aiesec_more.id -> {
                val intent = Intent(this, DescJobActivity::class.java)
                intent.putExtra("origin", AIESEC_DIRECTOR.toString())
                startActivity(intent)
            }

            timeline_ufms_more.id -> {
                val intent = Intent(this, DescJobActivity::class.java)
                intent.putExtra("origin", UFMS.toString())
                startActivity(intent)
            }

            timeline_jera_more.id -> {
                val intent = Intent(this, DescJobActivity::class.java)
                intent.putExtra("origin", JERA_QA.toString())
                startActivity(intent)
            }

            timeline_jera2_more.id -> {
                val intent = Intent(this, DescJobActivity::class.java)
                intent.putExtra("origin", JERA_CX.toString())
                startActivity(intent)
            }

            timeline_jera3_more.id -> {
                val intent = Intent(this, DescJobActivity::class.java)
                intent.putExtra("origin", JERA_ANDROID.toString())
                startActivity(intent)
            }

        }

    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }

    companion object {
        private const val AIESEC_DIRECTOR = 1
        private const val UFMS = 2
        private const val JERA_QA = 3
        private const val JERA_CX = 4
        private const val JERA_ANDROID = 5
    }
}
