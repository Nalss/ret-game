num_1 = float(input("Scrivi il 1° numero "))
num_2 = float(input("Scrivi il 2° numero "))
#sì = str(input("Ti serve is 3° numero?"))
#no = str(input("Ti serve is 3° numero?"))
#if sì = True:
#    num_3 = float(input("Scrivi il terzo numero"))

oper = input("Scrivi l'operatore (+,-,x,:,/) ")
try:
    if oper == "+":
        print(num_1 + num_2)
    if oper == "-":
        print(num_1 - num_2)
    if oper == "x":
        print(num_1 * num_2)
    if oper == "/" or ":":
        print(num_1 / num_2)
    if oper != "/" or ":" or "+" or "-":
        print("Ma sei ritardato?")
except:
    if num_2 == 0.0:
        print("Non si può dividere per zero. Assumo il valore 1 per il secondo numero")
        num_2 = 1
        print(num_1 / num_2)
        
