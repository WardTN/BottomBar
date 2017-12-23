package lbstest.example.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private EditText etUserName;
    private EditText etUserPassword;
    private Button btnLogin;
    private String userName;
    private String userPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
   private void init(){
        EditText userName = findViewById(R.id.et_userName);
        EditText password = findViewById(R.id.et_password);
       ImageView unameClear = findViewById(R.id.iv_unameClear);
       ImageView pwdClear = findViewById(R.id.iv_pwdClear);

       EditTextClearTools.addClearListener(userName,unameClear);
       EditTextClearTools.addClearListener(password,pwdClear);
   }


}
