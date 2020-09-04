# Guess the Number Game

Write a Guess the Number game that has three levels of difficulty.  
The first level of difficulty would be a number bwteen 1 and 10.  
The second level of difficulty set would be between 1 to 100.  
The third level of difficulty set would be between 1 and 1000.

Prommpt for the difficulty level, and then start the game.  
The computer picks a random number in that range and prompts the  
player to guess that number. Each time the player guesses, the computer  
should give the player a hint as to whether the number is too high or too low.  
The computer should also keep track of the number of guesses.  
Once the player the correct number the computer should present the  
number of guesses and ask if the player would like to play again.

**Example Output**  
*Let's play Guess the Number.*  
*Pick a difficulty level (1, 2 or 3): 1*  
*I have my number. What's your guess? 1*  
*Too low. Guess again: 5*  
*Too high. Guess again: 2*  
*you got it in 3 guesses!*  
*Play again? n*  
*Goodbye!*

**Constraints**
- Don't allow any non-numeric data entry
- During the game, count non-numeric entries as wrong guesses!