# Currency Conversion

At some point you might have to deal with currency  
exchange rates, and you'll need to ensure your calculations  
are as precise as possible

Write a program that converts currency. Specifically convert  
euros to U.S. dollars. Prompt for the amount of money in  
euros you have and prompt for the current exchange rate  
of the euro. Print out the new amount in U.S. dollars.  
The formula for currency conversion is

![equation](http://www.sciweavers.org/tex2img.php?eq=amount_%7Bto%7D%20%3D%20%20%5Cfrac%7Bamount_%7Bfrom%7D%20%2A%20rate_%7Bfrom%7D%7D%7Brate_%7Bto%7D%7D%20&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)

where
- *Amount to* is the amount in U.S. dollars.
- *Amount from* is the amount in euros.
- *rate from* is the currecnt exchange rate in euros.
- *rate to* is the current exchange rate of the U.S. dollar.

**EXAMPLE OUTPUT**  
*How many euros are you exchanging? 81*  
*What is the exchange rate? 137.51*  
*81 euros at an exchange rate of 137.51 is 111.38 U.S. dollars.*

**CONSTRAINTS**
- Ensure that fractions of a cent are rounded up to the next penny.
- Use a single output statement.