package _15PatikaStoreÖdevi.Objects;

import _15PatikaStoreÖdevi.Abstraction.Product;

public class Notebook extends Product<Notebook> {

    public Notebook(String brand, String description, double unitPrice, double discount, int stock, int memory, double size, int ram) {
        super(brand, description, unitPrice, discount, stock, memory, size, ram);
    }
}
