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
    
    public void equalsTest() throws AssertException
    {
    	//If They are the same object
    	Equipment eqOne = new Equipment("Batarang/6,15.739,475.9925,Bat-shaped boomerangs");
    	Equipment eqTwo = eqOne;
    	Assert.assertTrue(eqOne.equals(eqTwo));
    	
    	//If one is not an Equipment object
    	Assert.assertFalse(eqOne.equals(new Object()));
    	//If name is different
    	eqTwo = new Equipment("Bats/6,15.739,475.9925,Bat-shaped boomerangs");
    	Assert.assertFalse(eqOne.equals(eqTwo));
    	//If count is different
    	eqTwo = new Equipment("Batarang/7,15.739,475.9925,Bat-shaped boomerangs");
    	Assert.assertFalse(eqOne.equals(eqTwo));
    	//If totalWeight is different
    	eqTwo = new Equipment("Batarang/6,0.0,475.9925,Bat-shaped boomerangs");
    	Assert.assertFalse(eqOne.equals(eqTwo));
    	//If totalPrice is different
    	eqTwo = new Equipment("Batarang/6,15.739,0.0,Bat-shaped boomerangs");
    	Assert.assertFalse(eqOne.equals(eqTwo));
    	//If description is different
    	eqTwo = new Equipment("Batarang/6,15.739,475.9925,A bat");
    	Assert.assertFalse(eqOne.equals(eqTwo));
    	//If all data is the same
    	eqTwo = new Equipment("Batarang/6,15.739,475.9925,Bat-shaped boomerangs");
    	Assert.assertTrue(eqOne.equals(eqTwo));
    }
    
}