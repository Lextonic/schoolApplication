package lextonic.groen_van_prinsterer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button Login;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Name = (EditText)findViewById(R.id.etName);
        Password = (EditText)findViewById(R.id.etPassword);
        Info = (TextView)findViewById(R.id.tvInfo);
        Login = (Button)findViewById(R.id.btnLogin);
    }

    private void validate(String userName, String userPassword) {
        if ((userName == "Admin") && (userPassword == "1234")) {
           Intent intent = new Intent(LoginActivity.this, SecondActivity.class);
        }
        }
    }
}
