import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
  @Test
  public void testReversedNotEmpty(){
    int[] input = {1,2,3,4,5};
    assertArrayEquals(new int[]{5,4,3,2,1}, ArrayExamples.reversed(input));
  }
  @Test
  public void testReverseInPlaceNotEmpty(){
    int[] input = {1,2,3,4,5};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[]{5,4,3,2,1}, input);
  }
  @Test
  public void testAverageWithoutLowest(){
    double[] input = new double[]{1.2, 1.2, 1.2, 1.2, 1.2};
    double output = ArrayExamples.averageWithoutLowest(input);
    assertEquals(1.2,output,0.0);
  }
}
