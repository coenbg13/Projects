#a simple tip calculator. nice to have on a date!
def calc_tip(amount, people, percent_tip):
    percent_tip = percent_tip / 100
    split_bill = amount / people
    total_per_person = split_bill + (split_bill * percent_tip) 
    round(total_per_person, 2)
    return total_per_person


print('Welcome to the tip calculator!')
amount = float(input('What was the total bill? $'))
percent_tip = int(input('What tip would you like to give? 10, 12, or 15? '))
people = int(input('How many people to split the bill? '))
print(f'Each person should pay ${calc_tip(amount, people, percent_tip)}')

