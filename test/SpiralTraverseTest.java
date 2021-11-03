// This file is initialized with a code version of this
// question's sample test case. Feel free to add, edit,
// or remove test cases in this file as you see fit!


import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ProgramTest {
    @Test
    public void TestCase1() {
        var input = new int[] {1, 1, 1, 2, 3, 10, 12, -3, -3, 2, 3, 45, 800, 99, 98, 0, -1, -1, 2, 3, 4, 5, 0, -1, -1};
        var expected = 9;
        var actual = Program.longestPeak(input);
        Assert.assertTrue(expected == actual);
    }
}
