package hillel.rest.dto;

import lombok.*;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponceData {
    private String id;
    private String first_name;
    private String email;
    private String last_name;
    private String avatar;
}
