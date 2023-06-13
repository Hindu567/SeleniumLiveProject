package com.banking.testdata;

import org.testng.annotations.DataProvider;

public class TestdataProvider {
	
	@DataProvider(name="testdata")
	public Object[][] testDataProvider()
	{
		return new Object[][] 
		    	{
		            { "Guru99", "India" },
		            { "Krishna", "UK" },
		            { "Bhupesh", "USA" },
		            {"test1", "qa1"}
		        };

}
}
