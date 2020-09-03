# Self-Checkout

Working with mulitple inputes and currency can introduce  
some tricky precision issues.

Create a simple self-checkout system. Promtpt for the prices  
and quantities of three items. Calculate the subtotal of the  
items. Then calculate the tax using a tax rate of 5.5%. Print  
out the line items with the quantuty and total, and then print  
out the subtotal, tax amount, and total.

**EXAMPLE OUTPUT**  
*Enter the price of item 1: 25*  
*Enter the quantity of item 1: 2*  
*Enter the price of item 2: 10*  
*Enter the quantity of item 2: 1*  
*Enter the price of item 3: 4*  
*Enter the quantity of item 3: 1*  
*Subtotal: €64.00*  
*Tax: €3.52*  
*Total: €67.52*

**CONSTRAINTS**
- Keep the input, processing and output parts of your program separate. \
 Collect the input, then do the math operations and string building,
 and then print out the output.

- Be sure you explicitly convert input to numerical data
 before doing any calculations