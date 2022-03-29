package com.saitej.spring5recipeapp.services;


import com.saitej.spring5recipeapp.domain.Recipe;
import com.saitej.spring5recipeapp.repositories.RecipeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class ImageServiceImpl implements  ImageService{

    private final RecipeRepository recipeRepository;

    public ImageServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }


    @Override
    @Transactional
    public void saveImageFile(Long recipeId, MultipartFile file) throws IOException {
        Recipe recipe = recipeRepository.findById(recipeId).get();
        Byte[] byteObjects = new Byte[file.getBytes().length];
        int i=0;
        for (byte b: file.getBytes()){
            byteObjects[i++] = b;
        }
        recipe.setImage(byteObjects);

        recipeRepository.save(recipe);

    }
}
