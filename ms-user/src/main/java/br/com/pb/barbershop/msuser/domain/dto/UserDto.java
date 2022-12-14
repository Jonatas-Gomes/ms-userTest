package br.com.pb.barbershop.msuser.domain.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;
import org.hibernate.validator.constraints.Length;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Long id;
    @NotBlank
    @Pattern(regexp = "^([a-zA-ZãÃéÉíÍóÓêÊôÔáÁ\s])+$", message = "nome deve conter apenas letras")
    private String name;
    @NotBlank
    @Length(min = 11, max = 11, message = "Número de contato deve conter ddd + numeros")
    @Pattern(regexp = "^([0-9])+$", message = "número de contato deve conter apenas números")
    private String numberPhone;
    @Email
    private String email;
}
