#comment
if 9>2:# indentation confers clode blocks, not curled brackets
    print("woot")
    print("\nwoot")
cancel = False
true=2 # 0 returns false in boolean if statement, 1 and above returns true
if true < 10 and not cancel:
    print('correct') if true == 2 else print('WRONGGG')# ternary statement
elif true > 10:
    print('big number aye')
"""
multi
line
comment
"""
x = 2 # variable typing happens at instntiation, and no variables can have a - nor start with a number
x = "string" # variable types can be changed by new instantiation
x, y, z = 1, "Two", "E" # assigns x, y,and z respectively
print(x, y, z)
"""
DATA TYPES
text type: str (can be casted with "" or '' and if multi line use three double quotes)
numeric type: int, float, complex
sequence type: list, tuple
mapping type: dict
set types: set, frozen set
boolean type: bool
binary type: bytes, bytearray, memoryview
"""
type(x) # what is the type of this variable
a = int(4) # declaring datatype ( called casting, via constructor functions )
a = float(x) # number type-casting

# to make a random number
import random
x = random.randrange(1,101)
print(x)

#pseudo substring method
b='Hello World'
print(b[2:5]) #you can use negative indexing like b[-5:-2]=Wor
print(b[len(b)-9:len(b)-5]) # same as b[-9:-5]

# iterative loops
#FOR loops
for i in range(1,3): #range is a way to select the number of iterations, first digit is inclusive, second is exclusive
    print(i)
else:
    print('finished')
#WHILE loops
i = 0
while i < 5:
    i+=1
    if i == 1:
        continue#can be used to skip actions of an iteration while still completing the iteration
    print(i)
#Collection types
list = [1, 1, 3, 'four']
print(list, type(list), 'This is a list, it is indexed and can be modified.')
set = {2, 4, 2, 5}
print(set, type(set), 'Sets are unindexed lists')
tuple = (1, 3, 5, 6, 9, 0)
print(tuple, type(tuple), 'Tuples are indexed and immutable')

dictionary = {
'brand':'ford',
'model':'ford',
'year':1964
}
print(dictionary, type(dictionary), 'Dictionaries, like sets, are delimited with {} and are unordered. they are key value pairs.')
#getting values
x = dictionary.get('model')
print('get value: x = dictionary.get(\'model\') makes x =', x)
x = dictionary['model']
print('Another way: x = dictionary[\'model\'] does the same thing', x)
#setting values
dictionary['model'] = 1969
print('To change values: dictionary[\'model\'] = 1969', dictionary['model'])

for i in dictionary:
    print(dictionary[i])
else:
    print('went through our dictionary')
for i in dictionary.values():
    print(i)
else:
    print('does the same as previous, just using the .value() method')

if 0 in tuple: #check if this collection contains the value 0
    print('woot, the boot!')

##functions!!##
##return statements work as normal and allows recursion##
##instead of return nill; use pass to null a function##


def my_function (word1, word2):
    print(word1+' are made just like in '+word2+'!')

my_function('Functions', 'Java')
print('functions must be defined before they are called.')

def my_tuple_function(args):
    for i in args:
        print(i)

##Arbitrary arguments allow you tell teh code you do not know the number of arguments
##being submitted. adding a * or ** like so: def function(**args) lets the code
##prepare the input to ba accessed as a tuple(*) or a dictionary(*)

####LAMBDA####
