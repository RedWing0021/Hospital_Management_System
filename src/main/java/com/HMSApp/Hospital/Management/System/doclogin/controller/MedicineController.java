package com.HMSApp.Hospital.Management.System.doclogin.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HMSApp.Hospital.Management.System.doclogin.entity.Medicine;
import com.HMSApp.Hospital.Management.System.doclogin.repository.MedicineRepository;
import com.HMSApp.Hospital.Management.System.entity.Patient;

@RestController
@RequestMapping("/api/v3")
public class MedicineController {

	MedicineRepository medicineRepository;

	public MedicineController(MedicineRepository medicineRepository) {
		super();
		this.medicineRepository = medicineRepository;
	}
	
	@PostMapping("/insert")
	public Medicine createMedicine(@RequestBody Medicine medicine) {
		return medicineRepository.save(medicine);
	}
	
	@GetMapping
	public List<Medicine>getAllMedicine(){
		return medicineRepository.findAll();
	}
}
