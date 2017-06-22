val productCode = "PC Monitor"
val qty = 2.toString()

val xmlContent = 
<basket>
    <line>
        <product qty={ qty }>{ productCode }</product>
    </line>
</basket>

println(xmlContent)