package llc.amplitudo.amplitudo_akademija

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import llc.amplitudo.amplitudo_akademija.databinding.ActivityMainBinding
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)//R.layout.activity_main
        super.onCreate(savedInstanceState)

        Timber.plant(Timber.DebugTree())
        window.statusBarColor = ContextCompat.getColor(this,R.color.purple)//R-resorses--mijenjamo boju na statusBar


    println("Activity is being created...")
    }

    override fun onStart() {
        super.onStart()

        //binding.beAware.text = "Anithing"  --mozemo i na ovaj nacin pristupiti
        Timber.d("Activity is starting...")
    }

    override fun onResume() {
        super.onResume()
        Timber.d("Activity is resuming...")
    }

    override fun onPause() {
        super.onPause()
        Timber.d("Activity is being paused... ")
    }

    override fun onStop() {
        super.onStop()
        Timber.d("Activity is stopping ")
    }

    override fun onRestart() {
        super.onRestart()
        Timber.d("Activity is restarting")
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.d("Activity is being destroy")
    }





}


























































