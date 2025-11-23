package ma.mundiapolis.hospital;

import ma.mundiapolis.hospital.entities.*;
import ma.repositories.ConsultationRepository;
import ma.repositories.MedecinRepository;
import ma.repositories.PatientRepository;
import ma.repositories.RendezVousRepository;
import ma.service.IHospitalService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class HospitalApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalApplication.class, args);

	}
    @Bean
    CommandLineRunner start(IHospitalService hospitalService,
                            PatientRepository patientRepository,
                            MedecinRepository medecinRepository,
                            ConsultationRepository consultationRepository ,
                            RendezVousRepository rendezVousRepository) {

    return  args ->{
            Stream.of("Mohammed","Hassan","Najat")
                    .forEach(name-> {
                        Patient patient = new Patient();
                        patient.SetNom(name);
                        patient.SetDateNaissance(new Date());
                        patient.SetMalade(false);
                        hospitalService.savePatient(patient);
                    });
            Stream.of("Aymane","Hannan","Yasmine")
                    .forEach(name-> {
                        Medecin medecin = new Medecin();
                        medecin.setNom(name);
                        medecin.setEmail(name+"@gmail.com");
                        medecin.setSecialite(Math.random()>0.5"Cardio":"Dentiste");
                        hospitalService.saveMedecin(medecin);
                    });
            Patient patient=patientRepository.findByID(1L).orElse(null);
            Patient patient2=patientRepository.findByNom("Mohammed");
            Medecin medecin=medecinRepository.findByNom("Yasmine");


            RendezVous rendezVous=new RendezVous();
            rendezVous.setDate(new Date());
            rendezVous.setStatus(StatusRDV.PENDING);
            rendezVous.setMedecin(medecin);
            rendezVous.setPatient(patient);
            rendezVousRepository.save(rendezVous);



            RendezVous rendezvous1=rendezVousRepository.findById(1L).orElse(null);
            Consultation consultation=new Consultation();
            consultation.setDataConsultation(new Date());
            consultation.setRendezVous(rendezvous1);
            consultation.setRapport("Rapport de la consultation ....");
            hospitalService.saveConsultation(consultation);






        };
    }

}
