<?php

class Carro{
    public $marca;
    public $modelo;
    public $ano;

    public function __construct($marca, $modelo, $ano) {
        $this->marca = $marca;
        $this->modelo = $modelo;
        $this->ano = $ano;
    }

    public function ligar(){
        echo "\n";
        echo "Carro ligado\n";
    }

    public function desligar(){
        echo "Carro desligado\n";
    }
}
/* Cria o objeto */
$ocarro = new Carro('Chevrolet' , 'Astra', 2003);

/* Faz as variaveis receberem os dados */
echo $ocarro-> marca;
echo "\n";
echo $ocarro-> ano;
echo "\n";
echo $ocarro-> modelo;

/* Chama os metodos */
$ocarro->ligar();
$ocarro->desligar();
?>