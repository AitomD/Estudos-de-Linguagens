<?php

class Produto{
    private $nome;
    private $preco;

    public function setNome($nome){
        $this->nome = $nome;
    }

    public function getNome(){
        return $this->nome;
    }
    public function setPreco($preco){
        if($preco >= 0){
            $this->preco = $preco;
        }
        else{
            echo "Preço invalido,necessario ser maior que zero";
        }
    }
    public function getPreco($preco){
        $this->preco = $preco;
    }
}



?>