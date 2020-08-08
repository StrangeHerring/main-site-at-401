package ru.geekbrains.main.site.at;

public class main {
    public static void main(String[] args) {
        cat cat1 = new cat(10,5);
        cat cat2 = new cat(7, 3);
        dog dog1 = new dog(15,3);
        dog dog2 = new dog(11, 2);
        human human1 = new human(15, 2);
        human human2 = new human(12, 4);

        wall wall1 = new wall{10};

        Members[] members = {cat1, cat2, dog1, dog2, human1, human2};
    }
}
