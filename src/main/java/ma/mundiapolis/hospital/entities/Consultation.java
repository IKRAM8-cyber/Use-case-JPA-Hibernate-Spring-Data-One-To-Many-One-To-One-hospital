package ma.mundiapolis.hospital.entities;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor

public class Consultation {
    @Id @GeneratedValue(strategy =Generation.IDENTITY)
    private Long id;
    private Date dateConsultation;
    private String rapport;
    @OneToOne
    private RendezVous rendezVous;
}
