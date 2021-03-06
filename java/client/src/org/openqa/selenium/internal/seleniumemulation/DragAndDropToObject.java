/*
Copyright 2007-2009 Selenium committers

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

package org.openqa.selenium.internal.seleniumemulation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropToObject extends SeleneseCommand<Void> {
  private final ElementFinder finder;

  public DragAndDropToObject(ElementFinder finder) {
    this.finder = finder;
  }

  @Override
  protected Void handleSeleneseCommand(WebDriver driver, String locatorFrom, String locatorTo) {
    WebElement elementFrom = finder.findElement(driver, locatorFrom);
    WebElement elementTo = finder.findElement(driver, locatorTo);
    new Actions(driver).dragAndDrop(elementFrom, elementTo).perform();

    return null;
  }
}
