/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class AnimalTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }

    // TODO: test full constructor, getters, and toString
    /**
     * Test the full Animal constructor and the getters
     */
    public void fullConstructorTest() throws AssertException
    {
    	// Use the full constructor
    	Animal animal = new Animal("yellow", "Giraffe", 403.1, 20.5);
    	
    	//The name should be "Giraffe", color"yellow", height 20.5 and weight 403.1
    	Assert.assertEquals("yellow", animal.getColor());
        Assert.assertEquals("Giraffe", animal.getName());
        Assert.assertEquals(403.1, animal.getWeight(), 0.01);
        Assert.assertEquals(20.5, animal.getHeight(), 0.01);
    }
    
    /**
     * Test getColor()
     */
    public void getColorTest() throws AssertException
    {
    	Animal animal = new Animal("green","",0.0,0.0);
    	Assert.assertEquals("green", animal.getColor());
    }
    /**
     * Test getName()
     */
    public void getNameTest() throws AssertException
    {
    	Animal animal = new Animal("","lIzard",0.0,0.0);
    	Assert.assertEquals("lIzard", animal.getName());
    }
    /**
     * Test getHeight()
     */
    public void getHeightTest() throws AssertException
    {
    	Animal animal = new Animal("","",0.0,2.0357);
    	Assert.assertEquals(2.0357, animal.getHeight(), 0.01);
    }
    /**
     * Test getWeight()
     */
    public void getWeightTest() throws AssertException
    {
    	Animal animal = new Animal("","",400.7645,0.0);
    	Assert.assertEquals(400.7645, animal.getWeight(), 0.01);
    }
    
    /**
     * Test toString()
     */
    public void toStringTest() throws AssertException
    {
    	Animal animal = new Animal("yellow", "Giraffe", 403.156, 200.549);
    	
    	String expected = "Giraffe, a yellow-colored animal. 403.2 pounds, 200.5 inches\n";
    	Assert.assertEquals(expected, animal.toString());
    }
}

