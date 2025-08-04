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

    public function ExibirInformacao(){
        return "O carro é da marca {$this->marca} do modelo {$this->modelo} e do ano {$this->ano}.";
    }
}
?>