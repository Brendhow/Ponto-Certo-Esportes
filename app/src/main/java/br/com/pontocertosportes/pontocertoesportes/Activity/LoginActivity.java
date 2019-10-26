package br.com.pontocertosportes.pontocertoesportes.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import br.com.pontocertosportes.pontocertoesportes.R;

public class LoginActivity extends AppCompatActivity {

    EditText user;
    EditText password;
    TextView nameUserTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user = (EditText) findViewById(R.id.textUsuario);
        password = (EditText) findViewById(R.id.textSenha);
        nameUserTextView = (TextView) findViewById(R.id.nameUser);
    }

    public void login(View view){
        if(user.getText().toString().equals("user") && password.getText().toString().equals("password")){
            Intent openHomeActivity = new Intent(this, HomeActivity.class);
            startActivity(openHomeActivity);
        }else{
            Toast toast = Toast.makeText(getApplicationContext(),"Usuário ou senha incorretos",
                    Toast.LENGTH_SHORT);
            toast.show();
        }
    }
 }
