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
		Zoo zoo = new Zoo(1);
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
		//Test with an empty zoo w/ capacity 1
		Zoo zoo = new Zoo(1);
		int expectedCapacity = 1;
		Assert.assertEquals(expectedCapacity, zoo.getCapacity());
		
		//Add two animals. Capacity shoudl double from 1 to 2
		zoo.addAnimal(new Animal("","",0.0,0.0));
		zoo.addAnimal(new Animal("","",0.0,0.0));
		expectedCapacity = 2;
		Assert.assertEquals(expectedCapacity, zoo.getCapacity());
	}
	
	/**
	 * Test the toString method
	 */
	public void toStringTest() throws AssertException
	{
		//Fill a zoo with some animals. Test against expected output
		Zoo zoo = new Zoo(3);
		Animal giraffe = new Animal("yellow","Giraffe",400.035,200.054);
		Animal rhino = new Animal("grey","Rhino",450.035,100.054);
		Animal silverback = new Animal("black","Silverback",200.035,80.543);
		zoo.addAnimal(giraffe);
		zoo.addAnimal(rhino);
		zoo.addAnimal(silverback);
		//Animal toString method utilized. This method is tested in AnimalTest.java
		String expected = "These animals live in the zoo: \n" + giraffe.toString() + rhino.toString() + silverback.toString();
		Assert.assertEquals(expected, zoo.toString());
	}
}
