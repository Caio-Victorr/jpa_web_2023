package main;

import dao.PessoaDAO;
import domain.Pessoa;

import java.util.List;
import java.util.UUID;

public class App {
    public static void main(String[] args) {

        try{
            System.out.println("Iniciando Operação");
            var pessoaDAO = new PessoaDAO();
//            var pessoa
//                    = Pessoa.builder()
//                    .nome("Jose")
//                    .cpf("123456")
//                    .build();
//            pessoaDAO.savePessoa(pessoa);
            var maria = Pessoa.builder()
                    .nome("Maria")
                    .cpf("34561")
                    .build();
            //pessoaDAO.savePessoa(maria);
//            var pessoas= pessoaDAO.getAll();
//            System.out.println(pessoas);
            var pessoaPeloCpf = pessoaDAO.getPessoaByCPF("34561");
            //System.out.println(pessoaPeloCpf);
            //pessoaPeloCpf.setNome("Maria da Silva Souza");
            //pessoaDAO.updatePessoaById(pessoaPeloCpf.getId());
            pessoaDAO.removePessoa(pessoaPeloCpf);

            System.out.println("Operação realizada com sucesso!!!");
        }catch (Exception ex){
            System.out.println("Operação realizada com erro " + ex.getMessage());
        }

    }
}
