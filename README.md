# Selenium Complete Guide

This is a practical, example-driven guide to mastering Selenium WebDriver with Java and TestNG. Ideal for automation testers, QA engineers, or developers writing UI automation tests.

If you're not using Maven, make sure to add all JARs from the `lib/` folder to your project's build path.

📄 [Download the full Selenium Complete Guide (PDF)](./Selenium-Complete-Guide.pdf)


# Selenium Complete Guide

This is a practical, example-driven guide to mastering Selenium WebDriver with Java and TestNG. Ideal for automation testers, QA engineers, or developers writing UI automation tests.

---

## 📚 Table of Contents
- [Introduction](#introduction)
- [Setup](#setup)
- [Locators](#locators)
- [XPath & CSS Selectors](#xpath--css-selectors)
- [WebElement](#webelement)
- [Dropdowns](#dropdowns)
- [Waits](#waits)
- [JavaScript Executor](#javascript-executor)
- [Frames](#frames)
- [TestNG](#testng)
- [Assertions](#assertions)
- [Framework Structure](#framework-structure)
- [WebDriverManager](#webdrivermanager)

---

## 🛠️ Introduction
This guide walks you through using Selenium WebDriver for browser automation. It includes Java code examples and TestNG integration for structured testing.

---

## 🔧 Setup
```java
String chromeKey = "webdriver.chrome.driver";
String chromePath = "D:\\PC\\chromedriver-win64\\chromedriver.exe";
System.setProperty(chromeKey, chromePath);
WebDriver driver = new ChromeDriver();
driver.get("https://www.linkedin.com");
```

---

## 🔍 Locators
### XPath
```java
driver.findElement(By.xpath("//input[@id='username']"));
```

### CSS Selector
```java
driver.findElement(By.cssSelector("input[id='username']"));
```

Avoid using compound class names with `By.className`. Use:
```java
driver.findElement(By.cssSelector(".inputtext._55r1._6luy._9npi")).sendKeys("Test@example.com");
```

---

## 📌 XPath & CSS Selectors
### Relative XPath
```java
String xpath = "//*[@name='ss']";
driver.findElement(By.xpath(xpath)).sendKeys("Abu Dhabi");
```

### Absolute XPath
```java
String xpath = "//body/div/div/div/div/div/div/div/div/div/form/div/div/input";
driver.findElement(By.xpath(xpath)).sendKeys("admin@example.com");
```

### XPath `contains()`
```java
String xpath = "//input[contains(@class,'inputtext')]";
driver.findElement(By.xpath(xpath)).sendKeys("Test@example.com");
```

---

## 💡 WebElement
```java
WebElement email = driver.findElement(By.id("email"));
email.sendKeys("emad@example.com");
```
Useful for reuse and cleaner code.

---

## 🔽 Dropdowns
### Static Dropdown
```java
WebElement day = driver.findElement(By.id("day"));
Select select = new Select(day);
select.selectByIndex(5);
select.selectByValue("9");
select.selectByVisibleText("2");
```

### Input Dropdown
```java
WebElement input = driver.findElement(By.name("ss"));
input.sendKeys("Dubai");
```

---

## ⏱️ Waits
### Thread.sleep
```java
Thread.sleep(5000);
```
### Implicit Wait
```java
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
```
### Explicit Wait
```java
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
wait.until(ExpectedConditions.elementToBeClickable(By.id("someId")));
```

---

## ⚙️ JavaScript Executor
```java
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].click();", element);
js.executeScript("arguments[0].scrollIntoView(true);", element);
js.executeScript("alert('Hello World');");
```

---

## 🧩 Frames
```java
driver.switchTo().frame("frameName");
driver.findElement(By.id("insideFrame")).click();
driver.switchTo().defaultContent();
```

---

## ✅ TestNG
### Annotations
```java
@BeforeClass / @AfterClass
@BeforeMethod / @AfterMethod
@Test
@DataProvider
@Parameters
```
### Example Test
```java
@Test
public void titleTest() {
    Assert.assertEquals(driver.getTitle(), "Expected Title");
}
```

### testng.xml Example
```xml
<suite name="MySuite">
  <test name="LoginTests">
    <classes>
      <class name="tests.LoginPageTest"/>
    </classes>
  </test>
</suite>
```

---

## 🧪 Assertions
```java
Assert.assertTrue(condition);
Assert.assertFalse(condition);
Assert.assertEquals(actual, expected);
```

### Soft Assertion
```java
SoftAssert soft = new SoftAssert();
soft.assertEquals(actual, expected);
soft.assertAll();
```

---

## 📁 Framework Structure
```
selenium-complete-guide/
├── src/test/java/
│   ├── base/
│   ├── pages/
│   ├── tests/
│   └── utils/
├── config/
│   ├── config.properties
│   └── testng.xml
├── reports/
├── pom.xml
└── README.md
```

---

## 🔄 WebDriverManager
```xml
<dependency>
  <groupId>io.github.bonigarcia</groupId>
  <artifactId>webdrivermanager</artifactId>
  <version>5.7.0</version>
</dependency>
```
```java
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
```

