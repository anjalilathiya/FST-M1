from selenium import webdriver
from selenium.webdriver.common.by import By

# Create an instance of the Firefox webdriver
driver = webdriver.Firefox()

# Open the webpage
driver.get("https://alchemy.hguy.co/lms")

# Find the course title element using XPath
course_title = driver.find_element(By.XPATH, "//article[@id='post-71']/div[2]/h3").text

# Print the course title
print("Title of the course is:", course_title)

# Check if the course title is "Email Marketing Strategies"
assert course_title == "Email Marketing Strategies"

# Close the browser
driver.quit()
