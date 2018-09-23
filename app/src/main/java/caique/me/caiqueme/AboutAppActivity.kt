package caique.me.caiqueme

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_about_app.*

class AboutAppActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_app)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        aboutapp_git.setOnClickListener { clickButtonWebview("https://github.com/CaiqueCoelho/CaiqueMe") }
    }

    fun clickButtonWebview(url: String) {
        val intent = Intent(this, WebviewActivity::class.java)
        intent.putExtra("url", url)
        startActivity(intent)
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}
