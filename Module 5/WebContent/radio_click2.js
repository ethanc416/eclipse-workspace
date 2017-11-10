/**
 * 
 */
function colorChoice(color) {
	
	var dom = document.getElementById("myForm");
	
	for (var index = 0; index < dom.colorButton.length; index++) {
	if (dom.colorButton[index].checked) {
		color = dom.colorButton[index].value;
		break;
		}
	}
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
