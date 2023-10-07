package task1.task1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Daftar_Activity : AppCompatActivity(), View.OnClickListener {

    private lateinit var edEmail : EditText
    private lateinit var edPassword : EditText
    private lateinit var edKonfirPassword :EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar)

        edEmail = findViewById(R.id.edt_email)
        edPassword = findViewById(R.id.edt_password)
        edKonfirPassword = findViewById(R.id.edt_konfirPassword)

        // Temukan TextView dengan ID "textClickable" dan tambahkan onClickListener
        val textClickable: TextView = findViewById(R.id.textClickableMasuk)
        textClickable.setOnClickListener(this)

        val btnDaftar: Button = findViewById(R.id.btn_daftar)
        btnDaftar.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_daftar -> {

                val bundle = Bundle()
                bundle.putString("email",edEmail.text.toString())
                bundle.putString("password",edPassword.text.toString())

                // Pindah ke Activity HomeActivity
                val intent = Intent(this@Daftar_Activity, LoginActivity::class.java)
                intent.putExtras(bundle)
                startActivity(intent)
            }
            R.id.textClickableMasuk ->{
                val intent = Intent(this@Daftar_Activity,LoginActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
