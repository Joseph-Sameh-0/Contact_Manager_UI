package com.joseph_sameh_0.contactmanagerui

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ContactActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_contact)

        val btnSave by lazy { findViewById<Button>(R.id.btnSaveContact) }
        btnSave.setOnClickListener {
            val notes = findViewById<EditText>(R.id.etContactNotes).text.toString()
            Toast.makeText(this, "Saved: $notes", Toast.LENGTH_SHORT).show()
        }
    }
}