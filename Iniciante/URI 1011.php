<?php
    const pi = 3.14159;
    $raio = trim(fgets(STDIN));
    $volume = (4.0 / 3.0) * pi * pow($raio, 3.0);
    $volume = number_format($volume, 3, ".", "");
    echo "VOLUME = $volume\n";
?>