package io.hawt.pageobjects.fragments;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

import org.openqa.selenium.By;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

public class Table {
	/**
	 * Get desired cell of table.
	 * The method works with most tables except Attributes table.
	 *
	 * @param headerName variable is used to find desired column
	 * @param value variable is used to find desired row
	 * @return desired cell
	 */
	public SelenideElement getCell(String headerName, String value) {
		final SelenideElement row = getRowByValue(value);
		final int position = getColumnsPosition(headerName);
		return row.$("td:nth-child(" + position + ")");
	}

	/**
	 * Get desired cell of Attributes table.
	 * The method works with Attributes table.
	 *
	 * @param headerName variable is used to find desired column
	 * @param value variable is used to find desired row
	 * @return desired cell
	 */
	public SelenideElement getCellInAttributesTable(String headerName, String value) {
		final SelenideElement row = getRowInAttributesTable(value);
		final int position = getColumnsPosition(headerName);
		return row.$("td:nth-child(" + position + ")");
	}

	/**
	 * Get desired column of table.
	 *
	 * @param headerName variable is used to find desired column
	 * @return desired column
	 */
	public ElementsCollection getColumn(String headerName) {
		final int position = getColumnsPosition(headerName);
		return $$("tbody tr td:nth-child(" + position + ")");
	}

	/**
	 * Get row of Attributes table.
	 * The method works with Attributes table.
	 *
	 * @param attribute variable is used to find desired row
	 * @return desired row
	 */
	public SelenideElement getRowInAttributesTable(String attribute) {
		return $(By.xpath("//*[@title='" + attribute + "']//ancestor::tr")).shouldBe(visible);
	}

	/**
	 * Get row of table.
	 * The method works with most tables except Attributes table.
	 *
	 * @param value variable is used to find desired row
	 * @return desired row
	 */
	public SelenideElement getRowByValue(String value) {
		return $(By.xpath("//*[contains(text(), '" + value + "')]//ancestor::tr")).shouldBe(visible);
	}

	public Table checkFiltered(String filterValue, ElementsCollection elementsToFilter) {
		for (int i = 0; i < elementsToFilter.size(); i++) {
			if (elementsToFilter.get(i).text().toLowerCase().contains(filterValue.toLowerCase())) {
				elementsToFilter.get(i).shouldBe(visible);
			} else {
				elementsToFilter.get(i).shouldNotBe(visible);
			}
		}
		return this;
	}

	/**
	 * Get the column's index (position).
	 *
	 * @param headerName variable is used to find desired column
	 * @return the index (position) of desired column
	 */
	public int getColumnsPosition(String headerName) {
		final SelenideElement th = $(By.xpath("//thead//th[contains(text(), '" + headerName + "')]")).shouldBe(visible);
		return $$(By.xpath("//thead//th")).indexOf(th) + 1;
	}

	public SelenideElement getRowByPosition(int rowPosition) {
		return $(By.xpath(".//tbody/tr[" + rowPosition + "]"));
	}

	public SelenideElement getCellInRow(String headerName, int rowPosition) {
		final SelenideElement row = getRowByPosition(rowPosition);
		final int position = getColumnsPosition(headerName);
		return row.$(By.xpath(".//td[" + position + "]"));
	}
}
