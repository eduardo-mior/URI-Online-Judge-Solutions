<?php
    $line = explode(" ", trim(fgets(STDIN)));
    $valor1 = intval($line[0]);
    $valor2 = intval($line[1]);
    $valor3 = intval($line[2]);
    if ($valor1 > $valor2 && $valor1 > $valor3) {
      echo "$valor1 eh o maior\n";
    } else if ($valor2 > $valor3) {
      echo "$valor2 eh o maior\n";
    } else {
      echo "$valor3 eh o maior\n";
    }
?>