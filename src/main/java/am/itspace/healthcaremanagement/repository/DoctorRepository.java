package am.itspace.healthcaremanagement.repository;

import am.itspace.healthcaremanagement.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor,Integer> {
}
