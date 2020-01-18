var btn = document.getElementById("hello");
var change = false;
var numberOfChanges = 0;

var addThisClass = "odd";
var removeThisClass = "even";

function handleCSSChange(a,b) {
		a = "odd";
		b = "even";
	if(!change) {
		a = "even";
		b = "odd";
	}
	return [a,b];
}

btn.addEventListener("click", (event) => {
	event.preventDefault();

	const code = document.querySelector(".code-here");
	var tag = change ? "<h2>Here we go!</h2>" : "<h2>Go go go</h2>";
	code.innerHTML = tag;
	numberOfChanges++;
	
	var buttonName = "Clicks: " + numberOfChanges;
	btn.innerHTML = buttonName;
	
	[addThisClass, removeThisClass] = handleCSSChange(addThisClass, removeThisClass);
	code.classList.add(addThisClass);
	code.classList.remove(removeThisClass);
	
	change = change ? false : true;
});
