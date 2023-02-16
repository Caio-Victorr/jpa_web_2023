package dao;

import domain.Pessoa;

public class PessoaDAO {

    private ConfigPersistance configPersistance;

    public PessoaDAO(){
        configPersistance = new ConfigPersistance();
    }

    public void savePessoa(Pessoa pessoa){
        configPersistance.getEntityManager().getTransaction().begin();
        configPersistance.getEntityManager().persist(pessoa);
        configPersistance.getEntityManager().getTransaction().commit();
    }

}
