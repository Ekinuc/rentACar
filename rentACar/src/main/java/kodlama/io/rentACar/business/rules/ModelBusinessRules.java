package kodlama.io.rentACar.business.rules;

import org.springframework.stereotype.Service;

import kodlama.io.rentACar.core.utilities.exception.BusinessException;
import kodlama.io.rentACar.dataAccess.abstracts.ModelRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ModelBusinessRules {
	private ModelRepository modelRepository;
	
	public void checkIfModelExists(String name) {
		if(this.modelRepository.existsByName(name)) {
			throw new BusinessException("Model already exists");
		}
	}

}
