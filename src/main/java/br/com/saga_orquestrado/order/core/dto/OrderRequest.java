package br.com.saga_orquestrado.order.core.dto;

import br.com.saga_orquestrado.order.core.document.OrderProducts;
import br.com.saga_orquestrado.order.core.document.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderRequest {

    private List<OrderProducts> products;
}
