package org.sid.productservice;

import org.junit.jupiter.api.Test;
import org.sid.productservice.domain.Product;
import static org.assertj.core.api.Assertions.assertThat;

public class ProduitTest {

    private String name = "khabane";
    private double price = 12.0;

    @Test
    public void equalsVerifier() throws Exception {

        Product product = new Product();
        product.setName("khabane");
        product.setPrice(12.0);

        assertThat(product.getName()).isEqualTo(name);
        assertThat(product.getPrice()).isEqualTo(price);
    }
}
