<?php
    $raio = trim(fgets(STDIN));
    $area = 3.14159 * ($raio * $raio);
    $area = number_format($area, 4, ".", "");
    echo "A=$area\n";
?>