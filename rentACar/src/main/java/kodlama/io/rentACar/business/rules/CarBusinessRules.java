package kodlama.io.rentACar.business.rules;

import org.springframework.stereotype.Service;

import kodlama.io.rentACar.core.utilities.exception.BusinessException;
import kodlama.io.rentACar.dataAccess.abstracts.CarRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CarBusinessRules {
	private CarRepository carRepository;
	
	public void checkIfCarPlateExists(String plate) {
		if (carRepository.existsByPlate(plate)) {
			throw new BusinessException("Plate already exists");
		}
		
	}

}
