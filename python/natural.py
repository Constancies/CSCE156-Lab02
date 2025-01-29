import sys

def sumWithFor(n):
    sum = 0
    for i in range(n + 1):
        sum += i
    return sum

def sumWithWhile(n):
    sum = 0
    i = 0
    while i < n + 1:
        sum += i
        i += 1
    return sum

if __name__ == '__main__':
    if len(sys.argv) != 2:
        sys.stderr.write("Provide n as a command line argument.\n")
        exit()
    n = int(sys.argv[1])
    print(sumWithFor(n))
    print(sumWithWhile(n))
