package model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
@ToString
@Builder
@Entity
@Table (name = "pla_yer")
@NamedQueries( {
        @NamedQuery(name = "byLogin", query = "select p from Player p where p.login = :login order by p.name"),
        @NamedQuery(name = "byAttainment", query = "select a from Player p join p.attainments a where a.attainmentName =:aName"),
        @NamedQuery(name = "playerByAttainment", query = "select p from Player p join p.attainments a where a.attainmentName =:aName"),
        @NamedQuery(name = "AttainmentDtoByPlayer", query = "select new dto.AttainmentDto(a.id, a.attainmentName) from Player p join p.attainments a")
}
)
public class Player {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String login;
    @ManyToMany (mappedBy = "playerSet")
    private Set <Attainment> attainments;

    public Player(String name) {
        this.name = name;
    }
}
