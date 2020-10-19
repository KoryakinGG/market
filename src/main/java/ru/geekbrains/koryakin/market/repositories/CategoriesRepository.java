package ru.geekbrains.koryakin.market.repositories;

import ru.geekbrains.koryakin.market.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesRepository extends JpaRepository<Category, Long> {
}