package io.hawt.pageobjects.pages.jmx;

import static com.codeborne.selenide.Selenide.$;

import io.hawt.pageobjects.pages.HawtioPage;

public class JmxPage extends HawtioPage {
	public JmxPage expandTree() {
		$("i[title='Expand All']").click();
		return this;
	}

	public JmxPage collapseTree() {
		$("i[title='Collapse All']").click();
		return this;
	}
}
