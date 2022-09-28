package com.mateoospina.practicaiautomatizacionendtoend.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Builder
@Getter
public class Product {
    private String category;
    private String name;
}
