import java.util.Arrays;
/**
 * Testing class for Zoo object
 *
 * @author Kenton Huff
 * @version 2019-02-09
 */
public class ZooTest
{
	/**
	 * Test the empty getTotalHeight method
	 */
	public void getTotalHeight() throws AssertException
	{
		//Test with empty zoo
		Zoo zoo = new Zoo(0);
		double expectedTotalHeight = 0.0;
		Assert.assertEquals(expectedTotalHeight, zoo.getTotalHeight(), 0.01);
		
		//Test with some animals in a zoo
		zoo.addAnimal(new Animal("","",0.0,5.6293));
		zoo.addAnimal(new Animal("","",0.0,7.3251));
		zoo.addAnimal(new Animal("","",0.0,5.4479));
		expectedTotalHeight = 5.6293 + 7.3251 + 5.4479;
		Assert.assertEquals(expectedTotalHeight, zoo.getTotalHeight(), 0.01);
	}
	
	/**
	 * Test the getCapacity method
	 */
	public void getCapacityTest() throws AssertException
	{
		
	}
	
	/**
	 * Test the toString method
	 */
	public void toStringTest() throws AssertException
	{
		
	}
}
