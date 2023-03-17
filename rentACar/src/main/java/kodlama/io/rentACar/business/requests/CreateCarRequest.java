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
	
	@NotNull(message = "Please enter id")
	private double dailyPrice;
	
	@NotNull(message = "Please enter id")
	private int modelYear;
	
	@NotNull(message = "Please enter id")
	private int state;
	
	@NotNull(message = "Please enter id")
	private int modelId;

}
