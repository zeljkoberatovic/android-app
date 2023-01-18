package llc.amplitudo.amplitudo_akademija


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import llc.amplitudo.amplitudo_akademija.databinding.ActivityMainBinding
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController  //zauzeli mjesto u memoriji-ceka inicijalizaciju
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)//R.layout.activity_main
        super.onCreate(savedInstanceState)
        Timber.plant(Timber.DebugTree())
        window.statusBarColor = ContextCompat.getColor(this,R.color.purple)//R-resorses--mijenjamo boju na statusBar
        initNavigation()

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
     //kreirali fun za navigaciju
    private fun initNavigation(){
       val navHostFragment =
           supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
         navController = navHostFragment.navController
    }





}


























































