package com.github.sspyri;
import static spark.Spark.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        get("/hello/:name", (req, res) -> "Hello " + req.params("name") + " your ip is: " + req.ip());
    }
}
