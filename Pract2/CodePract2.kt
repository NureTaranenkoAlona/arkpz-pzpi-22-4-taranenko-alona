//Код до рефакторингу:

fun calculateDiscount(totalAmount: Int): Int {
    return if (totalAmount < 100) {
        (totalAmount * 0.05).toInt()
    } else if (totalAmount in 100..500) {
        (totalAmount * 0.10).toInt()
    } else {
        (totalAmount * 0.15).toInt()
    }
}
//Оптимізований код:

fun calculateDiscount(totalAmount: Int): Int {
    val discountRate = when {
        totalAmount < 100 -> 0.05
        totalAmount <= 500 -> 0.10
        else -> 0.15
    }
    return (totalAmount * discountRate).toInt()
}

//Код до рефакторингу:

open class Car {
    open fun getDetails(): String {
        return "Car details"
    }
}

class Sedan : Car() {
    override fun getDetails(): String {
        return "Sedan details"
    }
}

class SUV : Car() {
    override fun getDetails(): String {
        return "SUV details"
    }
}
//Оптимізований код:

open class Car {
    open fun getDetails(): String {
        return "${this::class.simpleName} details"
    }
}

class Sedan : Car()
class SUV : Car()


//Код до рефакторингу:

class Order(var customer: Customer)

class Customer(val name: String)

fun main() {
    val order = Order(Customer("John Doe"))
    println(order.customer.name)
}
//Оптимізований код:

class Order(private val customer: Customer) {
    fun getCustomerName(): String {
        return customer.name
    }
}

class Customer(val name: String)

fun main() {
    val order = Order(Customer("John Doe"))
    println(order.getCustomerName())
}
