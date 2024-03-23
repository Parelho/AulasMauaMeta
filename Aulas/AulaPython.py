# Varíaveis / falar sobre tipagem estatica e dinamica
inteiro = 50
floating = 5.3
char = 't'
string = 'hello'
bool = True
# Casting
x = str(3) # x = "3"
y = int(3) # y = 3
z = float(3) # z = 3.0
print(type(x))
print(type(y))
print(type(z))


x, y = 7, 2
print(x+y)
print(x-y)
print(x*y)
print(x/y)
print(x%y) # Resto da divisão, mencionar que é usado para descobrir se um valor é par ou impár
print(x**y)
print(x//y)
# Mencionar operadores como +=,-=,*= etc para substituir x = x + y


# Operadores lógicos
# Primeiro ensinar condições para o if
print(3==4)
print(3!=4)
print(3>4)
print(3<4)
print(4>=4)
print(4<=4)

num1 = 3
num2 = 4
if num1 > num2:
    print(f"{num1} é maior do que {num2}")
elif num1 < num2:
    print(f"{num1} não é maior do que {num2}")
else:
    print(f"Os números são iguais")

if not(num1 > num2): # Explicar que o if apenas vê se uma operação é V ou F, então podemos usar o not para buscar um resultado falso
    print(f"{num1} não é maior do que {num2}")

num1, num2 = 8, 20
if num1 < 10 and num2 > 10:
    print("Condição verdadeira")
else:
    print("Condição falsa")
if num1 > 10 or num2 < 20:
    print("Condição verdadeira")
else:
    print("Condição falsa")



# Inputs
input_string = str(input("Digite uma frase: ")) #Ou somente input("Digite uma frase: ")
print(input_string)
input_num = int(input("Digite um número: "))
print(input_num)
input_float = float(input("Digite um número não inteiro: ")) # Mostrar que mesmo o numero sendo inteiro o resultado tem uma casa após a virgula Ex: 10 fica 10.0 se for type float
print(input_float)


# Imports e Loops
import random as r

for i in range(10):
    print(r.randint(1, 20)) #1 = valor mínimo, 20 = valor limite

pode_parar = False
parar_count = 0
while not pode_parar:
    print(":(")
    parar_count += 1
    if parar_count > 5:
        pode_parar= True
        print(":)")
# Deixar nested loops para aula de POO


# Listas
lista = [5, 3, 4, 9, 3, 7]
print(lista)
print(lista[0])
print(len(lista))

lista.append(10)
print(lista)
print(lista.index(3)) # Retorna a pos do primeiro valor = 3
lista.insert(2, 10) # Insere o numero 10 na pos 2
print(lista)
lista.pop(3) # Remove o valor na pos 3
print(lista)
lista.remove(5) # Remove o primeiro valor = 5
print(lista)
lista.reverse()
print(lista)
lista.sort()
print(lista)
lista.clear()
print(lista)


# Funções basicas, aprofundar na aula de POO

def printar_lista(lista):
    for i in range(0, len(lista)): # Em linguagens baseadas em C, teria que usar len(lista)-1 para não ter um OutOfBounds exception, mas em python o ultimo valor do range não é incluso no valor de i ao final do loop, assim tirando a nescessidade de usar o -1
        print(lista[i])

lista_func = [2, 5, 6, 7]
printar_lista(lista_func)


def somar(num1, num2):
    resultado = num1 + num2
    
    return resultado

print(somar(3,7))