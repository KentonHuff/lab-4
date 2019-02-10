/**
 * Testing class for Equipment object
 *
 * @author Kenton Huff
 * @version 2018-02-09
 */
public class EquipmentTest
{
	/**
	 * Test the full Equipment constructor and the getters
	 */
	public void fullConstructorTest() throws AssertException
	{
		// Use the full constructor
		Equipment equip = new Equipment("Batarang/6,15.739,475.9925,Bat-shaped boomerangs");
		
		// The name should be "Batarang", count should be 6, totalWeight should be 15.739, totalPrice  should be 475.9925, description should be "Bat-shaped boomerangs"
		Assert.assertEquals("Batarang", equip.getName());
		Assert.assertEquals(6, equip.getCount());
		Assert.assertEquals(15.739, equip.getTotalWeight());
		Assert.assertEquals(475.9925, equip.getTotalPrice());
		Assert.assertEquals("Bat-shaped boomerangs", equip.getDescription());
	}
	
	/**
     * Test getName()
     */
    public void getNameTest() throws AssertException
    {
    	Equipment equip = new Equipment("Batarang/6,15.739,475.9925,Bat-shaped boomerangs");
    	Assert.assertEquals("Batarang", equip.getName());
    }
    /**
     * Test getCount()
     */
    public void getCountTest() throws AssertException
    {
    	Equipment equip = new Equipment("Batarang/6,15.739,475.9925,Bat-shaped boomerangs");
    	Assert.assertEquals(6, equip.getCount());
    }
    /**
     * Test getTotalWeight()
     */
    public void getTotalWeightTest() throws AssertException
    {
    	Equipment equip = new Equipment("Batarang/6,15.739,475.9925,Bat-shaped boomerangs");
    	Assert.assertEquals(15.739, equip.getTotalWeight());
    }
    /**
     * Test getTotalPrice()
     */
    public void getTotalPriceTest() throws AssertException
    {
    	Equipment equip = new Equipment("Batarang/6,15.739,475.9925,Bat-shaped boomerangs");
    	Assert.assertEquals(475.9925, equip.getTotalPrice());
    }
    
    /**
     * Test getDescription()
     */
    public void getDescriptionTest() throws AssertException
    {
    	Equipment equip = new Equipment("Batarang/6,15.739,475.9925,Bat-shaped boomerangs");
    	Assert.assertEquals("Bat-shaped boomerangs", equip.getDescription());
    }
    
    /**
     * Test toString()
     */
    public void toStringTest() throws AssertException
    {
    	Equipment equip = new Equipment("Batarang/6,15.739,475.9925,Bat-shaped boomerangs");
    	String expected = "Name: Batarang, Number: 6, Weight: 15.74 lbs, Price: $475.99 - Bat-shaped boomerangs";
    	Assert.assertEquals(expected, equip.toString());
    }
    
}