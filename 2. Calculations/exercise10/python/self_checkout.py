# Exercise 10 - Self Checkout

# Declare constant
TAX_RATE = 5.5

# Get input from user and convert to relevant type
item1 = input('Enter the price of item 1: ')
qty1 = input('Enter the quantity of item 1: ')

item1 = float(item1)
qty1 = int(qty1)

item2 = input('Enter the price of item 2: ')
qty2 = input('Enter the quantity of item 2: ')

item2 = float(item2)
qty2 = int(qty2)

item3 = input('Enter the price of item 3: ')
qty3 = input('Enter the quantity of item 3: ')

item3 = float(item3)
qty3 = int(qty3)


# Perform calculations
subtotal = (item1 * qty1) + (item2 * qty2) + (item3 * qty3)
tax = subtotal * TAX_RATE / 100.0
total = subtotal + tax


# Generate output text
output_text = f'Subtotal: €{subtotal:.2f}\n' \
              f'Subtotal: €{tax:.2f}\n' \
              f'Subtotal: €{total:.2f}\n'

print(output_text)
