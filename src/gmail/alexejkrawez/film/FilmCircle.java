package gmail.alexejkrawez.film;

import gmail.alexejkrawez.figure.Circle;
import gmail.alexejkrawez.figure.Figure;

public class FilmCircle extends Circle implements Film {

    /**
     * Constructor of the film circle which radius.
     *
     * @param radius radius of film circle.
     */
    public FilmCircle(double radius) {
        super(radius);
    }

    /**
     * Constructor of the film circle which cut out from the shape.
     *
     * @param figure old shape from which cut out.
     */
    public FilmCircle(Film figure) {
        super((Figure) figure);
    }
}
