<?php
    $n = trim(fgets(STDIN));
    for ($i = 1; $i < 10000; $i++) {
        if ($i % $n == 2) {
            echo "$i\n";
        }
    }
?>