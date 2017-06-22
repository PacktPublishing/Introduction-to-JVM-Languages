val productCodes = List[String]("Keyboard", "Mouse")
def lines =
<basket>
    <products> {
        productCodes.map(x => createXMLProduct(x))
    }</products>
</basket>

def createXMLProduct(productCode: String): xml.Elem = {
    <product qty="1">{ productCode }</product>
}

println(lines.toString())