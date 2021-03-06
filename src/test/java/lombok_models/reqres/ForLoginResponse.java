package lombok_models.reqres;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ForLoginResponse {
    private String token;
    private String error;
}
