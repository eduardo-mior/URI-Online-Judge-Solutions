<?php
    $line = explode(" ", trim(fgets(STDIN)));
    $E = floatval($line[0]);
    $D = floatval($line[1]);
    
    if ($E > $D) {
        echo"Eu odeio a professora!\n";
    } else if (($D - $E) >= 3) {
        echo"Muito bem! Apresenta antes do Natal!\n";
    } else if (($E + 2) < 24) {
        echo"Parece o trabalho do meu filho!\nTCC Apresentado!\n";
    } else {
        echo"Parece o trabalho do meu filho!\nFail! Entao eh nataaaaal!\n";
    }
?>