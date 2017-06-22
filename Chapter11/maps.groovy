def map = [ key1: "value1", "key2": "value2" ]

def key1 = "whateverKey"
def otherMap = [ (key1): "whateverValue"]

def emptyMap = [:]

map["key1"] = "anotherValue1"
println map["key1"]

map.key1 = "yetAnotherValue1"
println(map.key1) 

map[30] = "thirty"
println(map.get(30))

map.each({
  println("$it.key --> $it.value")
})

println map.find({ k, v -> k =="key2" && v == "value2" })
