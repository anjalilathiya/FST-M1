from selenium import webdriver
from selenium.webdriver.common.by import By

# Create an instance of the Firefox webdriver
driver = webdriver.Firefox()

# Open the webpage
driver.get("https://alchemy.hguy.co/lms")

# Find the "My Account" link element using XPath and click on it
driver.find_element(By.XPATH, "//a[contains(text(),'My Account')]").click()

# Check if the title of the page is "My Account – Alchemy LMS"
assert driver.title == "My Account – Alchemy LMS"

# Close the browser
driver.quit()
