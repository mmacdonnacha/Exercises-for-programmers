# Exercise 08 - Pizza Party

# Get inputs from user
num_of_people = input('How many people? ')
num_of_pizzas = input('How many pizzas do you have? ')
slices_per_pizza = input('How many slices in a pizza? ')

# Convert inputs from string to integer
num_of_people = int(num_of_people)
num_of_pizzas = int(num_of_pizzas)
slices_per_pizza = int(slices_per_pizza)

# Perform calculations
slices_per_person = int((num_of_pizzas * slices_per_pizza) / num_of_people)
leftover = (num_of_pizzas * slices_per_pizza) % num_of_people

# Format output
output_text = f'{num_of_people} people with {num_of_pizzas} pizzas' \
              f'\nEach person gets {slices_per_person} piece(s) of pizza.' \
              f'\nThere are {leftover} leftover pieces.'

print(output_text)
