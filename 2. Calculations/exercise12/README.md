# Computing Simple Interest

Computing simple interest is a great way to quickly figure  
out whether an investment has value. It's also a good way  
to get comfortable with explicity coding the order of  
operations in your programs.

Create a program that computes imsple interest.  
Prompt for the prinicipal amount, the rate as a percentage, the time and  
display the amount accrued (principal + interest).

The formula for simple interest is 

![equation](http://www.sciweavers.org/tex2img.php?eq=A%20%3D%20P%281%20%2B%20rt%29%20&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)

, where
- *P* is the principal amount
- *r* is the annual rate of interest
- *t* is the number of years the amount is invested
- *A* is the amount at the end of investment

**EXAMPLE OUTPUT**  
*Enter the principal: 15000*  
*Enter the rate of interest: 4.3*  
*Enter the number of years: 4*

*After 4 years at 4.3%, the investment will be worth €1758.*

**CONSTRAINTS**
- Prompt for the rate as a percentage (like 15 not .15)  
 Divide the input by 100 in your program.
- Ensure that fractions of a cent are rounded up to the next penny.
- Ensure that the output is formatted as money.