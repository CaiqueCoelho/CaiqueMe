package caique.me.caiqueme

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_timeline.*

class TimelineActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timeline)
    }

    private fun clickSeeMore(textView: TextView) {

        when (textView.id) {

            timeline_aiesec_more.id -> {
                val intent = Intent(this, DescJobActivity::class.java)
                intent.putExtra("origin", AIESEC_DIRECTOR)
                startActivity(intent)
            }

            timeline_ufms_more.id -> {
                val intent = Intent(this, DescJobActivity::class.java)
                intent.putExtra("origin", UFMS)
                startActivity(intent)
            }

            timeline_jera_more.id -> {
                val intent = Intent(this, DescJobActivity::class.java)
                intent.putExtra("origin", JERA_QA)
                startActivity(intent)
            }

            timeline_jera2_more.id -> {
                val intent = Intent(this, DescJobActivity::class.java)
                intent.putExtra("origin", JERA_CX)
                startActivity(intent)
            }

            timeline_jera3_more.id -> {
                val intent = Intent(this, DescJobActivity::class.java)
                intent.putExtra("origin", JERA_ANDROID)
                startActivity(intent)
            }

        }

    }

    companion object {
        private const val AIESEC_DIRECTOR = 1
        private const val UFMS = 2
        private const val JERA_QA = 3
        private const val JERA_CX = 4
        private const val JERA_ANDROID = 5
    }
}
