"""

Write a program which can compute the factorial of a given numbers.
The results should be printed in a comma-separated sequence
on a single line.

"""

def factorial(n):
    if n == 0:
        return 1
    return n*factorial(n-1)

def factorial_usingloop(n):
    product = 1
    for i in range(1, n+1):
        product *= i
    return product

# kiểm tra
test = [1, 3, 5, 7, 8, 12]

for i in test:
    print(factorial_usingloop(i), "-", factorial(i))

