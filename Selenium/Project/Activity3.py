from selenium import webdriver
from selenium.webdriver.common.by import By

# Create an instance of the Firefox webdriver
driver = webdriver.Firefox()

# Open the webpage
driver.get("https://alchemy.hguy.co/lms")

# Find the first info box element using XPath
first_info_box = driver.find_element(By.XPATH, "//h3[text()=' Actionable Training ']")

# Check if the text of the first info box is "Actionable Training"
assert first_info_box.text == "Actionable Training"

# Close the browser
driver.quit()
