package ma.service;

import ma.mundiapolis.hospital.entities.Consultation;
import ma.mundiapolis.hospital.entities.Medecin;
import ma.mundiapolis.hospital.entities.Patient;
import ma.mundiapolis.hospital.entities.RendezVous;

public interface IHospitalService {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRDV(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);

}
