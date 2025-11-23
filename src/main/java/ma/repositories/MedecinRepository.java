package ma.repositories;

import ma.mundiapolis.hospital.entities.Medecin;

public interface MedecinRepository extends JpaRepository<Medecin,Long> {
    Medecin findByNom(String name);
}
