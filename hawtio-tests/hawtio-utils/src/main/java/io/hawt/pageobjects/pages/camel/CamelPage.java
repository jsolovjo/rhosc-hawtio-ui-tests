package io.hawt.pageobjects.pages.camel;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

import org.openqa.selenium.By;

import io.hawt.pageobjects.fragments.camel.CamelTree;
import io.hawt.pageobjects.pages.HawtioPage;

public class CamelPage extends HawtioPage {
	private CamelTree tree;

	public <C> C openTab(String tab, Class<C> c) {
		$(By.xpath("//a[text()='" + tab + "']")).shouldBe(visible).click();
		return page(c);
	}

	public CamelTree tree() {
		return tree;
	}
}
