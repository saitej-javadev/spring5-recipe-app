package com.saitej.spring5recipeapp.bootstrap;

import com.saitej.spring5recipeapp.domain.Category;
import com.saitej.spring5recipeapp.domain.UnitOfMeasure;
import com.saitej.spring5recipeapp.repositories.CategoryRepository;
import com.saitej.spring5recipeapp.repositories.UnitOfMeasureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

//@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private UnitOfMeasureRepository unitOfMeasureRepository;

    @Override
    public void run(String... args) throws Exception {
        Category category = new Category();
        category.setDescription("Each");
        Category category1 = new Category();
        category1.setDescription("Tablespoon");
        Category category2 = new Category();
        category2.setDescription("Teaspoon");
        Category category3 = new Category();
        category3.setDescription("Dash");
        Category category4 = new Category();
        category4.setDescription("Pint");
        Category category5 = new Category();
        category5.setDescription("Cup");

        categoryRepository.save(category);
        categoryRepository.save(category1);
        categoryRepository.save(category2);
        categoryRepository.save(category3);
        categoryRepository.save(category4);
        categoryRepository.save(category5);


        UnitOfMeasure unitOfMeasure = new UnitOfMeasure();
        unitOfMeasure.setDescription("Teaspoon");
        unitOfMeasureRepository.save(unitOfMeasure);

        System.out.println(category.getDescription() + "" + unitOfMeasure.getDescription() + "is loaded................");

    }
}
