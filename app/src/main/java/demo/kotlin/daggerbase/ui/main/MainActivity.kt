package demo.kotlin.daggerbase.ui.main

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import dagger.android.support.DaggerAppCompatActivity
import demo.kotlin.daggerbase.R
import demo.kotlin.daggerbase.domain.Hello

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {
    @Inject
    lateinit var hello: Hello

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { textView.text = hello.text }

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_reset -> {
                textView.text = getString(R.string.hello_world)
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
