# Determining Compound Interest

Simple interest is something you use only when making a  
quick guess. Most investments use a compound interest  
formula, which will be much more accurate. And this formula  
requires you to incorporate exponenets into your programs. 

Write a program to compute the value of an investment  
compounded over time. The program should ask for the  
starting amount, the number of years to invest,  
the interest rate and the number of periods per year to compound.

The formula you'll use for this is 

![equation](http://www.sciweavers.org/tex2img.php?eq=A%20%3D%20P%281%20%2B%20%5Cfrac%7Br%7D%7Bn%7D%20%29%5E%7Bnt%7D%20&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0) 

, where
- *P* is the principal amount.
- *r* is the annual rate of interest.
- *t* is the number of years the amount is invested.
- *n* is the number of times the interest is compounded per year
- *A* is the amount at the end of the investment

**EXAMPLE OUTPUT**  
*What is the principal amount? 1500*  
*What is the rate of interest? 4.3*  
*What is the number of years? 6*  
*What is the number of times the interest is compounded per year? 4*

*€1500 invested at 4.3% for 6 years compounded 4 times per year is €1938.84.*

**CONSTRAINTS**
- Prompt for the rate as a percentage (like 15 not .15)  
 Divide the input by 100 in your program.
- Ensure that fractions of a cent are rounded up to the next penny.
- Ensure that the output is formatted as money.