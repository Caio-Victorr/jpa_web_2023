package main;

import dao.PessoaDAO;
import domain.Pessoa;

public class App {
    public static void main(String[] args) {

        try{
            System.out.println("Iniciando Operação");
            var pessoaDAO = new PessoaDAO();
            var pessoa
                    = Pessoa.builder()
                    .nome("Jose")
                    .cpf("123456")
                    .build();
            pessoaDAO.savePessoa(pessoa);
            System.out.println("Operação realizada com sucesso!!!");
        }catch (Exception ex){
            System.out.println("Operação realizada com erro " + ex.getMessage());
        }

    }
}
