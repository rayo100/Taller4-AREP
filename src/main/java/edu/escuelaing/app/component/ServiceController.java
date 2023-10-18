package edu.escuelaing.app.component;

import edu.escuelaing.app.springBoot.Component;
import edu.escuelaing.app.springBoot.RequestMapping;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Component
public class ServiceController {

    @RequestMapping("/")
    public static String index() {
        return  getHeader() + getResponseIndex();
    }

    @RequestMapping("404")
    public static String notFoundException() {
        return  getHeader() + getResponseNotFound();
    }

    public static String getHeader() {
        return "HTTP/1.1 200 \r\n" +
                "Content-Type: text/html \r\n" +
                "\r\n";
    }

    public static String getResponseIndex() {
        byte[] file;
        try{
            file = Files.readAllBytes(Paths.get("src/main/resources/public/pagina.html"));
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        return new String(file);
    }

    public static String getResponseNotFound() {
        byte[] file;
        try{
            file = Files.readAllBytes(Paths.get("src/main/resources/public/notFound.html"));
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        return new String(file);
    }
}
