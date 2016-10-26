package application_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import constants.IResourceConstant;

public class SetPasswordPageModel {

	// public WebElement createPasswordButton(){
	// return
	// IResourceConstant.CURRENT_BROWSER.findElement(By.xpath("//*[@id="create-password"]/div/div/div[3]/button/div/div/div/span"));
	// }
	public WebElement cancelPasswordChangeButton() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.className("create-password__cancel___JtTI3"));
	}

	public WebElement newPassword() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.id("undefined-undefined-NewPassword-29749"));
	}

	public WebElement confirmNewPassword() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.id("undefined-undefined-ConfirmPassword-25408"));
	}

	public WebElement createPasswordHeader() {
		return IResourceConstant.CURRENT_BROWSER.findElement(By.className("create-password__header___3Bxms"));
	}
}
