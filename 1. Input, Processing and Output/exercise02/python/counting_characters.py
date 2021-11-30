# Exercise 02 - Counting Characters

# Get input from the user
input_text = input('What is the input string? ')

# Perform calculations
count = len(input_text)
character = 'character' if count == 1 else 'characters'

# Format output
output_text = input_text + ' has ' + str(count) + ' ' + character + '.'

print(output_text)
