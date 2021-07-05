<?php
    $idadeDias = intval(trim(fgets(STDIN)));
    $anos = intval($idadeDias / 365);
    $idadeDias -= intval($anos * 365);
    $meses = intval($idadeDias / 30);
    $idadeDias -= intval($meses * 30);
    $dias = $idadeDias;
    echo "$anos ano(s)\n";
    echo "$meses mes(es)\n";
    echo "$dias dia(s)\n";
?>