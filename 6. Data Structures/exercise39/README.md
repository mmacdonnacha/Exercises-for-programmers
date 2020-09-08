# Sorting Records

When you're looking at results, you'll want to be able to sort them so you can find what you're looking for quickly or do some quick visual comparisons.

Given the following data set

<pre>
<hr><hr>
First Name    Last Name   Position           Separation date
<hr>
John          Johnson     Manager            2016-12-31
Tou           Xiong       Software Engineer  2016-10-05
Michaela      Michaelson  District Manager   2015-21-19
Jake          Jacobson    Programmer
Jacquelyn     Jackson     DBA
Sally         Weber       Web Developer      2015-12-18
<hr><hr>
</pre>

Create a program that sorts all employees by last name and prints them to the screen in a tabular format.

**Example Output**
<pre>
Name                | Position          | Separation date
--------------------|-------------------|-----------------
Jacquelyn Jackson   | DBA               |
Jake Jacobson       | Programmer        |
John Johnson        | Manager           | 2016-12-31
Michaela Michaelson | District Manager  | 2015-21-19
Sally Weber         | Web Developer     | 2015-12-18
Tou Xiong           | Software Engineer | 2016-10-05
</pre>

**Constaints**
- Implement the data using a list of maps.