package Entity

import android.graphics.Bitmap
import java.sql.Date

class Person {

    private var id:                 String  =""
    private var name:               String  =""
    private var fLastName:          String  =""
    private var phone:              Int     =0
    private lateinit var brithday:  Date
    private lateinit var province:  Province
    private var state:              String  =""
    private var district:           String  =""
    private var address:            String  =""
    private var latitude:           Int     =0
    private var longitude:          Int     =0
    private lateinit var photo:     Bitmap

    constructor(name: String)
}