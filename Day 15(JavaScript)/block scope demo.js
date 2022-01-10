(function(){
	var foo = 1; //function scope
	function bar() { 
	{
  	let foo = 10; //local scope w.r.t block
  	console.log("Inside If Block"+foo);
	}
	console.log("Outside the block"+foo); 
} 
  
bar();
console.log("Globally"+foo);
})();
