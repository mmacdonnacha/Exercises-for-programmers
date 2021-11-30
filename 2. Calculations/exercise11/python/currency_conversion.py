# Exercise 11 - Currency Conversion

# import ceiling function to round up numbers
from math import ceil

# Get input from users
euros = input('How many euros are you exchanging? ')
rate = input('What is the exchange rate? ')

# Convert input to correct type
euros = int(euros)
rate = float(rate)

# Perform calculations
dollars = ceil(euros * rate) / 100.0

# Format output
output_text = f'{euros} euros at an exchange rate of {rate}' \
              f' is {dollars} U.S. dollars.'

print(output_text)
