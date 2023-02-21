#playing with count function changing strings to integers and back and f strings 
print("Welcome to the Love Calculator!")
name1 = input("What is your name? \n")
name2 = input("What is their name? \n")
 

name1_low = name1.lower()
name2_low = name2.lower()

name3 = name1_low + name2_low
t = name3.count('t')
r = name3.count('r')
u = name3.count('u')
e = name3.count('e')
l = name3.count('l')
o = name3.count('o')
v = name3.count('v')


love = l + o + v + e
true = t + r + u + e
sum = str(true) + str(love)
sum = int(sum)

if sum > 90 or sum < 10:
    print (f'Your score is {sum}, you go together like coke and mentos.')
elif sum < 50 and sum > 40:
    print(f'Your score is {sum}, you are alright together.')
else:
    print(f'Your score is {sum}.')