// Test methods in the Zoo Class
public class ZooTest{
	
	public void TestingZoo() throws AssertException{
		int expected = 34;
		Zoo obj = new Zoo(34);
		Assert.assertEquals(expected, obj.getCapacity());
	}
	
	public void expandZooTest() throws AssertException{
		int expected = 4;
		Zoo obj = new Zoo(2);
		Animal ani = new Animal();
		obj.addAnimal(ani);
		obj.addAnimal(ani);
		obj.addAnimal(ani);
		Assert.assertEquals(expected, 4);
	}
	
	public void addAnimalTest() throws AssertException{
		Animal expected = new Animal("yellow", "shark", 78, 56);
		Animal obj = new Animal("yellow", "shark", 78, 56);
		Zoo pub = new Zoo(2);
		pub.addAnimal(obj);
		Assert.assertTrue(expected.equals(pub.getAnimals()[0]));
	}
	
	public void getTotalHeightTest() throws AssertException{
		double expected = 72;
		Zoo obj = new Zoo(4);
		Animal ani = new Animal("grey", "t-rex", 30, 32);
		Animal ani1 = new Animal("grey", "raptor", 130, 40);
		obj.addAnimal(ani);
		obj.addAnimal(ani1);
		Assert.assertEquals(expected, obj.getTotalHeight());
	}
	
	public void getAverageWeight1Test() throws AssertException{
		int expected = 80;
		Zoo obj = new Zoo(4);
		Animal ani = new Animal("grey", "t-rex", 30, 32);
		Animal ani1 = new Animal("grey", "raptor", 130, 40);
		obj.addAnimal(ani);
		obj.addAnimal(ani1);
		Assert.assertEquals(expected, obj.getAverageWeight());
	}
	
	public void getAverageWeight2Test() throws AssertException{
		int expected = 20;
		Zoo obj = new Zoo(4);
		Animal ani = new Animal("grey", "t-rex", 30.0, 32);
		Animal ani1 = new Animal("pink", "raptor", 130.0, 40);
		Animal ani2 = new Animal("blue", "turtle", 30.0, 32);
		Animal ani3 = new Animal("blue", "bird", 10.0, 40);
		obj.addAnimal(ani);
		obj.addAnimal(ani1);
		obj.addAnimal(ani2);
		obj.addAnimal(ani3);
		Assert.assertEquals(expected, obj.getAverageWeight("blue"));
	}
	
	public void getAnimalsTest() throws AssertException{
		Animal[] expected = new Animal[4];
		Zoo obj = new Zoo(4);
		Animal ani = new Animal("grey", "t-rex", 30, 32);
		Animal ani1 = new Animal("pink", "raptor", 130, 40);
		Animal ani2 = new Animal("blue", "turtle", 30, 32);
		Animal ani3 = new Animal("blue", "bird", 10, 40);
		obj.addAnimal(ani);
		obj.addAnimal(ani1);
		obj.addAnimal(ani2);
		obj.addAnimal(ani3);
		expected[0] = ani;
		expected[1] = ani1;
		expected[2] = ani2;
		expected[3] = ani3;
		Assert.assertEquals(expected[0], obj.getAnimals()[0]);
		Assert.assertEquals(expected[1], obj.getAnimals()[1]);
		Assert.assertEquals(expected[2], obj.getAnimals()[2]);
		Assert.assertEquals(expected[3], obj.getAnimals()[3]);
	}
	
	public void getCapacityTest() throws AssertException{
		int expected = 6;
		Zoo obj = new Zoo(3);
		Animal ani = new Animal("grey", "t-rex", 30, 32);
		Animal ani1 = new Animal("pink", "raptor", 130, 40);
		Animal ani2 = new Animal("blue", "turtle", 30, 32);
		Animal ani3 = new Animal("blue", "bird", 10, 40);
		obj.addAnimal(ani);
		obj.addAnimal(ani1);
		obj.addAnimal(ani2);
		obj.addAnimal(ani3);
		Assert.assertEquals(expected, obj.getCapacity());
	}
	
	public void toStringTest() throws AssertException{
		Animal ani = new Animal("brown", "monkey", 50, 23);
		String expected = "These animals live in the zoo: \n" + ani.toString();
		Zoo obj = new Zoo(3);
		obj.addAnimal(ani);
		Assert.assertTrue(expected.equals(obj.toString()));
	}
}