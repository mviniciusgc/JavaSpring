package com.portal.api.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude
public class CarPostDTO {
    private Long ownerId;
    private String brand;
    private String model;
    private String price;
    private String description;
    private String engineVersion;
    private String city;
    private String createdDate;
    private String ownerName;
    private String ownerType;
    private String contract;

}
