public class EquipmentTest{
	
	public void TestingEquipment() throws AssertException{
		Equipment obj = new Equipment("John/5,346,23,Had a fun ride");
		Equipment expected = new Equipment("John/5,346,23,Had a fun ride");
		Assert.assertTrue("John".equals(obj.getName()));
	    Assert.assertEquals(5, obj.getCount());
	    Assert.assertEquals(346, obj.getTotalWeight());
	    Assert.assertEquals(23, obj.getTotalPrice());
	    Assert.assertEquals("Had a fun ride", obj.getDescription());
	}
		
	public void getNameTest() throws AssertException{
		Equipment obj = new Equipment("David/5,346,23,Had a fun ride");
		Assert.assertTrue("David".equals(obj.getName()));
	}
	
	public void getCountTest() throws AssertException{
		Equipment obj = new Equipment("John/10,346,23,Had a fun ride");
		Assert.assertEquals(10, obj.getCount());
	}
	
	public void getTotalWeightTest() throws AssertException{
		Equipment obj = new Equipment("John/5,346,23,Had a fun ride");
		Assert.assertEquals(346, obj.getTotalWeight());
	}
	
	public void getTotalPriceTest() throws AssertException{
		Equipment obj = new Equipment("John/5,346,45,Had a fun ride");
		Assert.assertEquals(45, obj.getTotalPrice());
	}
	
	public void getDescriptionTest() throws AssertException{
		Equipment obj = new Equipment("John/5,346,23,Had a fun ride");
		Assert.assertTrue("Had a fun ride".equals(obj.getDescription()));
	}
	
	public void equalsTest() throws AssertException{
		Equipment obj = new Equipment("John/5,346,23,Had a fun ride");
		Equipment obj1 = new Equipment("John/5,346,23,Had a fun ride");
		Assert.assertEquals(!(obj.equals(obj1)), false);
		
	}
}