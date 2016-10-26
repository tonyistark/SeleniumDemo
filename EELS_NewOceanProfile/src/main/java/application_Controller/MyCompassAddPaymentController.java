package application_Controller;
import application_Model.MyCompassAddPaymentModel;
public class MyCompassAddPaymentController {
	MyCompassAddPaymentModel MyCompassAddPaymentModel = new MyCompassAddPaymentModel();
	public String getTitle(){
		return MyCompassAddPaymentModel.titleAddPayment().getText();
	}
	public void clickCancel(){
		MyCompassAddPaymentModel.buttonCancel();
	}
	public void clickSave(){
		MyCompassAddPaymentModel.buttonSave();
	}
	public void checkCheckBox(){
		if (MyCompassAddPaymentModel.checkBox().isSelected() == false)
		{
			MyCompassAddPaymentModel.checkBox().click();
		}
	}
	public void uncheckCheckBox(){
		if (MyCompassAddPaymentModel.checkBox().isSelected() == true)
		{
			MyCompassAddPaymentModel.checkBox().click();
		}
	}
	public void enterFullName(String value){
		MyCompassAddPaymentModel.fullName().sendKeys(value);
	}
	public void enterCcNumber(String value){
		MyCompassAddPaymentModel.ccNumber().sendKeys(value);
	}


	public void enterAddress(String value){
		MyCompassAddPaymentModel.address().sendKeys(value);
	}

	public void enterAptSuite(String value){
		MyCompassAddPaymentModel.aptSuite().sendKeys(value);
	}

	public void enterCity(String value){
		MyCompassAddPaymentModel.city().sendKeys(value);
	}

	public void enterZipCode(String value){
		MyCompassAddPaymentModel.zipCode().sendKeys(value);
	}
	public void enterState(String value){
		MyCompassAddPaymentModel.month().selectByVisibleText(value);
	}


}
