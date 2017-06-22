class Customer(val name: String, val country: String?) {
    constructor(name: String) : this(name, null) {
       println("Name: " + name)
	   println("Country: " + country)
    }
}

var c = Customer("Your Name")
