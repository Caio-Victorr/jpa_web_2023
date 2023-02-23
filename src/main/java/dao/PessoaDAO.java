package dao;

import domain.Pessoa;

import javax.persistence.Query;
import java.util.List;
import java.util.UUID;

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

    public List<Pessoa> getAll(){
        configPersistance.getEntityManager().getTransaction().begin();
        Query query = configPersistance.getEntityManager().createNamedQuery("pessoa.getAll");
        return query.getResultList();
    }

    public Pessoa getPessoaByCPF(String cpfPorParametro){

        configPersistance.getEntityManager().getTransaction().begin();
        Query query = configPersistance.getEntityManager().createNamedQuery("pessoa.getByCPF");
        query.setParameter("cpf", cpfPorParametro);
        return (Pessoa) query.getSingleResult();
    }

    public void updatePessoaById(UUID id){
        //configPersistance.getEntityManager().getTransaction().begin();
        Pessoa pessoa = configPersistance.getEntityManager().find(Pessoa.class, id);
        configPersistance.getEntityManager().merge(pessoa);
        configPersistance.getEntityManager().getTransaction().commit();
    }

    public void removePessoa(Pessoa p){
        configPersistance.getEntityManager().remove(p);
        configPersistance.getEntityManager().getTransaction().commit();
    }
}





