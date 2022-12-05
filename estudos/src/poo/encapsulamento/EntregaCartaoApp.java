package poo.encapsulamento;

import poo.classesEObjetos.Cliente;
import poo.classesEObjetos.Endereco;

import java.util.ArrayList;

public class EntregaCartaoApp {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();

        endereco.cep = "000000";

        Cliente cliente = new Cliente();

        cliente.adicionaEndereco(endereco);
        System.out.println("Endereco adicionado");
    }
}
