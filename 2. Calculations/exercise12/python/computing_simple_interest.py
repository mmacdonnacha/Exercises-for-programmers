# Exercise 12 - Computing Simple Interest

# Get input from user
principal = input('Enter the principal: ')
rate_of_interest = input('Enter the rate of interest: ')
years = input('Enter the number of years: ')

# Convert input to correct type
principal = int(principal)
rate_of_interest = float(rate_of_interest)
years = int(years)

# Perform Calculations
amount = principal * (1 + (rate_of_interest / 100) * years)

# Format output
output_text = f'After {years} years at {rate_of_interest}%, the investment' \
              f' will be worth €{amount:.2f}'

print(output_text)
