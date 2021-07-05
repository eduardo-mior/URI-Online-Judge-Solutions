<?php
    $salario = trim(fgets(STDIN));
    if ($salario >= 0 && $salario <= 2000) {
        echo "Isento\n";
    } else if ($salario > 2000 && $salario <= 3000) {
        $imposto = ($salario - 2000) * 0.08;
        $imposto = number_format($imposto, 2, ".", "");
        echo "R$ $imposto\n";
    } else if ($salario > 3000 && $salario <= 4500) {
        $imposto = (($salario - 3000)  * 0.18) + 80;
        $imposto = number_format($imposto, 2, ".", "");
        echo "R$ $imposto\n";
    } else {
        $imposto = (($salario - 4500) * 0.28) + 350;
        $imposto = number_format($imposto, 2, ".", "");
        echo "R$ $imposto\n";
    }
?>