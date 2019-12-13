package com.improving;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MoviesRepo extends CrudRepository<Movies, Integer> {

//    public MoviesRepo() {
//        moviesList.add(new Movies("Episode IV: A New Hope", "May 25, 1977", "George Lucas", "Gary Kurtz", "93%"));
//        moviesList.add(new Movies("Episode V: The Empire Strikes Back", "May 21, 1980", "Irvin Kershner", "Gary Kurtz", "95%"));
//        moviesList.add(new Movies("Episode VI: Return of the Jedi", "May 25, 1983", "Richard Marquand", "Howard Kazanjian", "81%"));
//        moviesList.add(new Movies("Episode I: The Phantom Menance", "May 19, 1999", "George Lucas", "Rick McCallum", "54%"));
//        moviesList.add(new Movies("Episode II: Attack of the Clones", "May 16, 2002", "George Lucas", "Rick McCallum", "65%"));
//        moviesList.add(new Movies("Episode III: Revenge of the Sith", "May 19, 2005", "George Lucas", "Rick McCallum", "80%"));
//        moviesList.add(new Movies("Episode VII: The Force Awakens", "December 18, 2015", "J. J. Abrams", "Kathleen Kennedy, J. J. Abrams, & Bryan Burk", "92%"));
//        moviesList.add(new Movies("Rogue One: A Star Wars Story", "December 16, 2016", "Gareth Edwards", "Kathleen Kennedy, Allison Shearmur, & Simon Emanuel", "84%"));
//        moviesList.add(new Movies("Episode VIIIEp: The Last Jedi", "December 15, 2017", "Rian Johnson", "Kathleen Kennedy & Ram Bergman", "91%"));
//        moviesList.add(new Movies("Solo: A Star Wars Story", "May 25, 2018", "Ron Howard", "Kathleen Kennedy, Allison Shearmur, & Simon Emanuel", "70%"));
//        moviesList.add(new Movies("Episode IX: The Rise of Skywalker", "December 20, 2019", "J. J. Abrams", "Kathleen Kennedy, J. J. Abrams, & Michelle Rejwan", "--"));
//
//    }

List<Movies> findAll();

List<Movies> findByMovieId(Integer movieId);

List<Movies> findByDirector(String director);
//    Optional<Movies> findById(Integer movieId);



//    @Query("SELECT M FROM movies M WHERE M.Movie_Id = ?1")
//    List<Movies> alternativeFindById(Integer movieId);
}
