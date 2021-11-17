package dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@EqualsAndHashCode
public class CommunDto {
    private int playerId;
    private String playerName;
    private String attainmentName;
}
