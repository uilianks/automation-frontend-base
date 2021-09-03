package pages;

import elements.TestElements;

public class TestPage {
    TestElements testElements = new TestElements();

    public void logStep(){
        System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName());
    }

    public boolean accessGoogle() {
        logStep();
        try {
            testElements.initializeTest();
        }catch (Exception e){
            System.out.println("Fail");
            return false;
        }
        return true;
    }

    public boolean typeInput(String type) {
        logStep();
        try {
            testElements.getTypeInput().sendKeys(type);
            Thread.sleep(1000);
            testElements.getButtonSearch().click();
        }catch (Exception e){
            System.out.println("Fail");
            return false;
        }
        return true;
    }

    public boolean redirectedSearchPage() {
        logStep();
        try {
            testElements.redirectedSearchPage().isDisplayed();
            testElements.closeTest();
        }catch (Exception e){
            System.out.println("Fail");
            return false;
        }
        return true;
    }
}
