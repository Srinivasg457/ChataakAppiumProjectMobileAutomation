package stepdefinations;

import appTest.AppTest;
import io.cucumber.java.en.*;

import java.net.MalformedURLException;

public class chataaklaunchApp extends AppTest {

    AppTest test = new AppTest();

    @Given("uer navigates to chataak application")
    public void uer_navigates_to_chataak_application() throws MalformedURLException, InterruptedException {
        test.openmobileapp();
//        test.clearAppCache();
        test.closeApp();
    }

//    @Then("Enter with the mobile number and the otp")
//    public void enter_with_the_mobile_number_and_the_otp() {
//
//    }
//
//    @Then("Performs an Operation to Order an product")
//    public void performs_an_operation_to_order_an_product() {
//
//    }


//        @Given("uer navigates to chataak application")
//        public void uer_navigates_to_chataak_application() {
//            try {
//                ChataakActions.launchApp();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//
//        @Then("Enter with the mobile number and the otp")
//        public void enter_with_the_mobile_number_and_the_otp() {
//            try {
//                ChataakActions.login("8105914136");
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//
//        @Then("Performs an Operation to Order an product")
//        public void performs_an_operation_to_order_an_product() {
//            try {
//                ChataakActions.orderProduct("pre");
//            } catch (Exception e) {
//                e.printStackTrace();
//            } finally {
//                ChataakActions.closeApp();
//            }
//        }


}
