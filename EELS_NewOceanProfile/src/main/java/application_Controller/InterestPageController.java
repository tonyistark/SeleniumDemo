package application_Controller;

import application_Model.InterestPageModel;
public class InterestPageController {
	
	InterestPageModel InterestPageModel = new InterestPageModel();
	
	public void clickPrincessLogo()
	{
		InterestPageModel.princessLogoButton().click();
	}
	
	public void clickRelaxation(){
		
		   if (InterestPageModel.relaxation().getAttribute("data-is-selected")!=null)
           {
			   InterestPageModel.relaxation().click();
			   InterestPageModel.relaxation().click();
                           System.out.println("Selected again");
           }
           else
           {
        	   InterestPageModel.relaxation().click();
           }
	}
	
	public void clickFitness(){
		  if (InterestPageModel.fitness().getAttribute("data-is-selected")!=null)
          {
			   InterestPageModel.fitness().click();
			   InterestPageModel.fitness().click();
                          System.out.println("Selected again");
          }
          else
          {
       	   InterestPageModel.fitness().click();
          }
	}
	
	public void clickCulture(){
		  if (InterestPageModel.culture().getAttribute("data-is-selected")!=null)
        {
			   InterestPageModel.culture().click();
			   InterestPageModel.culture().click();
                        System.out.println("Selected again");
        }
        else
        {
     	   InterestPageModel.culture().click();
        }
	}

	public void clickDoneButton(){
		InterestPageModel.doneButton().click();
		
	}
	
	public void clickHamburgerButton(){
		InterestPageModel.hamburgerButton().click();
		
	}
	public String relaxationSelected(){
	return	InterestPageModel.relaxation().getAttribute("data-is-selected");
		
	}
	
	
	
}
