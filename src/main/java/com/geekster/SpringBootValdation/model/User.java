package com.geekster.SpringBootValdation.model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @NotNull
    private Long userId;
     @Pattern(regexp = "^[A-Z].*")
      private String userName;
      @Pattern(regexp ="[a-zA-Z0-9_.+-]+@gmail\\.com")
      private String userMail;
    @Pattern(regexp ="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$\n")
    private String userPassword;
      @Pattern(regexp ="\\d{10}")
      private String userContact;
      @Min(value=18)
      @Max(value =35)
     private Integer userAge;
     @NotNull
    private LocalDate userDOB;
}
