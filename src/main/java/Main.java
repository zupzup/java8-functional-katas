import katas.*;
import static org.junit.Assert.*;

public class Main {
    public static void main(String[] args) {
        assertEquals(Kata1.execute().size(), 4);
        System.out.println("Kata 1 solved!");

        assertEquals(Kata2.execute().size(), 2);
        System.out.println("Kata 2 solved!");

        assertEquals(Kata3.execute().size(), 4);
        System.out.println("Kata 3 solved!");

        assertEquals(Kata4.execute().size(), 4);
        System.out.println("Kata 4 solved!");

        assertEquals(Kata5.execute(), 5.0, 0.0);
        System.out.println("Kata 5 solved!");

        assertEquals(Kata6.execute(), "http://cdn-0.nflximg.com/images/2891/Fracture300.jpg");
        System.out.println("Kata 6 solved!");

        assertEquals(Kata7.execute().size(), 4);
        System.out.println("Kata 7 solved!");

        assertEquals(Kata8.execute().size(), 3);
        System.out.println("Kata 8 solved!");

        assertEquals(Kata9.execute().size(), 4);
        System.out.println("Kata 9 solved!");

        assertEquals(Kata10.execute().size(), 2);
        System.out.println("Kata 10 solved!");

        assertEquals(Kata11.execute().size(), 2);
        System.out.println("Kata 11 solved!");

        System.out.println("ALL DONE, you're a functional programming NINJA!");
    }
}
