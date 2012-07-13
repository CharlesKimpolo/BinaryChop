import org.junit.Test;
import sun.org.mozilla.javascript.internal.Function;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class KarateChopTest {

   @Test
   public void shouldBeAbleToSearchATargetIndexInArray() throws Exception {

       KarateChop[] implementations = new KarateChop[]{ new IterativeKarateChop(), new RecursiveKarateChop(), new FunctionalKarateChop()};

       for (KarateChop implementation : implementations  ) {

        assertEquals(-1,  implementation.chop(3, new Integer[]{}));
        assertEquals(-1,  implementation.chop(3, new Integer[]{1}));
        assertEquals(0,  implementation.chop(1, new Integer[]{1}));
        assertEquals(0,  implementation.chop(1, new Integer[]{1, 3, 5}));
        assertEquals(1,  implementation.chop(3, new Integer[]{1, 3, 5}));
        assertEquals(2,  implementation.chop(5, new Integer[]{1, 3, 5}));
        assertEquals(-1,  implementation.chop(0, new Integer[]{1, 3, 5}));
        assertEquals(-1,  implementation.chop(2, new Integer[]{1, 3, 5}));
        assertEquals(-1,  implementation.chop(4, new Integer[]{1, 3, 5}));
        assertEquals(-1,  implementation.chop(6, new Integer[]{1, 3, 5}));
        assertEquals(0,  implementation.chop(1, new Integer[]{1, 3, 5, 7}));
        assertEquals(1,  implementation.chop(3, new Integer[]{1, 3, 5, 7}));
        assertEquals(2,  implementation.chop(5, new Integer[]{1, 3, 5, 7}));
        assertEquals(3,  implementation.chop(7, new Integer[]{1, 3, 5, 7}));

        assertEquals(-1,  implementation.chop(0, new Integer[]{1, 3, 5, 7}));
        assertEquals(-1,  implementation.chop(2, new Integer[]{1, 3, 5, 7}));
        assertEquals(-1,  implementation.chop(4, new Integer[]{1, 3, 5, 7}));
        assertEquals(-1,  implementation.chop(6, new Integer[]{1, 3, 5, 7}));
        assertEquals(-1,  implementation.chop(8, new Integer[]{1, 3, 5, 7}));

   }

}


}


