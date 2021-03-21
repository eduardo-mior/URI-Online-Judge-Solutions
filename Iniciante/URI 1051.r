input = file('stdin', 'r')

salario = as.double(readLines(input, n=1))

if (salario >= 0 && salario <= 2000) {
    write(sprintf("Isento"), '')
} else if (salario > 2000 && salario <= 3000) {
    imposto = (salario - 2000) * 0.08;
    write(sprintf("R$ %.2f", imposto), '')
} else if (salario > 3000 && salario <= 4500) {
    imposto = ((salario - 3000)  * 0.18) + 80;
    write(sprintf("R$ %.2f", imposto), '')
} else {
    imposto = ((salario - 4500) * 0.28) + 350;
    write(sprintf("R$ %.2f", imposto), '')
}