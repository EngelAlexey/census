package Controller

import Data.IDataManager
import Data.MemoryDataManager
import Entity.Person
import android.content.Context
import com.example.census.R

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
            throw Exception(context.getString(R.string.ErrorMsgAdd))
        }
    }

    fun updatePerson(person: Person){
        try {
            dataManager.update(person)
        } catch (e: Exception){
            throw Exception(context.getString(R.string.ErrorMsgUpdate))
        }
    }

    fun removePerson(id: String){
        try {
            val result = dataManager.getById(id)

            if(result == null){
                throw Exception(context.getString(R.string.MsgDataNotFound))
            }
            dataManager.remove(id)
        } catch (e: Exception){
            throw Exception(context.getString(R.string.ErrorMsgRemove))
        }
    }

    fun getAllPerson(): List<Person>{
        try {
            return dataManager.getAll()
        } catch (e: Exception){
            throw Exception(context.getString(R.string.ErrorMsgGetAll))
        }
    }

    fun getByIdPerson(id: String): Person {
        try {
            var result = dataManager.getById(id)
            if (result == null){
                throw Exception(context.getString(R.string.ErrorMsgGetById))
            }
            return result
        } catch (e: Exception){
            throw Exception(context.getString(R.string.ErrorMsgGetById))
        }
    }

    fun getByFullName(id: String): Person {
        try {
            var result = dataManager.getByFullName(id)
            if (result == null){
                throw Exception(context.getString(R.string.ErrorMsgGetById))
            }
            return result
        } catch (e: Exception){
            throw Exception(context.getString(R.string.ErrorMsgGetById))
        }
    }

}