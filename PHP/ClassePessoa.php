<?php

class Pessoa{
    public $nome;
    public $idade;

    public function __construct($nome,$idade) {
        $this->nome = $nome;
        $this->idade = $idade;
    }

    public function Apresentar(){
        return "Meu nome é {$this->nome} e eu tenho {$this->idade} anos";
    }
}
$pessoa1 = new Pessoa('Aitom', 22);

echo $pessoa1->Apresentar();
?>
