package org.example

import Army
import Knight
import Warrior
import org.example.gameObjects.Arena

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val arena = Arena()
    val chuck = Warrior()
    val bruce = Warrior()
    check(arena.fight(chuck, bruce)) { "Warrior should win Warrior" }
    check(chuck.getIsAlive()) { "Warrior winner should be alive" }
    check(!bruce.getIsAlive()) { "Warrior defeated should not be alive" }
    val dave = Warrior()
    val carl = Knight()
    check(!arena.fight(dave, carl)) { "Warrior should lose to Knight" }
    check(carl.getIsAlive()) { "Knight winner should be alive" }
    check(!dave.getIsAlive()) { "Warrior defeated should not be alive" }
    println("OK")

    val myArmy = Army()
    myArmy.addUnits(3) { Knight() }

    val enemyArmy = Army()
    enemyArmy.addUnits(3) { Warrior() }

    val army3 = Army()
    army3.addUnits(20) { Warrior() }
    army3.addUnits(5) { Knight() }

    val army4 = Army()
    army4.addUnits(30) { Warrior() }

    val res1 = arena.fight(myArmy, enemyArmy)
    val res2 = arena.fight(army3, army4)
    println("myArmy: ${myArmy.getUnitsSize()}")
    println("enemyArmy: ${enemyArmy.getUnitsSize()}")
    check(res1)
    check(!res2)
    println("OK")


}