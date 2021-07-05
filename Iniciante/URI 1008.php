<?php
    $funcionarios = trim(fgets(STDIN));
    $horas = trim(fgets(STDIN));
    $valorPorHora = trim(fgets(STDIN));
    $salario = $horas * $valorPorHora;
    $salario = number_format($salario, 2, ".", "");
    echo "NUMBER = $funcionarios\n";
    echo "SALARY = U$ $salario\n";
?>