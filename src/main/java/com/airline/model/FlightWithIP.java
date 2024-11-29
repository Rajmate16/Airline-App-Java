package com.airline.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Setter
@Getter
public class FlightWithIP {
    private Flight flight;
    private String serverIP;
}
