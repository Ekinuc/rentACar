package kodlama.io.rentACar.business.requests;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCarRequest {
	@NotNull
	@NotBlank
	private String plate;
	
	@NotNull
	@NotBlank
	private double dailyPrice;
	
	@NotNull
	@NotBlank
	private int modelYear;
	
	@NotNull
	@NotBlank
	private int state;
	
	@NotNull
	@NotBlank
	private int modelId;

}
