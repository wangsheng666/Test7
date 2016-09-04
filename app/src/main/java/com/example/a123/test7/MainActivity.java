package com.example.a123.test7;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);



            Button button = (Button) findViewById(R.id.But_login);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    final View v=View.inflate(MainActivity.this,R.layout.login_layout,null);



                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

                    builder.setView(v)
                            .setTitle("Login")
                            // Add action buttons
                            .setPositiveButton(R.string.login, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int id) {
                                    EditText text1=(EditText)v. findViewById(R.id.editTextUserId);
                                    EditText text2=(EditText)v. findViewById(R.id.editTextPwd);
                                    final String username = text1.getText().toString();
                                    final String password = text2.getText().toString();
                                    Log.i("输出", "onClick: "+username+" "+password);
                                    if(username.equals("abc")&&password.equals("123"))
                                        Toast.makeText(MainActivity.this,"登陆成功",Toast.LENGTH_LONG).show();
                                    else
                                        Toast.makeText(MainActivity.this,"登陆失败",Toast.LENGTH_LONG).show();

                                }
                            });




                    builder.show();
                }
            });



        }
    }

