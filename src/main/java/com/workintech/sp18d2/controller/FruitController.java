package com.workintech.sp18d2.controller;
import com.workintech.sp18d2.dao.FruitResponse;
import com.workintech.sp18d2.entity.Fruit;
import com.workintech.sp18d2.service.FruitService;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@Validated
@RestController
@RequestMapping("/fruit")
public class FruitController {
    private final FruitService fruitService;

    public FruitController(FruitService fruitService) {
        this.fruitService = fruitService;
    }
    @GetMapping
    public List<Fruit> getAll(){
        return fruitService.getByPriceAsc();
    }

    @GetMapping("/{id}")
    public FruitResponse getById(@Positive @PathVariable("id") Long id){
        return new FruitResponse("get by id successfully", fruitService.getById(id) );
    }
    @GetMapping("/desc")
    public List<Fruit> getAllDesc(){

        return fruitService.getByPriceDesc();
    }
    @PostMapping
    public Fruit saveFruit(@Validated @RequestBody Fruit fruit){

        return fruitService.save(fruit);
    }

    @GetMapping("/search/{name}")
    public List<Fruit> searchByName(@Size(min = 2,max = 45,message = "name length should be between 2 and 45") @PathVariable("name") String name){
        return fruitService.searchByName(name);
    }

    @DeleteMapping("/{id}")
    public Fruit deleteFruit(@Positive @PathVariable long id){
        return fruitService.delete(id);
    }
}
