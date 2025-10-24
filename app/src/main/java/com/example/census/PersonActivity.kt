package com.example.census

import android.os.Bundle
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PersonActivity : AppCompatActivity() {

    lateinit var txtId: EditText
    lateinit var TextName: EditText
    lateinit var TextFLastName: EditText
    lateinit var TextSLastName: EditText
    lateinit var TextEmail: EditText
    lateinit var TextPhone: EditText
    lateinit var TextProvince: EditText
    lateinit var TextState: EditText
    lateinit var TextAddress: EditText
    lateinit var TextDistrict: EditText
    lateinit var TextBirthdate: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_person)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        txtId = findViewById<EditText>(R.id.inpId_person)
        TextName = findViewById<EditText>(R.id.inpName_person)
        TextFLastName = findViewById<EditText>(R.id.inpFLastName_person)
        TextSLastName = findViewById<EditText>(R.id.inpSLastName_person)
        TextEmail = findViewById<EditText>(R.id.inpEmail_Person)
        TextPhone = findViewById<EditText>(R.id.inpPhone_person)
        TextProvince = findViewById<EditText>(R.id.inpProvince_person)
        TextState = findViewById<EditText>(R.id.inpState_person)
        TextAddress = findViewById<EditText>(R.id.inpAddress_person)
        TextDistrict = findViewById<EditText>(R.id.inpDistrict_person)
        TextBirthdate = findViewById<EditText>(R.id.inpBirthdate_person)
    }
}