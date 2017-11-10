/**
 * Exercise 4.9
 */

function e_names(name) {
var names = ["Richard", "Addie", "Rachel", "Murphy", "George", "Jackie"];
var str = names.toString();
document.write("The list of names is: ", str);
document.write("<br />")
document.write("The number of words containing y and ie is: ", str.match(/(y|ie)/g).length);
document.write("<br />")
document.write("<br />")
var names2 = ["Alfred", "Andy", "Sarah", "Archie", "Gregory", "Jenny"];
var str2 = names2.toString();
document.write("Another list of names is: ", str2);
document.write("<br />")
document.write("The number of words containing y and ie is: ", str2.match(/(y|ie)/g).length);
document.write("<br />")
}
e_names(name);