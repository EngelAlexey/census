package Controller

import Data.IDataManager
import Data.MemoryDataManager
import Entity.Person
import android.content.Context

class PersonController {

    private var dataManager: IDataManager = MemoryDataManager
    private var context: Context

    constructor(context: Context){
        this.context=context
    }

    fun addPerson(person: Person){
        try {
            dataManager.add(person)
        } catch (e: Exception){
            throw e
        }

    }

}