# Filtering Records

Sorting records is helpfuk, but sometimes you need to filter down the results sto find or display only hwat you're looking for.

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

Create a program that lets a user locate all records that maych the search string by comparing the search string to the first or last name field.

**Example Output**
<pre>
Enter a search string:  Jac

Results:
Name                | Position          | Separation date
--------------------|-------------------|-----------------
Jacquelyn Jackson   | DBA               |
Jake Jacobson       | Programmer        |
</pre>

**Constaints**
- Implement the data using a an array of maps or an associative array.