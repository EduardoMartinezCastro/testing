import org.example.gameObjects.Arena
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FightArmyTest {

    private val testArmyFight : Arena = Arena()

    @Test
    @DisplayName("1. Battle")
    fun `Army with 1 warriors loses to Army with 2 warriors`(){

        //given
        val army1 = Army()
        val army2 = Army()
        army1.addUnits(1){Warrior()}
        army2.addUnits(2){Warrior()}

        //when
        val res = testArmyFight.fight(army1,army2)

        //then
        assertEquals(false,res)
    }

    @Test
    @DisplayName("2. Battle")
    fun `Army with 2 warriors loses to Army with 3 warriors`(){

        //given
        val army1 = Army()
        val army2 = Army()
        army1.addUnits(2){Warrior()}
        army2.addUnits(3){Warrior()}

        //when
        val res = testArmyFight.fight(army1,army2)

        //then
        assertEquals(false,res)
    }

    @Test
    @DisplayName("3. Battle")
    fun `Army with 5 warriors loses to Army with 7 warriors`(){

        //given
        val army1 = Army()
        val army2 = Army()
        army1.addUnits(5){Warrior()}
        army2.addUnits(7){Warrior()}

        //when
        val res = testArmyFight.fight(army1,army2)

        //then
        assertEquals(false,res)
    }

    @Test
    @DisplayName("4. Battle")
    fun `Army with 20 warriors wins over Army with 21 warriors`(){

        //given
        val army1 = Army()
        val army2 = Army()
        army1.addUnits(20){Warrior()}
        army2.addUnits(21){Warrior()}

        //when
        val res = testArmyFight.fight(army1,army2)

        //then
        assertEquals(true,res)
    }

    @Test
    @DisplayName("5. Battle")
    fun `Army with 10 warriors wins over Army with 1 warriors`(){

        //given
        val army1 = Army()
        val army2 = Army()
        army1.addUnits(10){Warrior()}
        army2.addUnits(11){Warrior()}

        //when
        val res = testArmyFight.fight(army1,army2)

        //then
        assertEquals(true,res)
    }

    @Test
    @DisplayName("6. Battle")
    fun `Army with 11 warriors wins over Army with 7 warriors`(){

        //given
        val army1 = Army()
        val army2 = Army()
        army1.addUnits(11){Warrior()}
        army2.addUnits(7){Warrior()}

        //when
        val res = testArmyFight.fight(army1,army2)

        //then
        assertEquals(true,res)
    }

}