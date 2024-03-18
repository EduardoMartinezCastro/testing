package org.example.gameObjects

import Army
import Warrior

class Arena {

    fun fight(warrior1:Warrior, warrior2: Warrior):Boolean{
        var firstTurn = true
        while(warrior1.getIsAlive() && warrior2.getIsAlive()){
            if(firstTurn){
                warrior2.takeDamage(warrior1.getCombatientAttack())
            }else{
                warrior1.takeDamage(warrior2.getCombatientAttack())
            }
            firstTurn=!firstTurn
        }
        return warrior1.getIsAlive()
    }

    fun fight(army1: Army, army2: Army): Boolean{

        val army1Units = army1.getUnits()
        val army2Units = army2.getUnits()
        while(army1Units.isNotEmpty() && army2Units.isNotEmpty()){
            val res = fight(army1Units[0],army2Units[0])
            if(res){
                army2Units.removeAt(0)
            }else{
                army1Units.removeAt(0)
            }
        }
        return army1Units.isNotEmpty()
    }

}