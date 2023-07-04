from selenium import webdriver
from selenium.webdriver.common.by import By

# Create an instance of the Firefox webdriver
driver = webdriver.Firefox()

# Open the webpage
driver.get("https://alchemy.hguy.co/lms")

# Click on the "All Courses" link
driver.find_element(By.XPATH, "//a[contains(text(),'All Courses')]").click()

# Find all elements with class name "col-sm-8"
elements = driver.find_elements(By.CLASS_NAME, "col-sm-8")

# Get the count of elements
count = len(elements)

# Print the number of courses
print("Number of courses:", count)

# Close the browser
driver.quit()
