def calculate_sum(n):
    if n <= 1:
        return 1
    else:
        return n + calculate_sum(n - 1)

num1 = int(input("Enter a number"))
print(calculate_sum(num1))