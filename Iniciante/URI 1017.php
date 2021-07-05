<?php
    $tempo = trim(fgets(STDIN));
    $velocidade = trim(fgets(STDIN));
    $kilometros = $tempo * $velocidade;
    $media = $kilometros / 12;
    $media = number_format($media, 3, ".", "");
    echo "$media\n";
?>