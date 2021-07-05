<?php
    $valor = trim(fgets(STDIN));

    if ($valor >= 0 && $valor <= 25) {
       echo "Intervalo [0,25]\n";
    } else if ($valor > 25 && $valor <= 50) { 
       echo "Intervalo (25,50]\n";
    } else if ($valor > 50 && $valor <= 75) { 
       echo "Intervalo (50,75]\n";
    } else if ($valor > 75 && $valor <= 100) { 
       echo "Intervalo (75,100]\n";
    } else { 
       echo "Fora de intervalo\n";
    }
?>