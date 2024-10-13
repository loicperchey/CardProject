package com.example.CardProjectSpring.controller;

import com.example.CardProjectSpring.entity.FleshAndBloodCard;
import com.example.CardProjectSpring.entity.FleshAndBloodDeck;
import com.example.CardProjectSpring.service.FleshAndBloodCardService;
import com.example.CardProjectSpring.service.FleshAndBloodDeckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/FleshAndBloodDeckController")
public class FleshAndBloodDeckController {

    private final FleshAndBloodDeckService fleshAndBloodDeckService;

    public FleshAndBloodDeckController(FleshAndBloodDeckService fleshAndBloodDeckService) {
        this.fleshAndBloodDeckService = fleshAndBloodDeckService;
    }

    @GetMapping("/findFleshAndBloodDeck")
    public ResponseEntity<Map<String, List<FleshAndBloodDeck>>> findFleshAndBloodDeck() {
        Map<String, List<FleshAndBloodDeck>> hashMap = new HashMap<>();
        try {
            hashMap.put("Catalogue des decks de Flesh and Blood chargé", fleshAndBloodDeckService.findFleshAndBloodDeck());
        } catch (Exception e) {
            hashMap.put("Erreur : les decks ne sont pas trouvées à cause de " + e.getMessage(), null);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(hashMap);
        }
        return ResponseEntity.ok(hashMap);
    }

    @GetMapping("/findFleshAndBloodDeckById/{id}")
    public ResponseEntity<Map<String, FleshAndBloodDeck>> findFleshAndBloodDeckById(@PathVariable int id) {
        Map<String, FleshAndBloodDeck> hashMap = new HashMap<>();
        try {
            hashMap.put("Carte de Flesh and Blood trouvée", fleshAndBloodDeckService.findFleshAndBloodDeckById(id));
        } catch (Exception e) {
            hashMap.put("Erreur : la carte n'a pas été trouvée à cause de " + e.getMessage(), null);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(hashMap);
        }
        return ResponseEntity.ok(hashMap);
    }

    @GetMapping("/findFleshAndBloodDeckByName/{name}")
    public ResponseEntity<Map<String, FleshAndBloodDeck>> findFleshAndBloodDeckByName(@PathVariable String deckName) {
        Map<String, FleshAndBloodDeck> hashMap = new HashMap<>();
        try {
            hashMap.put("Deck de Flesh and Blood trouvé", fleshAndBloodDeckService.findFleshAndBloodDeckByName(deckName));
        } catch (Exception e) {
            hashMap.put("Erreur : la carte n'a pas été trouvée à cause de " + e.getMessage(), null);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(hashMap);
        }
        return ResponseEntity.ok(hashMap);
    }

    @PostMapping("/createFleshAndBloodDeck")
    public ResponseEntity<Map<String, FleshAndBloodDeck>> createFleshAndBloodDeck(
            @RequestBody FleshAndBloodDeck fleshAndBloodDeck) {
        Map<String, FleshAndBloodDeck> hashMap = new HashMap<>();
        try {
            hashMap.put("Deck ajouté", fleshAndBloodDeckService.saveFleshAndBloodDeck(fleshAndBloodDeck));
        } catch (Exception e) {
            hashMap.put("Erreur : le deck n'a pas été créée à cause de " + e.getMessage(), null);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(hashMap);
        }
        return ResponseEntity.ok(hashMap);
    }

    @PutMapping("/updateFleshAndBloodDeck/{id}")
    public ResponseEntity<Map<String, FleshAndBloodDeck>> updateFleshAndBloodDeck(@RequestBody FleshAndBloodDeck fleshAndBloodDeck,@PathVariable("id") int id) {
        Map<String, FleshAndBloodDeck> hashMap = new HashMap<String, FleshAndBloodDeck>();
        try {
            hashMap.put("Deck modifié",
                    fleshAndBloodDeckService.updateFleshAndBloodDeck(fleshAndBloodDeck, id));
        } catch (Exception e) {
            hashMap.put("Erreur : la carte n'a pas été modifiée à cause de " + e.getMessage(), null);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(hashMap);
        }
        return ResponseEntity.ok(hashMap);
    }


//ça fonctionne

    @DeleteMapping("/deleteFleshAndBloodDeck/{id}")
    public ResponseEntity<String> deleteFleshAndBloodDeck(@PathVariable int id){
        try{
            fleshAndBloodDeckService.deleteFleshAndBloodDeckById(id);
            Map<String, Boolean> response = new HashMap<>();
            response.put("deleted", Boolean.TRUE);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An exception has occured due to " + e.getMessage());
        }
        return ResponseEntity.ok("Carte supprimée");
    }
}
