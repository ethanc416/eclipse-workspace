/**
 * 
 */

function computeCost() {
	if (document.getElementById("apple").checked) {
		var apple = document.getElementById("apple").value = 0.59
	}
	else {
		var apple = 0
	}
	if (document.getElementById("orange").checked) {
		var orange = document.getElementById("orange").value = 0.49
	}
	else {
		var orange = 0
	}
	if (document.getElementById("banana").checked) {
		var banana = document.getElementById("banana").value = 0.39
	}
	else {
		var banana = 0
	}
document.getElementById("cost").value =
	totalCost = (apple + banana + orange)+((apple + banana + orange)*0.05);
}