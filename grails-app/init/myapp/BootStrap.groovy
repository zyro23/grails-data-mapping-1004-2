package myapp

class BootStrap {

    def init = { servletContext ->
        Face.withNewTransaction {
            //Face face = new Face(nose: new Nose()).save failOnError: true
            //new Monkey(face: face).save failOnError: true
        }

        Foo.withNewTransaction {
            Foo foo = new Foo(name: "foo")
            Bar bar = new Bar(name: "bar")
            foo.bar = bar
            bar.foo = foo
            foo.save failOnError: true
        }
    }
    def destroy = {
    }
}
