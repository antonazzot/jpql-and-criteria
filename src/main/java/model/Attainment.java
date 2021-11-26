package model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.Set;

@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString (exclude = "playerSet")
@EqualsAndHashCode (exclude = "playerSet")
@Entity
@Table (name = "attainment")
@NamedQueries( {
        @NamedQuery(name = "byCommunDto", query = "select new dto.CommunDto (p.id, p.name, a.attainmentName) from Attainment a join a.playerSet p where p.login = :login "),
        @NamedQuery(name = "byPlayer", query = "select p from Player p join fetch p.attainments a where a.attainmentName = :name ")
}
)
public class Attainment {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column (name = "attainment_name")
    private String attainmentName;
//    @ManyToMany
//    @JoinTable (
//            name = "playerid_attainmentid",
//            joinColumns = @JoinColumn (name = "attainment_id"),
//            inverseJoinColumns = @JoinColumn (name = "player_id")
//    )
//    private Set<Player> playerSet;

}
