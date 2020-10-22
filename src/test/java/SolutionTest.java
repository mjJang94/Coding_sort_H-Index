import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @org.junit.Test
    public void solutionTest(){

        Solution sol = new Solution();

        assertEquals(3, sol.solution(new int[]{3,0,6,1,5}));
        assertEquals(6, sol.solution(new int[]{1545, 2, 999, 790, 540, 10, 22}));
        assertEquals(3, sol.solution(new int[]{1, 7, 0, 1, 6, 4}));
        assertEquals(0, sol.solution(new int[]{0}));

    }
}
