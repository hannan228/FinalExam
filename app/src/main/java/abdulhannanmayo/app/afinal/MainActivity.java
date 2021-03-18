package abdulhannanmayo.app.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText questionEditText;
    EditText answerEditText;
    Button continueButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionEditText = findViewById(R.id.question);
        answerEditText = findViewById(R.id.answer);

        continueButton = findViewById(R.id.button_continue);

        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String questionText = String.valueOf(questionEditText.getText());
                String answerText = String.valueOf(answerEditText.getText());

                Log.d("question",""+questionText);
                Log.d("question's answer",""+answerText);
            }
        });

    }
}