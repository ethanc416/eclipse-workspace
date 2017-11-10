/**
 * Exercise 4.6
 */

var textline = prompt("Enter a line of text:", "");
document.write("You entered: ", textline, "<br/>");
var alphline = textline.split(/\s+/).sort().join(' , ');
document.write("The line you entered in alphabetical order: ", alphline);

