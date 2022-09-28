package com.mateoospina.practicaiautomatizacionendtoend.model;

public class PurchaserFactory {
    private PurchaserFactory() {
    }

    public static Purchaser createByName(String name){
        return Purchaser.builder()
                .name(name)
                .country("Colombia")
                .city("Medellin")
                .card("123456789")
                .month("05")
                .year("25")
                .credentials(Credentials.builder()
                        .username("admin")
                        .password("admin")
                        .build())
                .build();
    }
}
