import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Product;
import ru.netology.ShopRepository;

public class ShopRepositoryTest {
    @Test
    public void shouldRemoveIfIdExist() {
        ShopRepository repo = new ShopRepository();
        Product product1 = new Product(1, "Футболка", 300);
        Product product2 = new Product(2, "Шорты", 450);
        Product product3 = new Product(3, "Джинсы", 1000);
        Product product4 = new Product(4, "Ремень", 200);
        Product product5 = new Product(5, "Ботинки", 1300);

        repo.add(product1);
        repo.add(product2);
        repo.add(product3);
        repo.add(product4);
        repo.add(product5);

        Product[] actual = repo.findAll();
        Product[] expected = {product1, product2, product3, product4, product5};
        Assertions.assertArrayEquals(actual, expected);


    }
}
