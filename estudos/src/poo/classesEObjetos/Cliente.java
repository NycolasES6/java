package poo.classesEObjetos;

import poo.heranca.Pessoa;
import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
    public Integer codigo;
    public String nome;
    public String cpf;

    public List<Endereco> enderecos;

    public void adicionaEndereco(Endereco endereco){
        if (endereco == null)
            throw new NullPointerException("Endereco não pode ser nulo");

        if (endereco.cep == null)
            throw new NullPointerException("CEP não pode ser nulo");

        getEnderecos().add(endereco);
    }

    public List<Endereco> getEnderecos(){
        if (enderecos == null){
            enderecos = new ArrayList<Endereco>();
        }
        return enderecos;
    }
}
