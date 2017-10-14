package myapp


class Nose {

	static belongsTo = [face: Face]

	static constraints = {
		face unique: true
	}

}
