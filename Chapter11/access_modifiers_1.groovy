package demo01

import groovy.transform.PackageScope

class PackageScopeDemo {
    @PackageScope void test1() {
        // Code...
        println("test1 runs...")
    }
}
def d = new PackageScopeDemo()
d.test1()