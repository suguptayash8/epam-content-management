package epam.content.management.controller.analyzer;


import epam.content.management.service.generators.Generators;
import jakarta.annotation.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "/analyzer")
public class SenetenceAnalyzer {

    @Resource
    private Generators generators;

    @RequestMapping(value = "/generate/sentence/{word}", method = RequestMethod.GET)
    public ResponseEntity<Object> createUser(@PathVariable String word){
        return  new ResponseEntity<>(word, HttpStatus.OK);
    }

}
