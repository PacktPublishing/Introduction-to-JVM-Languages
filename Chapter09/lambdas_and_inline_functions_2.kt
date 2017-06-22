inline fun shutdown(logger: (m: String) -> Unit) {
	logger("The server is about to shutdown. There's no way back.")
	println("Code to shutdown the application here...")
}

shutdown({ msg: String -> println("Logged message: '$msg'") })

