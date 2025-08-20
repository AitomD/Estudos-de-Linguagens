<?php


class ContaBancaria {
    private string $titular;
    private float $saldo;

    public function __construct(string $titular, float $saldo){
        
        $this->titular = $titular;
        $this->saldo = $saldo;
    }

    public function depositar($dinheiro){
        if($dinheiro >= 0){
            $this->saldo += $dinheiro;
        }
        else{
            echo "Esse não é um valor válido para deposito\n";
        }
    }

    public function sacar($dinheiro){
        if($dinheiro <= $this->saldo){
            $this->saldo -= $dinheiro;
            echo "Você sacou R$ {$dinheiro}\n";
        }
        else{
            echo "Saldo insuficiente\n";
        }
    }

    public function getSaldo(){
        return $this->saldo;
    }
}

$conta = new ContaBancaria('Aitom', 3200);
echo "\n";
echo $conta->getSaldo();
echo "\n";
$conta->depositar(142);
echo "\n";
$conta->sacar(3400);
echo "\n";
$conta->sacar(500);
echo "\n";
echo $conta->getSaldo();

?>