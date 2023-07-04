from selenium import webdriver
from selenium.webdriver.common.by import By
import time

# Create an instance of the Firefox webdriver
driver = webdriver.Firefox()

# Open the webpage
driver.get("https://alchemy.hguy.co/lms")

# Click on the "My Account" link
driver.find_element(By.XPATH, "//a[contains(text(),'My Account')]").click()

# Click on the "Login" link
driver.find_element(By.XPATH, "//a[contains(text(),'Login')]").click()

# Enter the username
driver.find_element(By.XPATH, "//p[@class='login-username']/input").send_keys("root")

# Enter the password
driver.find_element(By.ID, "user_pass").send_keys("pa$$w0rd")

# Click on the login button
driver.find_element(By.ID, "wp-submit").click()

# Wait for the page to load
time.sleep(3)

# Click on the "All Courses" link
driver.find_element(By.XPATH, "//a[contains(text(),'All Courses')]").click()

# Click on the course link by finding the sibling elements
driver.find_element(By.XPATH, "//h3[contains(text(),'Email Marketing Strategies')]/following-sibling::p[2]/a[@href='https://alchemy.hguy.co/lms/courses/email-marketing-strategies/']").click()

# Click on the first item in the course
driver.find_element(By.XPATH, "//div[@id='ld-item-list-71']/div[1]/div/a/div[1]").click()

# Check if the title is "Deliverability Of Your Emails – Alchemy LMS"
assert driver.title == "Deliverability Of Your Emails – Alchemy LMS"

# Go back to the course
driver.find_element(By.XPATH, "//a[contains(text(), 'Back to Course')]/parent::div/div[2]/form/input[4]").click()

# Close the browser
driver.quit()
