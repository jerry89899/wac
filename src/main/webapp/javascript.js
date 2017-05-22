document.addEventListener("DOMContentLoaded", function(event) {
	setInterval(function() {
		myIntervalFunction();
	}, 5000);
	content = document.getElementById('textarea').value;
});
function myIntervalFunction() {
	if (document.getElementById('textarea').value == content) {
		setInterval(function() {
			myIntervalFunction();
		}, 5000);
	} else {
		content = document.getElementById('textarea').value;
		console.log(document.getElementById('textarea').value);
		setInterval(function() {
			myIntervalFunction();
		}, 5000);
	}

}