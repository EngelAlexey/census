package com.example.census

import Entity.Person
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class PersonActivity : AppCompatActivity() {

    lateinit var TextId: EditText
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

        TextId = findViewById<EditText>(R.id.inpId_person)
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

        var btnSave = findViewById<Button>(R.id.btnAdd_person)
        btnSave.setOnClickListener { View.OnClickListener {view ->
            savePerson()
        } }
    }

    fun validationData(): Boolean{
        return true
    }
    fun savePerson(){
        try {
            val person = Person()
            person.Id = TextId.text.toString()
            person.Name = TextName.text.toString()
            person.FLastName = TextFLastName.text.toString()
            person.SLastName = TextName.text.toString()
            person.Email = TextEmail.text.toString()
            person.State = TextState.text.toString()
            person.District = TextDistrict.text.toString()
            person.Address = TextAddress.text.toString()

            if (validationData() == true){

            } else {
                //Toast.makeText(this, e.message.toString(), Toast.LENGTH_LONG).show()
            }

        } catch (e: Exception){
            Toast.makeText(this, e.message.toString(), Toast.LENGTH_LONG).show()
        }
    }
}