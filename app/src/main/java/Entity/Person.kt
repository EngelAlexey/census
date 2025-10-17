package Entity

import android.graphics.Bitmap
import android.location.Address
import java.util.Date

class Person {
    private var id: String = ""
    private var name: String = ""
    private var fLastName: String = ""
    private var sLastName: String = ""
    private var phone: Int = 0
    private var email: String = ""
    private lateinit var dayOfBirth: Date
    private lateinit var province: Province
    private var state: String = ""
    private var district: String = ""
    private var address: String = ""
    private var latitude: Int = 0
    private var longitude: Int = 0
    private lateinit var photo: Bitmap

    constructor(id: String, name: String, fLastName: String, sLastName: String, phone: Int, email: String,
                datOfBirth: Date, province: Province, state: String, district: String, address: String, latitude: Int, longitude: Int, photo: Bitmap)

    {

        this.id=id
        this.name=name
        this.fLastName=flastname
        this.sLastName=slastname
        this.phone=phone
        this.email=email
        this.dayOfBirth=datOfBirth
        this.province=province
        this.state=state
        this.district=district
        this.address=address

    }

    var Id: String
        get() = this.name
        set(value) {this.name = value}

    var Name: String
        get() = this.name
        set(value) {this.name = value}

    var FLastName: String
        get() = this.fLastName
        set(value) {this.fLastName = value}

    var SLastName: String
        get() = this.sLastName
        set(value) {this.sLastName = value}

    var Phone: Int
        get() = this.phone
        set(value) {this.phone = value}

    var Email: String
        get() = this.email
        set(value) {this.email = value}


    var DayOfBirth: Date
        get() = this.dayOfBirth
        set(value) {this.dayOfBirth = value}

    var Province: Province
        get() = this.province
        set(value) {this.province = value}

    var State: String
        get() = this.state
        set(value) {this.state = value}

    var District: String
        get() = this.district
        set(value) {this.district = value}

    var Address: String
        get() = this.address
        set(value) {this.address = value}

    var Latitude: Int
        get() = this.latitude
        set(value) {this.latitude = value}

    var Longitude: Int
        get() = this.longitude
        set(value) {this.longitude = value}

    var Photo: Bitmap
        get() = this.photo
        set(value) {this.photo = value}

    fun FullName() = "$this.name $this.fLastName $this.sLastName"
}