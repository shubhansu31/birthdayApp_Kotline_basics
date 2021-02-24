package com.e.birthdayapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var buttonAdd : Button;
    private lateinit var nameInput : EditText;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonAdd = findViewById(R.id.button);
        nameInput = findViewById(R.id.editTextPersonName);

        buttonAdd.setOnClickListener{
            val intent : Intent = Intent(this,birthdayCard::class.java);
            val name : String = nameInput.editableText.toString();
            intent.putExtra("name", name);
            startActivity(intent);

        }
    }
}