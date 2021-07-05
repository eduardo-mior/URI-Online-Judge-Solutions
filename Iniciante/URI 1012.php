<?php
    $line = explode(" ", trim(fgets(STDIN)));
    $a = floatval($line[0]);
    $b = floatval($line[1]);
    $c = floatval($line[2]);

    $triangulo = $a * $c / 2.0;
    $circulo = 3.14159 * ($c * $c);
    $trapezio = (($a + $b) * $c) / 2.0;
    $quadrado = $b * $b;
    $retangulo = $a * $b;

    $triangulo = number_format($triangulo, 3, ".", "");
    $circulo = number_format($circulo, 3, ".", "");
    $trapezio = number_format($trapezio, 3, ".", "");
    $quadrado = number_format($quadrado, 3, ".", "");
    $retangulo = number_format($retangulo, 3, ".", "");

    echo "TRIANGULO: $triangulo\n";
    echo "CIRCULO: $circulo\n";
    echo "TRAPEZIO: $trapezio\n";
    echo "QUADRADO: $quadrado\n";
    echo "RETANGULO: $retangulo\n";
?>