package hillel.rest.dto;

import lombok.*;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FullUserInfo {
    private ResponceData data;
    private Support support;
}
