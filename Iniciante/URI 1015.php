<?php
    $line1 = explode(" ", trim(fgets(STDIN)));
    $x1 = floatval($line1[0]);
    $y1 = floatval($line1[1]);

    $line2 = explode(" ", trim(fgets(STDIN)));
    $x2 = floatval($line2[0]);
    $y2 = floatval($line2[1]);

    $distancia = sqrt(pow(($x2 - $x1), 2.0) + pow(($y2 - $y1), 2.0));
    $distancia = number_format($distancia, 4, ".", "");
    echo $distancia . "\n";
?>