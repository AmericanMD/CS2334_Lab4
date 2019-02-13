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
	
	public void testingAnimalMethod() throws AssertException{
		// Use the default constructor
	    Animal animal = new Animal("orange", "tiger", 350.0, 36.0);
	
	    // The name should be "tiger", color "unknown", height and weight 0.
	    Assert.assertEquals("orange", animal.getColor());
	    Assert.assertEquals("tiger", animal.getName());
	    Assert.assertEquals(350.0, animal.getHeight(), 0.01);
	    Assert.assertEquals(36.0, animal.getWeight(), 0.01);
	}
	
	public void getColorTest() throws AssertException{
		String expected = "blue";
		Animal obj = new Animal("blue", "jellyfish", 10, 23);
		Assert.assertTrue(expected.equals("blue"));
	}
	
	public void getNameTest() throws AssertException{
		String expected = "dog";
		Animal obj = new Animal("brown", "dog", 60, 27);
		Assert.assertTrue(expected.equals("dog"));
	}
	    
	public void getWeightTest() throws AssertException{
	    double expected = 5.0;
	    Animal obj = new Animal("yellow", "sponge", 5.0, 43.0);
	    Assert.assertEquals(expected, 5.0);
	}
	
	public void getHeightTest() throws AssertException{
		double expected = 41.0;
		Animal obj = new Animal("black", "gorilla", 450, 41.0);
		Assert.assertEquals(expected, 41.0);
	}
	
	public void toStringTest() throws AssertException{
		String expected = "cat, a white-colored animal. 13 pounds, 14 inches\n";
		Animal obj = new Animal("white", "cat", 13, 14);
		Assert.assertTrue(expected.equals(obj.toString()));
	}
	
	public void equalsTest() throws AssertException{
		Animal expected = new Animal("green", "snake", 40, 8);
		Animal obj = new Animal("green", "snake", 40, 8);
		Assert.assertEquals(expected, obj);
	}
}

