package caique.me.caiqueme

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_card_aboutme.setOnClickListener { startActivity(Intent(this, AboutMeActivity::class.java)) }

        main_card_timeline.setOnClickListener { startActivity(Intent(this, TimelineActivity::class.java))  }

        main_card_projects.setOnClickListener { startActivity(Intent(this, ProjectsActivity::class.java))  }

    }
}
