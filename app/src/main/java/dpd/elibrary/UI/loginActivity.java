package dpd.elibrary.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import dpd.elibrary.R;

public class loginActivity extends AppCompatActivity {
    EditText UserID_ET,UserPass_ET;
    Button Login_BTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        UserID_ET = findViewById(R.id.UserID_ET);
        UserPass_ET = findViewById(R.id.Passcode_ET);
        Login_BTN = findViewById(R.id.Login_BTN);
        Login_BTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(UserID_ET.getText().toString().equals("DPD")&&UserPass_ET.getText().toString().equals("123456")){
                 startActivity(new Intent(loginActivity.this,DashboradActivity.class));
                }else {
                    Toast.makeText(loginActivity.this,"Please Check User ID and Password",Toast.LENGTH_SHORT).show();

                }
            }
        });
        if(UserID_ET.getText().toString().equals("DPD")&&UserPass_ET.getText().toString().equals("123456")){


        }else {


        }


    }
}