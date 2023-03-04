package kodlama.io.rentACar.bussines.abstracts;

import java.util.List;

import kodlama.io.rentACar.bussines.requests.CreateBrandRequest;
import kodlama.io.rentACar.bussines.responses.GetAllBrandsResponse;

public interface BrandService {
	List<GetAllBrandsResponse> getAll();
	void add(CreateBrandRequest createBrandRequest);

}
