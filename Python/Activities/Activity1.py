import datetime

def calculate_year_of_100(age):
    current_year = datetime.datetime.now().year
    years_left = 100 - age
    year_of_100 = current_year + years_left
    return year_of_100

name = input("What is your name: ")
age = int(input("Enter your age: "))

year_of_100 = calculate_year_of_100(age)
message = "Hello, " + name + "! You will turn 100 years old in the year " + str(year_of_100) + "."
print(message)