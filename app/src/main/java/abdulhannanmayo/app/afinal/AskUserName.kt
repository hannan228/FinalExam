package abdulhannanmayo.app.afinal

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class AskUserName : AppCompatActivity() {


   lateinit var firstUserEditText: EditText
   lateinit var secondUserEditText: EditText
   lateinit var continueButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ask_user_name)

        continueButton = findViewById(R.id.button_continue)
        firstUserEditText = findViewById(R.id.first)
        secondUserEditText = findViewById(R.id.second)

        continueButton.setOnClickListener {
            val questionText: String = firstUserEditText.getText().toString()
            val answerText: String = secondUserEditText.getText().toString()

            Log.d("question", "" + questionText)
            Log.d("question's answer", "" + answerText)

        }


    }
}