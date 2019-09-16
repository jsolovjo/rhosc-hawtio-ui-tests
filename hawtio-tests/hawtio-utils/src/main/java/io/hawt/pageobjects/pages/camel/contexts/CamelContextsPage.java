package io.hawt.pageobjects.pages.camel.contexts;

import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;

import io.hawt.pageobjects.fragments.Table;
import io.hawt.pageobjects.pages.camel.CamelPage;

public class CamelContextsPage extends CamelPage {
	private static Table contextsTable = new Table();

	public CamelContextsPage start() {
		if (anyContextSelected()) {
			clickButton("Start");
		}
		return this;
	}

	public CamelContextsPage suspend() {
		if (anyContextSelected()) {
			clickButton("Suspend");
		}
		return this;
	}

	public CamelContextsPage selectContext(String context) {
		if (!isContextSelected(context)) {
			clickCheckButton(context);
		}
		return this;
	}

	public CamelContextsPage deselectContext(String context) {
		if (isContextSelected(context)) {
			clickCheckButton(context);
		}
		return this;
	}

	private void clickCheckButton(String context) {
		contextsTable.getRowByValue(context).$(By.xpath("./td[1]/input")).click();
	}

	private Boolean anyContextSelected() {
		return ($(By.xpath("//input[contains(@value, 'item.selected') and contains(@class, 'ng-not-empty')]")).exists());
	}

	public boolean isContextSelected(String context) {
		return contextsTable.getRowByValue(context).$(By.xpath("./td[1]/input")).getAttribute("class").contains("not-empty");
	}
}
