from selenium import webdriver
from selenium.webdriver.common.by import By

# Create an instance of the Firefox webdriver
driver = webdriver.Firefox()

# Open the webpage
driver.get("https://alchemy.hguy.co/lms")

# Click on the "Contact" link
driver.find_element(By.XPATH,"//a[contains(text(),'Contact')]").click()

# Enter the full name
driver.find_element(By.XPATH,"//form/div/div/label[contains(text(),'Full Name')]/following-sibling::input").send_keys("Anjali Lathiya")

# Enter the email
driver.find_element(By.XPATH,"//form/div/div/label[contains(text(),'Email')]/following-sibling::input").send_keys("a@a.com")

# Enter the subject
driver.find_element(By.XPATH,"//form/div/div/label[contains(text(),'Subject')]/following-sibling::input").send_keys("Subject")

# Enter the comment or message
driver.find_element(By.XPATH, "//form/div/div/label[contains(text(),'Comment or Message ')]/following-sibling::textarea").send_keys("Comment or Message")

# Click on the submit button
driver.find_element(By.XPATH, "//button[@type='submit']").click()

# Get the confirmation message and print it
confirmation_message = driver.find_element(By.XPATH, "//div[@id='wpforms-confirmation-8']/p").text
print(confirmation_message)

# Close the browser
driver.quit()
