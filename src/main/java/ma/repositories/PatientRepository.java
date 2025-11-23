package ma.repositories;

import ma.mundiapolis.hospital.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient,Long>{
    Patient findByNom(String name);

}
