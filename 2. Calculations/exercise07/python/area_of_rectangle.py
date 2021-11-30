# Exercise 07 - Area of a Rectangle

# Get input from user
length = input('What is the length of the room in feet? ')
width = input('What is the width of the room in feet? ')

# Convert input from string to integer
length = int(length)
width = int(width)

# Perform Calculations
area_in_feet = length * width
# Conversion formula -> m^2 = f^2 * 0.09290304
area_in_meters = round((area_in_feet * 0.09290304), 3)


# Format output
output_text = f'You entered dimensions of {length} feet by {width} feet.' \
              f'The area is\n' \
              f'{area_in_feet} square feet\n' \
              f'{area_in_meters} square meters'

print(output_text)
