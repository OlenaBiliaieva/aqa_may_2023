package hillel.rest.dto;

import lombok.*;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    private String name;
    private String job;
    private String id;
    private String createdAt;
}
