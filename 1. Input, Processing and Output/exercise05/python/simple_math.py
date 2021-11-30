# Exercise 05 - Simple Math

# Get input from user
num1_str = input('What is the first number? ')
num2_str = input('What is the second number? ')

# Convert input to integers
num1 = int(num1_str)
num2 = int(num2_str)

# Format output
output_text = f'{num1} + {num2} = {num1 + num2}\n' \
    f'{num1} - {num2} = {num1 - num2}\n' \
    f'{num1} * {num2} = {num1 * num2}\n' \
    f'{num1} / {num2} = {int(num1 / num2)}\n'

# Print output
print(output_text)
