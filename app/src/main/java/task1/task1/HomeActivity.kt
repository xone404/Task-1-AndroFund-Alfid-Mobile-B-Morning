package task1.task1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class HomeActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var tv : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        tv =findViewById(R.id.textView2)

        val email = intent.getParcelableExtra<User>("User")?.email
        val password = intent.getParcelableExtra<User>("user")?.password
        tv.text = "email: $email dan Password: $password"

        val btnkembali : Button = findViewById(R.id.btn_kembali)
        btnkembali.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id){
            R.id.btn_kembali ->{
                val intent = Intent(this@HomeActivity,LoginActivity::class.java)
                startActivity(intent)
            }
        }
    }
}