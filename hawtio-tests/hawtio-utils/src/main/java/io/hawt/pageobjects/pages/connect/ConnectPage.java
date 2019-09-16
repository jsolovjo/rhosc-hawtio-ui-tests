package io.hawt.pageobjects.pages.connect;

import static com.codeborne.selenide.Condition.not;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

import org.openqa.selenium.By;

import com.codeborne.selenide.SelenideElement;

import io.hawt.pageobjects.pages.HawtioPage;

public class ConnectPage extends HawtioPage {

	private SelenideElement connectionList = $(By.xpath(".//div[@class='list-group list-view-pf list-view-pf-view ng-scope']"));

	/**
	 * Check, that the given connection name is in the list of connections.
	 *
	 * @param connectionName name of connection for searching
	 * @return Connect page
	 */
	public ConnectPage checkTheConnectionInList(String connectionName) {
		connectionList.$(By.xpath(".//div[contains(text(),'" + connectionName + "')]")).shouldBe(visible);
		return page(ConnectPage.class);
	}

	/**
	 * Check, that the given connection name is not in the list of connections.
	 *
	 * @param connectionName name of connection for searching
	 * @return Connect page
	 */
	public ConnectPage checkTheConnectionIsNotInList(String connectionName) {
		connectionList.$(By.xpath(".//div[contains(text(),'" + connectionName + "')]")).shouldBe(not(visible));
		return page(ConnectPage.class);
	}
}
