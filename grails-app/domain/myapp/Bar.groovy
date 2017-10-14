package myapp


class Bar {

	static belongsTo = [foo: Foo]

	String name

	static constraints = {
		foo nullable: true
	}

}
