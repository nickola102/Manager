package ru.netology.movie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerMovieTest {

    ManagerMovie movie = new ManagerMovie();

    @Test
    public void shouldFindAll() {


        Movie first = new Movie(1, "Blood Shot");
        Movie second = new Movie(2, "Onward");
        Movie third = new Movie(3, "Otel Belgrad");

        movie.save(first);
        movie.save(second);
        movie.save(third);

        Movie[] expected = {first, second, third};
        Movie[] actual = movie.findAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLast() {

        Movie first = new Movie(1, "Blood Shot");
        Movie second = new Movie(2, "Onward");
        Movie third = new Movie(3, "Otel Belgrad");
        Movie fourth = new Movie(4, "The Gentlemen");
        Movie fifth = new Movie(5, "The Invisible Man");
        Movie sixth = new Movie(6, "Trolls World Tour");
        Movie seventh = new Movie(7, "Nomer Odin");
        Movie eighth = new Movie(8, "Shang-Chi and the Legend of the Ten Rings");
        Movie ninth = new Movie(9, "Uncharted");
        Movie tenth = new Movie(10, "Death on the Nile");
        Movie eleventh = new Movie(11, "The Batman");
        Movie twelfth = new Movie(12, "Sing 2");
        Movie thirteenth = new Movie(13, "Spider-Man: No Way Home");
        Movie fourteenth = new Movie(14, "Marry Me");
        Movie fifteenth = new Movie(15, "Jackass Forever");

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
        Movie[] actual = movie.findLast();

        assertArrayEquals(expected, actual);

    }

    @Test

    public void shouldFindLastWithLimit() {

        ManagerMovie movie = new ManagerMovie(14);

        Movie first = new Movie(1, "Blood Shot");
        Movie second = new Movie(2, "Onward");
        Movie third = new Movie(3, "Otel Belgrad");
        Movie fourth = new Movie(4, "The Gentlemen");
        Movie fifth = new Movie(5, "The Invisible Man");
        Movie sixth = new Movie(6, "Trolls World Tour");
        Movie seventh = new Movie(7, "Nomer Odin");
        Movie eighth = new Movie(8, "Shang-Chi and the Legend of the Ten Rings");
        Movie ninth = new Movie(9, "Uncharted");
        Movie tenth = new Movie(10, "Death on the Nile");
        Movie eleventh = new Movie(11, "The Batman");
        Movie twelfth = new Movie(12, "Sing 2");
        Movie thirteenth = new Movie(13, "Spider-Man: No Way Home");
        Movie fourteenth = new Movie(14, "Marry Me");
        Movie fifteenth = new Movie(15, "Jackass Forever");

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

        Movie[] expected = {fifteenth, fourteenth, thirteenth, twelfth, eleventh, tenth, ninth,
                eighth, seventh, sixth, fifth, fourth, third, second};
        Movie[] actual = movie.findLast();

        assertArrayEquals(expected, actual);

    }

}