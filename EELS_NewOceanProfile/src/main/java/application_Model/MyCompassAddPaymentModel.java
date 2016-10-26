package application_Model;
import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import constants.IResourceConstant;


public class MyCompassAddPaymentModel {
	
public WebElement titleAddPayment(){
	return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//div[contains(@class,'create-password__header')]"));
}
public WebElement methodCredtDebit(){
	return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//div[contains(@class,'create-password__creditDebit')]"));
}
public WebElement methodApplePay(){
	return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//div[contains(@class,'create-password__applePay')]"));
}
public WebElement methodPaypal(){
	return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//div[contains(@class,'create-password__paypal')]"));
}
public WebElement methodGoogleWallet(){
	return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//div[contains(@class,'create-password__googleWallet')]"));
}
public WebElement fullName(){
	return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//input[contains(@id,'undefined-undefined-FullName')]"));

}
public WebElement ccNumber(){
	return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//input[contains(@id,'undefined-undefined-CreditCardNumber')]"));

}
public WebElement address(){
	return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//input[contains(@id,'undefined-undefined-Address')]"));

}
public WebElement aptSuite(){
	return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//input[contains(@id,'undefined-undefined-AptSuiteoptional')]"));

}
public WebElement city(){
	return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//input[contains(@id,'undefined-undefined-City')]"));

}
public WebElement zipCode(){
	return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//input[contains(@id,'undefined-undefined-Zipcode')]"));

}
public Select month(){
	WebElement selectMonth = IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//div[contains(@id,'undefined-undefined-Month')]"));
	Select dropdown = new Select(selectMonth);
	return dropdown;

}
public Select year(){
	WebElement selectYear = IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//div[contains(@id,'undefined-undefined-Year')]"));
	Select dropdown = new Select(selectYear);
	return dropdown;

}
public Select state(){
	WebElement selectYear = IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//div[contains(@id,'undefined-undefined-State')]"));
	Select dropdown = new Select(selectYear);
	return dropdown;

}
public WebElement checkBox(){
	return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//*[@id='payment-method']/div/div[2]/div[8]/input"));

}
public WebElement checkboxLabel(){
	return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//*[@id='payment-method']/div/div[2]/div[8]/div/label"));

}
public WebElement buttonSave(){
	return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//*[@id='payment-method']/div/div[2]/div[9]/div/button"));

}
public WebElement buttonCancel(){
	return IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//button[contains(@class,'create-password__cancel')]"));

}


}
