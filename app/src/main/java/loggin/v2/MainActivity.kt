package loggin.v2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username = findViewById<TextView>(R.id.username)
        val password = findViewById<TextView>(R.id.password)

        val login_button = findViewById<TextView>(R.id.login_btn)

        login_button.setOnClickListener {
            if (username.text.toString() == "admin" && password.text.toString() == "admin") {
               Toast.makeText(this, "Login Success ✅", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Login Failed ❌", Toast.LENGTH_SHORT).show()
            }
        }

    }
}