package edu.temple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.view.View;
import android.widget.EditText;

/*
private var String.error: String
    get() {}
    set() {}
*/
class FormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

                val firstname: EditText = findViewById(R.id.firstName)
                val lastname : EditText = findViewById(R.id.lastName)
                val emailAdd: EditText = findViewById(R.id.email)
                val inputPassword: EditText = findViewById(R.id.userPassword)
                val confirmPassword: EditText = findViewById(R.id.confirmPassword)
                val registerButton: Button = findViewById(R.id.registerButton)

                // Create listener for click event
                val ocl: View.OnClickListener = object : View.OnClickListener {
                    override fun onClick(v: View?) {

                        val name: String = firstname.getText().toString()
                        val name2: String = lastname.getText().toString()
                        val email: String = emailAdd.getText().toString()
                        val uPassword: String = inputPassword.getText().toString()
                        val confirmPassword: String = confirmPassword.getText().toString()

                        if (name == "") {
                            val t: Toast = Toast.makeText(this@FormActivity, "Please enter a first name", Toast.LENGTH_SHORT)
                            t.show()
                        }//end if()

                        else if (name2 == "") {
                            val t: Toast = Toast.makeText(this@FormActivity, "Please enter a last name", Toast.LENGTH_SHORT)
                            t.show()
                        }//end if

                        else if(email == ""){
                            val t: Toast = Toast.makeText(this@FormActivity, "Please enter an email", Toast.LENGTH_SHORT)
                            t.show()
                        }//end else if()

                        else if ( (uPassword != confirmPassword) || (confirmPassword != uPassword)) {
                            val t: Toast = Toast.makeText(this@FormActivity, "Error: Passwords don't match", Toast.LENGTH_SHORT)
                            t.show()
                        }//end else if()

                        else {
                            val t: Toast =
                                Toast.makeText(this@FormActivity, "Your information has been saved! Welcome and thank you for registering!",
                                    Toast.LENGTH_SHORT)
                            t.show()
                        }//end else()
                    }//end onClick()
                }//end val ocl : View.OnClickListener = object : View.OnClickListener
                registerButton.setOnClickListener(ocl)
    }//end onCreate()
}//end class FormActivity()