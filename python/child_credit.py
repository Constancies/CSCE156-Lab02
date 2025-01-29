

from child import Child

def produceReport(children):
    credit_values = list()
    bonus_given = False

    for i in children:
        if i.age < 18 and bonus_given == False:
            credit_values.append(1000.00)
            bonus_given = True
        elif i.age < 18:
            credit_values.append(500.00)
        else:
            credit_values.append(0.00)

    total_credit = 0
    for i in range(len(credit_values)):
        total_credit += credit_values[i]

    report = "Child          Amount   "
    for i in range(len(children)):
        report += f"\n{children[i]}   $ {credit_values[i]}"
    report += f"\nTotal Credit:    $ {total_credit}"
    print(report)
    return total_credit
    

def main():

    tom = Child("Tommy", 14)
    dick = Child("Richard", 12)
    harry = Child("Harold", 21)

    children = [tom, dick, harry]

    # TODO: call your function here
    produceReport(children)

if __name__ == "__main__":
    main()
