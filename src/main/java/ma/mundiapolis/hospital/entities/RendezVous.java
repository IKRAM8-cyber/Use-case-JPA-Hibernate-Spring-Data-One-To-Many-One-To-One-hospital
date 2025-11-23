package ma.mundiapolis.hospital.entities;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class RendezVous {
    @Id @GenerateValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private StatusRDV status;
    @ManyToOne
    private Patient patient;
    @ManyToOne
    private Medecin medecin;
    @OneToOne(mappedBy = "rendezVous")
    private Consultation consultation;

}
