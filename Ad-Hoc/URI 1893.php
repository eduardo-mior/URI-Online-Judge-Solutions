<?php
    $line = explode(" ", trim(fgets(STDIN)));
    $inicio = intval($line[0]);
    $final = intval($line[1]);
    
    if ($inicio >= 0 && $final <= 2) {
        echo "nova\n";
    } else if ($final > $inicio && $final <= 96) {
        echo "crescente\n";
    } else if ($inicio >= $final && $final <= 96) {
        echo "minguante\n";
    } else { 
        echo "cheia\n";
    }
?>