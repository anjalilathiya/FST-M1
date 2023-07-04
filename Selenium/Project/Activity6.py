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

# Find the "Login" link element using XPath and click on it
driver.find_element(By.XPATH, "//a[contains(text(),'Login')]").click()

# Find the username input field using XPath and enter the username
driver.find_element(By.XPATH, "//p[@class='login-username']/input").send_keys("root")

# Find the password input field by ID and enter the password
driver.find_element(By.ID, "user_pass").send_keys("pa$$w0rd")

# Find the login button by ID and click on it
driver.find_element(By.ID, ("wp-submit")).click()

# Check if the "Logout" link is displayed
assert driver.find_element(By.XPATH, ("//a[contains(text(),'Logout')]")).is_displayed()

# Find the "Logout" link element using XPath and click on it
driver.find_element(By.XPATH, ("//a[contains(text(),'Logout')]")).click()

# Close the browser
driver.quit()
