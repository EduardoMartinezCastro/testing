//Duda 1, escribir manualmente getters y setters sobre propiedades protected da error
open class Warrior(protected var health: Int = 50, protected val attack:Int = 5){
    protected var isAlive: Boolean = true



    fun getCombatientAttack():Int {
        return attack
    }

    fun getCombatientHealth():Int{
        return health
    }

    fun getIsAlive():Boolean{
        return isAlive
    }

    fun takeDamage(damage:Int){
        health -= damage
        if(health<=0){
            isAlive=false
        }
    }

}

class Knight() : Warrior(attack = 7) {
    //constructor():super(attack = 7)
}

//Duda 2: variable sin var/val se vuelve parametro dentro de constructor, en vez de propiedad
class Army{
    private val units = mutableListOf<Warrior>()

    // Duda 3: Como hacer que addUnit, pueda llamarse timpo addUnit(10) { Warrior() }
    fun addUnits(unitsToAdd: Int, warrior: () -> Warrior){
        for(i in 1..unitsToAdd){
            units.add(warrior())
        }
    }
    fun getUnits():MutableList<Warrior>{
        return units
    }

    fun getUnitsSize():Int{
        return units.size
    }


}



