let a = [1, 3, 4, 5, 7, 8];
let b = [2, 3, 4, 6, 7, 9];

unionArrays(a, b);

function unionArrays(a, b) {
	let aSize = a.length;
	let bSize = b.length;

	let tempObj = {};

	// Loop two arrays and insert to tempObj
	// Overwrite index key if already there. 
	for (let i = 0; i < aSize; i++) {
		tempObj[a[i]] = a[i];
		// console.log('a: ', tempObj);
	}
	for(let i = 0; i < bSize; i++) {
		tempObj[b[i]] = b[i];
		// console.log('b: ', tempObj);
	}

	let unionArray = [];

	// Loop tempObj and insert each value to unionArray.
	for (let value in tempObj) {

		if (tempObj.hasOwnProperty(value)) {
			unionArray.push(tempObj[value]);
		}
	}

	// Return union array
	return unionArray;
}

