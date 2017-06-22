def xmlContent = new StringWriter()
def xmlWriter = new groovy.xml.MarkupBuilder(xmlContent)

xmlWriter.items {    
    item(id: 1) {
        name("Item one")
    }

    item(id: 2) {
        name("Item two")
    }
}

println(xmlContent)