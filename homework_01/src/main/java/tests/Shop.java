/*
*Задание 2. (необязательное) *
Мы хотим улучшить функциональность нашего интернет-магазина. Ваша задача - добавить два новых метода в класс Shop:
Метод sortProductsByPrice(), который сортирует список продуктов по стоимости. Метод getMostExpensiveProduct(), который
*  возвращает самый дорогой продукт. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов
*  (правильное количество продуктов, верное содержимое корзины).
Напишите тесты для проверки корректности работы метода getMostExpensiveProduct. Напишите тесты для проверки
*  корректности работы метода sortProductsByPrice (проверьте правильность сортировки). Используйте класс Product для
*  создания экземпляров продуктов и класс Shop для написания методов сортировки и тестов.
 */

package tests;

import java.util.Comparator;
import java.util.List;

public class Shop {
    private List<Product> products;

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Метод возвращает отсортированный по возрастанию цены список продуктов
    public List<Product> sortProductsByPrice() {
        products.sort(Comparator.comparing(Product::getCost));
        return products;
    }

    // Метод возвращает самый дорогой продукт
    public Product getMostExpensiveProduct() {
        return products.stream()
                .max(Comparator.comparing(Product::getCost))
                .orElse(null);
    }
}

