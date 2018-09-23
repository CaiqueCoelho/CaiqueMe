package caique.me.caiqueme

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_webview.*
import android.app.ProgressDialog
import android.widget.ProgressBar


class WebviewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN)

        setContentView(R.layout.activity_webview)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val bundle=intent.extras
        var url = ""
        if(bundle!=null)
        {
            url = bundle.getString("url").toString()
        }

        webview.webViewClient = AppWebViewClients(progress_bar)
        webview.settings.javaScriptEnabled = true
        webview.loadUrl(url)
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}
