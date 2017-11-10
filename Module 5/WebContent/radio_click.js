/**
 *  An example of the use of the click event with radio buttons,
 *  registering the event handler by assignment to the button
 *  attributes.
 */

function colorChoice() {

	
	switch (color) {
	case "red":
		alert("Your favorite color must be red.");
		break;
	case "blue":
		alert("Your favorite color must be blue.");
		break;
	case "green":
		alert("Your favorite color must be green.");
		break;
	case "yellow":
		alert("Your favorite color must be yellow.");
		break;
	case "orange":
		alert("Your favorite color must be orange.");
		break;
	default:
		alert("Error in JavaScript function colorChoice");
	break;

	}
}