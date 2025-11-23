package ma.mundiapolis.hospital.entities;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor

public class Medecin {
    @Id @GeneratedValue(strategy =Generation.IDENTITY)

    private Long id;
    private String nom;
    private String email;
    private String specialite;
    @OneToMany(mappedBy = "medecin",fetch = FetchType.LAZY)
    private Collection<RendezVous> rendezVous;




}
