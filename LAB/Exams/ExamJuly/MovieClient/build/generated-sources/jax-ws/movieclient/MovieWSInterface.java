
package movieclient;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MovieWSInterface", targetNamespace = "http://moviews.july.softeng.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MovieWSInterface {


    /**
     * 
     * @return
     *     returns java.util.List<movieclient.Movie>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllMovies", targetNamespace = "http://moviews.july.softeng.com/", className = "movieclient.GetAllMovies")
    @ResponseWrapper(localName = "getAllMoviesResponse", targetNamespace = "http://moviews.july.softeng.com/", className = "movieclient.GetAllMoviesResponse")
    @Action(input = "http://moviews.july.softeng.com/MovieWSInterface/getAllMoviesRequest", output = "http://moviews.july.softeng.com/MovieWSInterface/getAllMoviesResponse")
    public List<Movie> getAllMovies();

    /**
     * 
     * @return
     *     returns java.util.List<movieclient.Director>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllDirectors", targetNamespace = "http://moviews.july.softeng.com/", className = "movieclient.GetAllDirectors")
    @ResponseWrapper(localName = "getAllDirectorsResponse", targetNamespace = "http://moviews.july.softeng.com/", className = "movieclient.GetAllDirectorsResponse")
    @Action(input = "http://moviews.july.softeng.com/MovieWSInterface/getAllDirectorsRequest", output = "http://moviews.july.softeng.com/MovieWSInterface/getAllDirectorsResponse")
    public List<Director> getAllDirectors();

    /**
     * 
     * @param arg0
     * @return
     *     returns movieclient.Movie
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMovie", targetNamespace = "http://moviews.july.softeng.com/", className = "movieclient.GetMovie")
    @ResponseWrapper(localName = "getMovieResponse", targetNamespace = "http://moviews.july.softeng.com/", className = "movieclient.GetMovieResponse")
    @Action(input = "http://moviews.july.softeng.com/MovieWSInterface/getMovieRequest", output = "http://moviews.july.softeng.com/MovieWSInterface/getMovieResponse")
    public Movie getMovie(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns movieclient.Director
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDirector", targetNamespace = "http://moviews.july.softeng.com/", className = "movieclient.GetDirector")
    @ResponseWrapper(localName = "getDirectorResponse", targetNamespace = "http://moviews.july.softeng.com/", className = "movieclient.GetDirectorResponse")
    @Action(input = "http://moviews.july.softeng.com/MovieWSInterface/getDirectorRequest", output = "http://moviews.july.softeng.com/MovieWSInterface/getDirectorResponse")
    public Director getDirector(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}