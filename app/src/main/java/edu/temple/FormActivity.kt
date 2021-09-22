package edu.temple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.button.MaterialButton

class FormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TextView firstname =(TextView) findViewById(R.id.firstname);
        TextView lastname =(TextView) findViewById(R.id.lastname);
        TextView email =(TextView) findViewById(R.id.email);
        TextView password =(TextView) findViewById(R.id.password);
        TextView confirmpassword =(TextView) findViewById(R.id.confirmpassword);

        MaterialButton nextbutton = (MaterialButton) findViewById(R.id.nextbutton);
        MaterialButton loginbutton = (MaterialButton) findViewById(R.id.loginbutton);

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @override
            public void onClick(View v) {
                if (firstname.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                    Toast.makeText(FormActivity.this, "LOG IN SUCCESSFUL", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(FormActivity.this, "LOG IN FAILED", Toast.LENGTH_SHORT).show();
            }
        }




    }
}