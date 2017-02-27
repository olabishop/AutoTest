package com.cucumber.ZProject;

//public class stepDef



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.When;
	import junit.framework.Assert;

	@SuppressWarnings("deprecation")
	public class stepDef {
		public WebDriver driver;
		@Given("^I am on the Home page$")
		public void i_am_on_the_Home_page() throws Throwable {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.navigate().to("http://www.zoopla.co.uk/ ");
	        driver.manage().window().maximize();   
		}

		@Given("^I click To rent link$")
		public void i_click_To_rent_link() throws Throwable {
			 driver.findElement(By.linkText("To rent")).click();
			    driver.findElement(By.id("search-input-location-wrapper")).click();    
		 
		}

		@When("^I enter my choice in the Search field$")
		public void i_enter_my_choice_in_the_Search_field() throws Throwable {
			driver.findElement(By.id("search-input-location")).sendKeys("Portsmouth");
		    
		}

		@When("^I enter Minimum Price$")
		public void i_enter_Minimum_Price() throws Throwable {
			new Select(driver.findElement(By.id("rent_price_min_per_month"))).selectByVisibleText("£500 pcm");
			driver.findElement(By.cssSelector("option[value=\"500\"]")).click();
		    //driver.wait(2000);
		}

		@When("^Ienter maximum price$")
		public void ienter_maximum_price() throws Throwable {
			new Select(driver.findElement(By.id("rent_price_max_per_month"))).selectByVisibleText("£2,000 pcm");
		    driver.findElement(By.cssSelector("#rent_price_max_per_month > option[value=\"2000\"]")).click();
		    //driver.wait(2000);
		}

		@When("^I enter property type$")
		public void i_enter_property_type() throws Throwable {
			 new Select(driver.findElement(By.id("property_type"))).selectByVisibleText("Flats");
			    driver.findElement(By.cssSelector("option[value=\"flats\"]")).click();
			    
			   
		}

		@When("^I click Search Button$")
		public void i_click_Search_Button() throws Throwable {
			driver.findElement(By.id("search-submit")).click();
		    
		
		    
		}
		@When("^I assert that rent properties are display$")
		public void i_assert_that_rent_properties_are_display() throws Throwable {
			
		    Assert.assertEquals(driver.findElement(By.cssSelector("h1")).getText(), "Flats to rent in Portsmouth");
		
		}
		
		@When("^I assert that the default list view is enable$")
		public void i_assert_that_the_default_list_view_is_enable() throws Throwable {
			
			assertTrue(isElementPresent(By.cssSelector("i.icon.icon-location")));
			
	}
	public void assertTrue(Object elementPresent) {
			// TODO Auto-generated method stub
			
		}

	public Object isElementPresent(By cssSelector) {
			// TODO Auto-generated method stub
			return null;

		}

//		@SuppressWarnings("deprecation")
//		@When("^I assert that the grid and map views are disabled$")
//		public void i_assert_that_the_grid_and_map_views_are_disabled() throws Throwable {
//			

		@When("^I click on the grid view and validate the view$")
		public void i_click_on_the_grid_view_and_validate_the_view() throws Throwable {
			@SuppressWarnings("unused")
			String my_pagesource=driver.getPageSource();
			Assert.assertTrue("Flats for Sale in Portsmouth - Buy Apartments in Portsmouth - Zoopla", true);
		}
		   



		@When("^I click on the map view and validate the view$")
		public void i_click_on_the_map_view_and_validate_the_view() throws Throwable {	  
			@SuppressWarnings("unused")
			String my_pagesource=driver.getPageSource();
			Assert.assertTrue("SmartMaps view of Portsmouth flats for sale - Portsmouth flats for sale  - Zoopla", true);
	}
		@When("^I quit the browser$")
		public void i_quit_the_browser() throws Throwable {
		driver.quit(); 
		} 

	}









