package myapp


class Foo {

	static hasOne = [bar: Bar]

	String name

	static constraints = {
		bar nullable: true
		name unique: "bar"
	}

}
