package com.saitej.spring5recipeapp.services;

import com.saitej.spring5recipeapp.commands.RecipeCommand;
import com.saitej.spring5recipeapp.domain.Recipe;
import org.springframework.data.crossstore.ChangeSetPersister;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
    Recipe findById(Long id) throws ChangeSetPersister.NotFoundException;
    RecipeCommand saveRecipeCommand(RecipeCommand command);
    public void deleteById(Long idToDelete);
    public RecipeCommand findCommandById(Long l) throws ChangeSetPersister.NotFoundException;
}
