package application_Controller;
import application_Model.MyCompassChangeLoginIDModel;
public class MyCompassChangeLoginIDController {
	MyCompassChangeLoginIDModel MyCompassChangeLoginIDModel = new MyCompassChangeLoginIDModel();
	public void enterNewLoginId(String value){
		MyCompassChangeLoginIDModel.newLoginEmail().sendKeys(value);
	}
	public void clickChangeLogIn(){
		MyCompassChangeLoginIDModel.changeLoginIdButton().click();
	}
	public void clickCancel(){
		MyCompassChangeLoginIDModel.cancelButton().click();
	}

}
