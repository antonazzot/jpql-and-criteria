package dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@EqualsAndHashCode
public class PlayerDto {
    private int id;
    private String name;
    private String login;
}
