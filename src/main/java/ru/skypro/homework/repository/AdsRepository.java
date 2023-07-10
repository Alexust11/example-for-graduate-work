package ru.skypro.homework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.skypro.homework.model.Ads;

import java.util.Collection;
import java.util.List;

@Repository
public interface AdsRepository extends JpaRepository<Ads, Integer> {

    Collection<Ads> findByTitleContainsOrderByTitle(String title);

    List<Ads> findAllByAuthorId(Integer authorId);

    List<Ads> findAllByTitleContainsIgnoreCase(String title);
}
