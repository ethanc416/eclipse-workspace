/**
 * 
 */
function draw() {
	var dom = document.getElementById("myCanvas");
	if (dom.getContext) {
		var context = dom.getContext('2d');
		context.fillRect(100, 100, 200, 200);
		context.beginPath();
		context.arc(200, 200, 100, 0, 2 * Math.PI, false);
		context.stroke();
	}
	}
