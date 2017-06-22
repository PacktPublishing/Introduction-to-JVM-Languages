def s = "this is an ordinary java.lang.String instance";
println(s.class)

def who = "you"
def msg = "Happy birthday to $who"
println(msg)

def who2 = "packtpub"
def msg2 = "Please visit ${who2}.com"
println(msg2)

def javaString = 'This is a Java string, even though it has ${who}'
println(javaString)

def longMsg = """
    Happy birthday
    to ${who} 
"""
println(longMsg)

def longJavaMsg = '''
   Another long
   message
'''
println(longJavaMsg)

def s1 = "hello"
def s2 = 'hello'
println(s1 == s2)