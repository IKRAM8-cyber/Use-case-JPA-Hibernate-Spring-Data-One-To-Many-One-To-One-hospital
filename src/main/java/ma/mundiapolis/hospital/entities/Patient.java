package ma.mundiapolis.hospital.entities;
@Entity
@Data
@NoArgsConstructor
@AllArgConstructor
public class Patient {
    @Id @GeneratedValue(strategy =Generation.IDENTITY)
    private long id ;
    private String nom ;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance ;
    private boolean malade ;
    @OneToMany(mappeBy = "patient",fetch = FetchType.LAZY)
    private Collection<RendezVous> rendezVous ;



}
