package com.example.CardProjectSpring.controller;

import com.example.CardProjectSpring.entity.FleshAndBloodCard;
import com.example.CardProjectSpring.entity.FleshAndBloodDeck;
import com.example.CardProjectSpring.service.FleshAndBloodCardService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/FleshAndBloodCardController")
public class FleshAndBloodCardController extends AbstractController{


    private final FleshAndBloodCardService fleshAndBloodCardService;

    public FleshAndBloodCardController(FleshAndBloodCardService fleshAndBloodCardService) {
        this.fleshAndBloodCardService = fleshAndBloodCardService;
    }
    @GetMapping("/findFleshAndBloodCard")
    public ResponseEntity<Map<String, List<FleshAndBloodCard>>> findFleshAndBloodDeck() {
        Map<String, List<FleshAndBloodCard>> hashMap = new HashMap<>();
        try {
            hashMap.put("Catalogue des decks de Flesh and Blood chargé", fleshAndBloodCardService.findFleshAndBloodCard());
        } catch (Exception e) {
            hashMap.put("Erreur : les decks ne sont pas trouvées à cause de " + e.getMessage(), null);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(hashMap);
        }
        return ResponseEntity.ok(hashMap);
    }

    @GetMapping("/findFleshAndBloodCardById/{id}")
    public ResponseEntity<Map<String, FleshAndBloodCard>> findFleshAndBloodCardById(@PathVariable int id) {
        Map<String, FleshAndBloodCard> hashMap = new HashMap<>();
        try {
            hashMap.put("Carte de Flesh and Blood trouvée", fleshAndBloodCardService.findFleshAndBloodCardById(id));
        } catch (Exception e) {
            hashMap.put("Erreur : la carte n'a pas été trouvée à cause de " + e.getMessage(), null);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(hashMap);
        }
        return ResponseEntity.ok(hashMap);
    }

    @GetMapping("/findFleshAndBloodCardByName/{name}")
    public ResponseEntity<Map<String, FleshAndBloodCard>> findFleshAndBloodCardByName(@PathVariable String name) {
        Map<String, FleshAndBloodCard> hashMap = new HashMap<>();
        try {
            hashMap.put("Carte de Flesh and Blood trouvée", fleshAndBloodCardService.findFleshAndBloodCardByName(name));
        } catch (Exception e) {
            hashMap.put("Erreur : la carte n'a pas été trouvée à cause de " + e.getMessage(), null);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(hashMap);
        }
        return ResponseEntity.ok(hashMap);
    }

    @PostMapping("/createFleshAndBloodCard")
    public ResponseEntity<Map<String, FleshAndBloodCard>> createFleshAndBloodCard(
            @RequestBody FleshAndBloodCard fleshAndBloodCard) {
        Map<String, FleshAndBloodCard> hashMap = new HashMap<>();
        try {
            hashMap.put("Carte ajoutée", fleshAndBloodCardService.saveFleshAndBloodCard(fleshAndBloodCard));
        } catch (Exception e) {
            hashMap.put("Erreur : la carte n'a pas été créée à cause de " + e.getMessage(), null);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(hashMap);
        }
        return ResponseEntity.ok(hashMap);
    }

   @PutMapping("/updateFleshAndBloodCard/{id}")
    public ResponseEntity<Map<String, FleshAndBloodCard>> updateFleshAndBloodCard(@RequestBody FleshAndBloodCard fleshAndBloodCard,@PathVariable("id") int id) {
        Map<String, FleshAndBloodCard> hashMap = new HashMap<String, FleshAndBloodCard>();
        try {
            hashMap.put("Carte modifiée",
                    fleshAndBloodCardService.updateFleshAndBloodCard(fleshAndBloodCard, id));
        } catch (Exception e) {
            hashMap.put("Erreur : la carte n'a pas été modifiée à cause de " + e.getMessage(), null);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(hashMap);
        }
        return ResponseEntity.ok(hashMap);
    }


//ça fonctionne

    @DeleteMapping("/deleteFleshAndBloodCard/{id}")
    public ResponseEntity<String> deleteFleshAndBloodCard(@PathVariable int id){
        try{
            fleshAndBloodCardService.deleteFleshAndBloodCardById(id);
            Map<String, Boolean> response = new HashMap<>();
            response.put("deleted", Boolean.TRUE);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An exception has occured due to " + e.getMessage());
        }
        return ResponseEntity.ok("Carte supprimée");
    }
}
