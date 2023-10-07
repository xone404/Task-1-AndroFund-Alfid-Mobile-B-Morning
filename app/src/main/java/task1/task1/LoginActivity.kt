package task1.task1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LoginActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var edEmail : EditText
    private lateinit var edPassword : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        edEmail = findViewById(R.id.edt_email)
        edPassword = findViewById(R.id.edt_password)

        val bundle = intent.extras
        if (bundle !=null)
            edEmail.setText(bundle.getString("email"))
        if (bundle != null) {
            edPassword.setText(bundle.getString("password"))
        }

        // Temukan TextView dengan ID "textClickable" dan tambahkan onClickListener
        val textClickable: TextView = findViewById(R.id.textClickableDaftar)
        textClickable.setOnClickListener(this)

        val btnMasuk: Button = findViewById(R.id.btn_masuk)
        btnMasuk.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_masuk -> {
                // Pindah ke Activity HomeActivity
                val intent = Intent(this@LoginActivity, HomeActivity::class.java)
                intent.putExtra("User",User(edEmail.text.toString(),edPassword.text.toString()))
                startActivity(intent)
            }
            R.id.textClickableDaftar ->{
                val intent = Intent(this@LoginActivity,Daftar_Activity::class.java)
                startActivity(intent)
            }
        }
    }
}
