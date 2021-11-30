# Exercise 13 - Determine Compound Interest

from math import pow

# Get input from user
principal = input('What is the principal amount? ')
rate = input('What is the rate? ')
time = input('What is the number of years? ')
compound = input('What is the number of times the interest is compounded per year? ')

# Convert input to correct type
principal = int(principal)
rate = float(rate)
time = int(time)
compound = int(compound)

# Perform calculations
amount = principal * pow((1 + ((rate/100) / compound)), (compound * time))

# Format output
output_text = f'€{principal} invested at {rate:.2f}% for {time} years' \
              f' compounded {compound} times per year is €{amount:.2f}\n'

print(output_text)
