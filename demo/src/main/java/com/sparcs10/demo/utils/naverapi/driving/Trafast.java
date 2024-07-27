package com.sparcs10.demo.utils.naverapi.driving;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Trafast {
    private Summary summary;
    private List<List<Double>> path;
    private List<Section> section;
    private List<Guide> guide;
}