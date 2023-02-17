package domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@NamedQueries({
        @NamedQuery(name = "pessoa.getAll", query = "select p from Pessoa p"),
        @NamedQuery(name = "pessoa.getByCPF", query = "select p from Pessoa p where p.cpf =:cpf")
})
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String nome;
    @Column(unique = true)
    private String cpf;
}
