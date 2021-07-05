<?php
    $line = explode(" ", trim(fgets(STDIN)));
    $hInicial = intval($line[0]);
    $hFinal = intval($line[1]);
    
    if ($hInicial > $hFinal) { 
        echo "O JOGO DUROU " . (24 - ($hInicial - $hFinal)) . " HORA(S)\n";
    } else if ($hFinal > $hInicial) {
        echo "O JOGO DUROU " . ($hFinal - $hInicial) . " HORA(S)\n";
    } else {
       echo "O JOGO DUROU 24 HORA(S)\n";
    }
?>