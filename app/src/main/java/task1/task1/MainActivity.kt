package task1.task1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_mulai : Button = findViewById(R.id.btn_mulai)
        btn_mulai.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_mulai ->{
                val intent = Intent (this@MainActivity,
                LoginActivity::class.java)
                startActivity(intent)
            }
        }
    }
}