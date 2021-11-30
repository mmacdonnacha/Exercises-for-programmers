# Exercise 09 - Paint Calculator

# import ceiling function from math to round up numbers
from math import ceil

# Declare a constant
CONVERSION_RATE = 350

# Get input from user
length = input('What is the length of the room in feet? ')
width = input('What is the width of the room in feet? ')

# Convert input from string to integer
length = int(length)
width = int(width)

# Perform calculations
area = length * width
tinsOfPaint = int(ceil(float(area) / CONVERSION_RATE))

# Format output
output_text = f'\nYou will need to purchase {tinsOfPaint} gallons of paint' \
              f' to cover {area} square feet.'

print(output_text)
