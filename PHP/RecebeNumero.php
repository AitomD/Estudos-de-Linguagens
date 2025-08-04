<?php

$num1 = (float) readline ('Digite um numero: ');
$num2 = (float) readline ('Digite outro numero: ');
$op = (float)readline ('Qual operação deseja realizar? 1-soma, 2-subtrair, 3-multiplicar, 4-dividir');

switch($op){
    case 1:
        echo "A soma é " . ($num1 + $num2) . "\n";
        break;

    case 2:
        echo "A subtração é ". ($num1 - $num2) . "\n";
        break;

    case 3:
        echo "A multiplicação foi:". ($num1 * $num2) . "\n";
        break;

    case 4:
        echo "A divisão foi: ". ($num1 / $num2) . "\n";
        break;
}
?>