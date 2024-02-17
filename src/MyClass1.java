//import java.awt.Color;
//import java.time.Duration;
//import java.util.List;
//import java.util.Random;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;
//
//public class MyClass1 {
//	WebDriver driver=new ChromeDriver();
//	
//	@BeforeTest
//	public void mySetup ()
//	{
//		
//		driver.get("https://magento.softwaretestingboard.com/");
//	}	
//	@Test(priority=1)
//	public void Test1() throws InterruptedException
//	{
//		// to navigate to the sign up page
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
//		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("shorouq");
//		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("aqrabawi");
//		driver.findElement(By.xpath("//*[@id=\"email_address\"]")).sendKeys("aqrabawishorouq@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Ali123456ali");
//		driver.findElement(By.xpath("//*[@id=\"password-confirmation\"]")).sendKeys("Ali123456ali");
//		driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button/span")).click();
//
//		driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2NyZWF0ZS8%2C/");
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("aqrabawishorouq@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Ali123456ali");
//		driver.findElement(By.xpath("//*[@id=\"send2\"]/span")).click();
//		Thread.sleep(3000);
//	String currentText=driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[1]/span")).getText();
//	boolean Check= currentText.contains("Welcome");
//		SoftAssert myasser=new SoftAssert();
//		myasser.assertEquals(Check, true);
//		myasser.assertAll();
//	}
//
//@Test(priority=2)
//public void test2() throws InterruptedException {
//	Thread.sleep(4000);
//
////driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2NyZWF0ZS8%2C/");
////	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("aqrabawishorouq@gmail.com");
////	driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Ali123456ali");
////	driver.findElement(By.xpath("//*[@id=\"send2\"]/span")).click();
//    String[] ary= {"jaket","t-shirt","jeans for men","jeans for women","pante"};
//     Random rand=new Random();
//   int idex=  rand.nextInt(0,5);
//  WebElement search= driver.findElement(By.xpath("//*[@id=\"search\"]"));
//  search.sendKeys(ary[idex]+Keys.ENTER);
//  String searchResult =driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/h1/span")).getText();
//  System.out.print(searchResult);
//  
// boolean actual= searchResult.contains(ary[idex]);
// SoftAssert myasser=new SoftAssert();
// myasser.assertEquals(actual, true);
// 
// myasser.assertAll();
//	driver.get("https://magento.softwaretestingboard.com/");
//}
//@Test(priority=3)
//	public void test3() throws InterruptedException {
////			driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2NyZWF0ZS8%2C/");
////			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("aqrabawishorouq@gmail.com");
////		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Ali123456ali");
////			driver.findElement(By.xpath("//*[@id=\"send2\"]/span")).click();
//			Thread.sleep(4000);
//			driver.findElement(By.xpath("//*[@id=\"ui-id-3\"]/span")).click();
//		WebElement item=driver.findElement(By.xpath("/html/body/div[2]/div[2]/ul/li[1]/a"));
//			Thread.sleep(4000);
//			
//	        List<WebElement> items=item.findElements(By.className("product-item-link"));
//	String iteems[]= {  "https://magento.softwaretestingboard.com/radiant-tee.html",
//				"https://magento.softwaretestingboard.com/breathe-easy-tank.html",
//				"https://magento.softwaretestingboard.com/argus-all-weather-tank.html",
//				"https://magento.softwaretestingboard.com/hero-hoodie.html",
//				"https://magento.softwaretestingboard.com/fusion-backpack.html"
//	  };
//			for(int i=0;i<5;i++)
//		{
//				driver.get(iteems[i]);
//			
//			Random rand =new Random();
//		if(driver.getCurrentUrl().contains("radiant"))
//		{
//			String sizes[]= {"ioption-label-size-143-item-166",
//					         "option-label-size-143-item-167",
//					         "option-label-size-143-item-168",
//					         "option-label-size-143-item-169 ",
//					        "option-label-size-143-item-170"
//			};
//			WebElement siz=driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[1]"));
//			
//		List<WebElement> size=siz.findElements(By.tagName("div"));
//			int randomsize=rand.nextInt(0,5);
//			size.get(randomsize).click();
//			Thread.sleep(4000);
//
//			String[] colorsssLabels = { "option-label-color-93-item-50", "option-label-color-93-item-56",
//			"option-label-color-93-item-57" };
//			WebElement color=driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[2]"));
//			List<WebElement> coloor=color.findElements(By.className("swatch-attribute"));
//			int randomcolor=rand.nextInt(0,3);
//
//			coloor.get(randomcolor).click();
//					Thread.sleep(5000);
//					driver.findElement(By.xpath("//*[@id=\"qty\"]")).clear();
//		  				Thread.sleep(5000);
//
//	   	  		driver.findElement(By.xpath("//*[@id=\"qty\"]")).sendKeys("3");
//	   	  		driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]/span")).click();
//	  				Thread.sleep(5000);
//
//		
//		}
//		else if (driver.getCurrentUrl().contains("breathe")) {
//			String sizes[]= {"option-label-size-143-item-166",
//			         "option-label-size-143-item-167",
//			         "option-label-size-143-item-168",
//			         "option-label-size-143-item-169",
//			         "option-label-size-143-item-170"
//			       
//	};
//		
//				WebElement siz=driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[1]/div"));
//				List<WebElement>sizs =siz.findElements(By.tagName("div"));
//				int Randomsizs=rand.nextInt(0,5);
//	sizs.get(Randomsizs).click();
//				Thread.sleep(5000);
//				String[] colorsssLabels = { "option-label-color-93-item-57","option-label-color-93-item-59",
//				"option-label-color-93-item-59"};
//				WebElement color=driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[2]"));
//			List<WebElement> colors=color.findElements(By.tagName("div"));
//			int Randomcolor=rand.nextInt(0,3);
//			colors.get(Randomcolor).click();
//			Thread.sleep(5000);
//			
//			driver.findElement(By.xpath("//*[@id=\"qty\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"qty\"]")).sendKeys("3");
//	driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]/span")).click();
//	Thread.sleep(7000);
//		}
//	 if (driver.getCurrentUrl().contains("argus")) {
//			String sizes[]= {"option-label-size-143-item-166",
//					"option-label-size-143-item-167",
//					" option-label-size-143-item-168",
//				"option-label-size-143-item-169",
//				"option-label-size-143-item-170"
//			       
//	};
//		
//		WebElement si=driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[1]"));
//				List<WebElement> sizs=si.findElements(By.tagName("div"));
//				int Randomsizs=rand.nextInt(0,5);
//				sizs.get(Randomsizs).click();
//				Thread.sleep(8000);
//				List<WebElement> Colors = driver.findElements(By.className("color"));
//			int Randomcolor=rand.nextInt(0,1);
//	  			Colors.get(Randomcolor).click();
//				Thread.sleep(8000);
//
//
//
//			driver.findElement(By.xpath("//*[@id=\"qty\"]")).clear();
//			Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id=\"qty\"]")).sendKeys("3");
//		driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]/span")).click();
//	Thread.sleep(5000);
//
//			}
//		else if (driver.getCurrentUrl().contains("hoodie")) {
//			String sizes[]= {"option-label-size-143-item-166",
//					"option-label-size-143-item-167",
//					"option-label-size-143-item-168",
//				"option-label-size-143-item-169",
//				"option-label-size-143-item-170" 
//			       
//	};
//			WebElement siz=driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[1]"));
//			List<WebElement> sizs=siz.findElements(By.tagName("div"));
//			int Randomsizs=rand.nextInt(0,5);
//			sizs.get(Randomsizs).click();
//			Thread.sleep(5000);
//			String[] colorsssLabels = {"option-label-color-93-item-49","option-label-color-93-item-52",
//					"option-label-color-93-item-53"
//					};
//			WebElement colorsDiv = driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[2]/div"));
//			List<WebElement> Colorssss = colorsDiv.findElements(By.tagName("div")); 
//
//		int Randomcolor=rand.nextInt(0,3);
//		Colorssss.get(Randomcolor).click(); 
//		
//
//		Thread.sleep(5000);
//	driver.findElement(By.xpath("//*[@id=\"qty\"]")).clear();
//	Thread.sleep(5000);
//
//	driver.findElement(By.xpath("//*[@id=\"qty\"]")).sendKeys("3");
//
//	driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]/span")).click();
//	Thread.sleep(5000);
//	}
//		
//		else if (driver.getCurrentUrl().contains("fusion")) {
//			
//
//			driver.findElement(By.xpath("//*[@id=\"qty\"]")).clear();
//	        Thread.sleep(5000);
//
//		driver.findElement(By.xpath("//*[@id=\"qty\"]")).sendKeys("5");
//		driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
//			Thread.sleep(5000);
//	driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a")).click();
//			driver.findElement(By.xpath("//*[@id=\"top-cart-btn-checkout\"]")).click();
//		Thread.sleep(5000);
//		
//		driver.findElement(By.xpath("//*[@id=\"opc-sidebar\"]/div[1]")).click();
//		Thread.sleep(5000);
//
//		driver.findElement(By.xpath("//*[@id=\"opc-sidebar\"]/div[1]/div/div[2]/div/ol/li/div/div/div[1]/div[2]/span/span/span"));
//		String FinalPriceAtWebSite = driver
//				.findElement(By.xpath("//*[@id=\"opc-sidebar\"]/div[1]/div/div[2]/div/ol/li/div/div/div[1]/div[2]/span/span/span")).getText();
//		System.out.println(FinalPriceAtWebSite);
//		String updatedFinalPriceAtWebSite = FinalPriceAtWebSite.replace("$", "");
//		double priceAsDouble = Double.parseDouble(updatedFinalPriceAtWebSite);
//		System.out.println(priceAsDouble);
//		}
//	}
//		}
//		@Test(priority=4)
//		public void test4() throws InterruptedException
//	{
////		driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2NyZWF0ZS8%2C/");
////
////			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("aqrabawishorouq@gmail.com");
////		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Ali123456ali");
////				driver.findElement(By.xpath("//*[@id=\"send2\"]/span")).click();
////				Thread.sleep(4000);
//	driver.get("https://magento.softwaretestingboard.com/sales/order/history/");
//	driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tbody/tr/td[6]/a[2]/span")).click();
//
//	driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[3]/div[1]/ul/li[1]/button/span")).click();
//
//	Thread.sleep(3000);
//
//	driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button")).click();
//
//	Thread.sleep(5000);
//	driver.findElement(
//	By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button/span"))
//	.click();
//
//	}
//
//		
//
//
//
//	
//	}