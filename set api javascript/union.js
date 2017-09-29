let a = [1, 3, 4, 5, 7, 8];
let b = [2, 3, 4, 6, 7, 9];

unionArrays(a, b);

function unionArrays(a, b) {
	let aSize = a.length;
	let bSize = b.length;

	let tempObj = {};

	for (let i = 0; i < aSize; i++) {
		tempObj[a[i]] = a[i];
		// console.log('a: ', tempObj);
	}
	for(let i = 0; i < bSize; i++) {
		tempObj[b[i]] = b[i];
		// console.log('b: ', tempObj);
	}
	console.log(tempObj);
	let unionArray = [];
	for (let value in tempObj) {
		console.log('value: ', value);
		if (tempObj.hasOwnProperty(value)) {
			console.log('Pushed: ', tempObj[value]);
			unionArray.push(tempObj[value]);
		}
	}
	console.log(unionArray);
	return unionArray;
}

