package edu.unikom.activitylifecyclesproject

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import edu.unikom.activitylifecyclesproject.MainActivity.Companion

class MainActivity2 : AppCompatActivity() {

    companion object {
        private const val TAG = "MainActivity2"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

    }
    fun launchMainActivity3(view: View) {
        startActivity(Intent(this, MainActivity3::class.java))
        Log.d(TAG, "onCreate mainActivity 2 Terpanggil")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart mainActivity 2 Terpanggil")
    }
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart mainActivity 2 Terpanggil")
    }
    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume mainActivity 2 Terpanggil")
    }
    override fun onPause(){
        super.onPause()
        Log.d(TAG, "onPause mainActivity 2 Terpanggil")
    }
    override fun onStop(){
        super.onStop()
        Log.d(TAG, "onStop mainActivity 2 Terpanggil")
    }
}