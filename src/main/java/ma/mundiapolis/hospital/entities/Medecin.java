package ma.mundiapolis.hospital.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor

public class Medecin {
    @Id @GeneratedValue(strategy =Generation.IDENTITY)

    private Long id;
    private String nom;
    private String email;
    private String specialite;
    @OneToMany(mappedBy = "medecin",fetch = FetchType.LAZY)
    @JsonProperty(access = JsonProperty.Access.READ_WRITE)
    private Collection<RendezVous> rendezVous;




}
