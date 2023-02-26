package kodlama.io.rentACar.bussines.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.rentACar.bussines.abstracts.BrandService;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

@Service
public class BrandManager implements BrandService {
	private BrandRepository brandRepository;

	public BrandManager(BrandRepository brandRepository) {
		this.brandRepository = brandRepository;
	}

	@Override
	public List<Brand> getAll() {
		//iş kural kodlarıı
		return brandRepository.getAll();
	}

}
