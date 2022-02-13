package ru.netology.movie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerMovieTest {

    ManagerMovie movie = new ManagerMovie();

    @Test
    public void shouldFindAll() {

        Movie first = new Movie();
        Movie second = new Movie();
        Movie third = new Movie();

        movie.save(first);
        movie.save(second);
        movie.save(third);

        Movie[] expected = {first, second, third};
        Movie[] actual = movie.findAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLast() {

        Movie first = new Movie();
        Movie second = new Movie();
        Movie third = new Movie();
        Movie fourth = new Movie();
        Movie fifth = new Movie();
        Movie sixth = new Movie();
        Movie seventh = new Movie();
        Movie eighth = new Movie();
        Movie ninth = new Movie();
        Movie tenth = new Movie();
        Movie eleventh = new Movie();
        Movie twelfth = new Movie();
        Movie thirteenth = new Movie();
        Movie fourteenth = new Movie();
        Movie fifteenth = new Movie();

        movie.save(first);
        movie.save(second);
        movie.save(third);
        movie.save(fourth);
        movie.save(fifth);
        movie.save(sixth);
        movie.save(seventh);
        movie.save(eighth);
        movie.save(ninth);
        movie.save(tenth);
        movie.save(eleventh);
        movie.save(twelfth);
        movie.save(thirteenth);
        movie.save(fourteenth);
        movie.save(fifteenth);

        Movie[] expected = {fifteenth, fourteenth, thirteenth, twelfth, eleventh, tenth, ninth, eighth, seventh, sixth};
        Movie[] actual = movie.findLast(10);

        assertArrayEquals(expected, actual);

    }

}