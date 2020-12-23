package screens;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.ScreenBase;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.testproject.java.sdk.v2.drivers.AndroidDriver;

public class ComposeMessageScreen extends ScreenBase {

	public ComposeMessageScreen(AndroidDriver driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public String expectedDelivered = "Sent";

	@AndroidFindBy(id = "com.verizon.messaging.vzmsgs:id/curRecip")
	private AndroidElement toField;

	@AndroidFindBy(id = "com.verizon.messaging.vzmsgs:id/compose_embedded_text_editor")
	private AndroidElement enterTextField;

	@AndroidFindBy(id = "com.verizon.messaging.vzmsgs:id/composebtnSend")
	private AndroidElement sendMessageButton;

	@AndroidFindBy(id = "com.verizon.messaging.vzmsgs:id/status")
	private AndroidElement validateMessageStatus;

	public void enterToField(String number) {
		toField.sendKeys(number);

	}

	public ComposeMessageScreen enterText(String addText) {
		enterTextField.sendKeys(addText);
		return this;
	}

	public ComposeMessageScreen sendMessage() {
		sendMessageButton.click();
		return this;
	}

	public boolean validateMessageStatus() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		if (wait.until(ExpectedConditions.visibilityOf(validateMessageStatus)).getAttribute("text").equals("Sent")
				|| wait.until(ExpectedConditions.visibilityOf(validateMessageStatus)).getAttribute("text")
						.equals("Sending")
				|| wait.until(ExpectedConditions.visibilityOf(validateMessageStatus)).getAttribute("text")
						.equals("Delivered")) {

			return true;
			
		} else {
//			String actual1 = validateMessageStatus.getText();
//			System.out.println("Actual1 : " + actual1);
//			System.out.println("print status here fail: " + validateMessageStatus.isDisplayed());
			return false;
		}

	}
}
