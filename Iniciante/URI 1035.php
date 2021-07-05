<?php
    $line = explode(" ", trim(fgets(STDIN)));
    $A = intval($line[0]);
    $B = intval($line[1]);
    $C = intval($line[2]);
    $D = intval($line[3]);
    
    if (($B > $C) && ($D > $A) && (($C + $D) > ($A + $B)) && ($C > 0) && ($D > 0) && ($A % 2 == 0)) {
        echo "Valores aceitos\n"; 
    } else {
        echo "Valores nao aceitos\n";
    }
?>