comida = ["Pastel", "Cachorro Quente", "Cuscuz", "Lanche Caipira", "Milho Cozido", "Pipoca", "Espetinho de Carne", "Refrigerante", "Água", "Água com Gás", "Bolo de Pote", "Bolo Bombom", "Coxinha de Morango", "Cone", "Cocada", "Espeto de Morango", "Caixa com 4 Brigadeiros", "Bolacha", "Brigadeiro Individual", "Trufas"]
preço = [4.00, 10.00, 10.00, 15.00, 8.00, 2.00, 10.00, 6.00, 3.00, 5.00, 12.00, 9.00, 9.00, 9.00, 9.00, 12.00, 12.00, 12.00, 4.00, 6.00]


# Usei chat gpt para organizar as listas. Porém a lógica não fiz pelo chatgpt.

for i in range(20):
    print(i, comida[i] + ": R$", preço[i])

b = 0 
compras = []
compraspreço =  []
preçototal = 0


while b == 0:
        pergunta = int(input("Qual comida quer? Selecione por código. "))

        compras.append(comida[pergunta])
        compraspreço.append(preço[pergunta])

        desejasair = input("Deseja parar de comprar? s/n ")

        if desejasair == "s":
            b += 1

print("Número de compras: ", len(compras))

print("Compras feitas: \n")
numerosdecompras = len(compras)

for i in range(numerosdecompras):
    print(compras[i] + ": R$", compraspreço[i])
    preçototal += compraspreço[i]
print("\n")

print("Preço total das compras: R$", preçototal)
