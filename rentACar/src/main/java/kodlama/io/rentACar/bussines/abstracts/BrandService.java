package kodlama.io.rentACar.bussines.abstracts;

import java.util.List;

import kodlama.io.rentACar.bussines.requests.CreateBrandRequest;
import kodlama.io.rentACar.bussines.requests.UpdateBrandRequest;
import kodlama.io.rentACar.bussines.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.bussines.responses.GetByIdBrandResponse;

public interface BrandService {
	List<GetAllBrandsResponse> getAll();
	GetByIdBrandResponse getById(int id);
	void add(CreateBrandRequest createBrandRequest);
	void update(UpdateBrandRequest updateBrandRequest);
	void delete(int id);

}
