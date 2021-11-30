# Exercise 06 - Retirement Calculator

# import date
from datetime import date

# Get input from user
current_age = input('What is your current age? ')
retirement_age = input('At what age would you like to retire? ')

# Convert input to integer
current_age = int(current_age)
retirement_age = int(retirement_age)

# Perform calculations
current_year = date.today().year
years_until_retirement = retirement_age - current_age
retirement_year = current_year + years_until_retirement

# Format output
output_text = f'You have {years_until_retirement} years left' \
              f' until you can retire.' \
              f'\nIt\'s {current_year}, so you can retire in {retirement_year}.'

# Print output 
print(output_text)
