from selenium import webdriver
from selenium.webdriver.common.by import By

# Create an instance of the Firefox webdriver
driver = webdriver.Firefox()

# Open the webpage
driver.get("https://alchemy.hguy.co/lms")

# Find the heading element using XPath
heading = driver.find_element(By.XPATH, "//h1[text()=' Learn from Industry Experts ']")

# Check if the heading text is 'Learn from Industry Experts'
if heading.text == "Learn from Industry Experts":
    pass

# Close the browser
driver.quit()
