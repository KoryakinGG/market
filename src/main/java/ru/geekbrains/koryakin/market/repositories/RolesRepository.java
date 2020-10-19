package ru.geekbrains.koryakin.market.repositories;


import ru.geekbrains.koryakin.market.entities.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepository extends CrudRepository<Role, Long> {
	Role findOneByName(String name);
}
