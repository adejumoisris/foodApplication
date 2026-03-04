package com.example.foodApplication.reviews.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReviewDto {
    private Long id;
    private  Long menuId;
    private Long orderId;

    private String userName;
    @NotNull(message = "Rating is required")
    @Min(1)
    @Max(10)
    private  Integer rating;
    @Size(min = 1, max = 100, message = "Comment cannot exceed 500 characters")
    private String comment;

    private String menuName;
    private LocalDateTime createdDate;
}
