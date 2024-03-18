import org.example.gameObjects.Arena
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class FightTest {
    private val testFight: Arena = Arena()

    @Test
    @DisplayName("1. Fight")
    fun `Warrior loses when fights against Knight`() {
        // given
        val carl = Warrior()
        val jon = Knight()
        // when
        val res = testFight.fight(carl,jon)
        // then
        assertEquals(false, res)
    }

    @Test
    @DisplayName("2. Fight")
    fun `Ramon defeats Slevin`() {
        // given
        val slevin = Warrior()
        val ramon = Knight()
        // when
        val res = testFight.fight(ramon,slevin)
        // then
        assertEquals(true, res)
    }

    @Test
    @DisplayName("3. Fight")
    fun `Bob is alive when fighting Mars`() {
        // given
        val bob = Warrior()
        val mars = Warrior()
        // when
        testFight.fight(bob,mars)
        // then
        assertEquals(true, bob.getIsAlive())
    }

    @Test
    @DisplayName("4. Fight")
    fun `Zeus is alive when fighting Godkiller`() {
        // given
        val godkiller = Warrior()
        val zeus = Knight()
        // when
        testFight.fight(zeus,godkiller)
        // then
        assertEquals(true, zeus.getIsAlive())
    }

    @Test
    @DisplayName("5. Fight")
    fun `Wife is dead when fighting husband `() {
        // given
        val husband = Warrior()
        val wife = Warrior()
        // when
        testFight.fight(husband,wife)
        // then
        assertEquals(false, wife.getIsAlive())
    }

    @Test
    @DisplayName("6. Fight")
    fun `Knight is alive when fighting Dragon`() {
        // given
        val dragon = Warrior()
        val knight = Knight()
        // when
        testFight.fight(dragon,knight)
        // then
        assertEquals(true, knight.getIsAlive())
    }

    @Test
    @DisplayName("7. Fight")
    fun `Unit 2 is dead`() {
        // given
        val unit1 = Warrior()
        val unit2 = Knight()
        val unit3 = Warrior()
        // when
        val res1 = testFight.fight(unit1,unit2)
        val res2 = testFight.fight(unit2,unit3)
        // then
        assertEquals(false, res2)
    }
}