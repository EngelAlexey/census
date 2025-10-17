package Data

import Entity.Person

object MemoryDataManager: IDataManager {

    private var personList = mutableListOf<Person>()

    override fun add(person: Person) {
        personList.add(person)
    }

    override fun remove(id: String) {
        personList.removeIf{ it.Id.trim() == id.trim() }
    }

    override fun update(person: Person) {
        remove(person.Id)
        add(person)
    }
}