import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {
    public static void main(String[] args) {
        Knight knight = new Knight();
        Elf elf = new Elf();
        King king = new King();
        Hobbit hobit = new Hobbit();
        elf.init();
        knight.init();
        king.init();
        hobit.init();
        CharacterFactory factory = new CharacterFactory();
        GameManager game = new GameManager();
        assertEquals(elf.hp, 10);
        assertEquals(elf.power, 10);
        assert(knight.hp > 2);
        assert(knight.power > 2);
        assert(king.hp > 5);
        assert(king.power > 5);
        assert(game.fight(elf, knight) == true);
        assertEquals(hobit.hp, 3);
        assertEquals(hobit.power, 0);
    }
}
