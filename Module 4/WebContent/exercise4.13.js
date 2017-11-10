/**
 * 
 */
var sum = 0;
for( var i = 0; i < elmt.length; i++ ){
    sum += parseInt( elmt[i], 10 ); //don't forget to add the base
}

var avg = sum/elmt.length;

document.write( "The sum of all the elements is: " + sum + " The average is: " + avg );