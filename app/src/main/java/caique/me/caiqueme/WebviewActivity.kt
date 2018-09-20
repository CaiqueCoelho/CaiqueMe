package caique.me.caiqueme

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_webview.*

class WebviewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)

        val bundle=intent.extras
        var url = ""
        if(bundle!=null)
        {
            url = bundle.getString("url").toString()
        }

        webview.loadUrl(url)
    }
}
