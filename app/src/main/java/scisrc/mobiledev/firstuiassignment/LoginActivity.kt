package scisrc.mobiledev.firstuiassignment

import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.setPadding

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val scrollView = ScrollView(this).apply {
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
            )
        }
        
        val mainLayout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER_HORIZONTAL
            setPadding(32)
        }
        
        val logoImageView = ImageView(this).apply {
            layoutParams = LinearLayout.LayoutParams(200, 200).apply {
                bottomMargin = 48
            }
            setImageDrawable(ContextCompat.getDrawable(this@LoginActivity, R.drawable.logo))
            contentDescription = "Logo"
        }
        mainLayout.addView(logoImageView)

        val emailEditText = EditText(this).apply {
            hint = "Email address"
            inputType = android.text.InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS
            setBackgroundResource(android.R.drawable.edit_text)
            setPadding(24)
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            ).apply {
                bottomMargin = 16
            }
        }
        mainLayout.addView(emailEditText)

        val passwordEditText = EditText(this).apply {
            hint = "Password"
            inputType = android.text.InputType.TYPE_TEXT_VARIATION_PASSWORD
            setBackgroundResource(android.R.drawable.edit_text)
            setPadding(24)
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            ).apply {
                bottomMargin = 16
            }
        }
        mainLayout.addView(passwordEditText)

        val forgotPasswordTextView = TextView(this).apply {
            text = "Forgot Password?"
            setTextColor(Color.BLUE)
            gravity = Gravity.END
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            ).apply {
                bottomMargin = 32
            }
        }
        mainLayout.addView(forgotPasswordTextView)

        val loginButton = Button(this).apply {
            text = "LOGIN"
            setBackgroundResource(android.R.drawable.btn_default)
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            ).apply {
                bottomMargin = 32
            }
        }
        mainLayout.addView(loginButton)

        val dividerLayout = LinearLayout(this).apply {
            orientation = LinearLayout.HORIZONTAL
            gravity = Gravity.CENTER
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            ).apply {
                bottomMargin = 32
            }
            val dividerParams = LinearLayout.LayoutParams(0, 2, 1f).apply { marginEnd = 16 }
            val dividerLeft = View(this@LoginActivity).apply {
                layoutParams = dividerParams
                setBackgroundColor(Color.DKGRAY)
            }
            val dividerRight = View(this@LoginActivity).apply {
                layoutParams = dividerParams
                setBackgroundColor(Color.DKGRAY)
            }
            val orTextView = TextView(this@LoginActivity).apply {
                text = "OR"
                setPadding(16)
            }
            addView(dividerLeft)
            addView(orTextView)
            addView(dividerRight)
        }
        mainLayout.addView(dividerLayout)

        val buttonLayout = LinearLayout(this).apply {
            orientation = LinearLayout.HORIZONTAL
            gravity = Gravity.CENTER
            val buttonParams = LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.WRAP_CONTENT, 1f).apply {
                marginEnd = 10
            }
            val googleButton = Button(this@LoginActivity).apply {
                text = "Google"
                setBackgroundResource(android.R.drawable.btn_default)
            }
            val facebookButton = Button(this@LoginActivity).apply {
                text = "Facebook"
                setBackgroundResource(android.R.drawable.btn_default)
            }
            addView(googleButton, buttonParams)
            addView(facebookButton, buttonParams)
        }
        mainLayout.addView(buttonLayout)

        val signUpTextView = TextView(this).apply {
            text = "Don't have an account? Sign Up"
            setTextColor(Color.BLUE)
            gravity = Gravity.CENTER
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            ).apply {
                topMargin = 32
            }
        }
        mainLayout.addView(signUpTextView)

        scrollView.addView(mainLayout)
        setContentView(scrollView)
    }
}
