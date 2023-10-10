package class4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ProductService4Test {

    @Test
    public void testAllParameterTypes() {
        // Create a mock of the ProductRepository
        ProductRepository productRepository = mock(ProductRepository.class);

        // Create a ProductService and inject the mock ProductRepository
        ProductService productService = new ProductService(productRepository);

        // Set up mock behavior for various parameter types

        // Case 1: Using any() for matching any parameter
        when(productRepository.getProductById(any())).thenReturn(new Product(1, "Widget", 10.0));

        // Case 2: Using any(ClassName.class) to match parameters of a specific class
        when(productRepository.getProductByName(any(String.class))).thenReturn(new Product(2, "Gadget", 20.0));

        // Case 3: Using anyInt(), anyBoolean(), and anyDouble() for primitive types
        when(productRepository.getProductByStockCount(anyInt())).thenReturn(new Product(3, "Doodad", 30.0));
        when(productRepository.isProductAvailable(anyBoolean())).thenReturn(true);
        when(productRepository.getProductByPriceRange(anyDouble(), anyDouble())).thenReturn(new Product(4, "Thingamajig", 40.0));

        // Case 4: Using anyList() for matching a list parameter
        when(productRepository.getProductsByCategories(anyList())).thenReturn(List.of(new Product(5, "Contraption", 50.0)));

        // Perform the test: Call methods with different parameter types

        // Case 1: Get product by ID
        Product result1 = productService.getProductById(1);

        // Case 2: Get product by name
        Product result2 = productService.getProductByName("Gadget");

        // Case 3: Get product by stock count, check if product is available, and get product by price range
        Product result3 = productService.getProductByStockCount(100);
        boolean isAvailable = productService.isProductAvailable(true);
        Product result4 = productService.getProductByPriceRange(30.0, 50.0);

        // Case 4: Get products by categories
        List<Product> result5 = productService.getProductsByCategories(List.of("Electronics", "Gizmos"));

        // Verify that the methods were called with the specified parameters
        verify(productRepository).getProductById(any());
        verify(productRepository).getProductByName(any(String.class));
        verify(productRepository).getProductByStockCount(anyInt());
        verify(productRepository).isProductAvailable(anyBoolean());
        verify(productRepository).getProductByPriceRange(anyDouble(), anyDouble());
        verify(productRepository).getProductsByCategories(anyList());

        // Assert the results
        assertEquals("Widget", result1.getName());
        assertEquals(20.0, result2.getPrice(), 0.01);
        assertEquals(3, result3.getId());
        assertTrue(isAvailable);
        assertEquals(4, result4.getId());
        assertEquals(5, result5.get(0).getId());
    }
}

class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product getProductById(int productId) {
        return productRepository.getProductById(productId);
    }

    public Product getProductByName(String productName) {
        return productRepository.getProductByName(productName);
    }

    public Product getProductByStockCount(int stockCount) {
        return productRepository.getProductByStockCount(stockCount);
    }

    public boolean isProductAvailable(boolean available) {
        return productRepository.isProductAvailable(available);
    }

    public Product getProductByPriceRange(double minPrice, double maxPrice) {
        return productRepository.getProductByPriceRange(minPrice, maxPrice);
    }

    public List<Product> getProductsByCategories(List<String> categories) {
        return productRepository.getProductsByCategories(categories);
    }
}

class ProductRepository {
    public Product getProductById(int productId) {
        // Actual implementation doesn't matter for the test
        return null;
    }

    public Product getProductByName(String productName) {
        // Actual implementation doesn't matter for the test
        return null;
    }

    public Product getProductByStockCount(int stockCount) {
        // Actual implementation doesn't matter for the test
        return null;
    }

    public boolean isProductAvailable(boolean available) {
        // Actual implementation doesn't matter for the test
        return false;
    }

    public Product getProductByPriceRange(double minPrice, double maxPrice) {
        // Actual implementation doesn't matter for the test
        return null;
    }

    public List<Product> getProductsByCategories(List<String> categories) {
        // Actual implementation doesn't matter for the test
        return null;
    }
}

class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
