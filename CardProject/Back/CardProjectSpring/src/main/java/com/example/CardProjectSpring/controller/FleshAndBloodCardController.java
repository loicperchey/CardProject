package com.example.CardProjectSpring.controller;

import com.example.CardProjectSpring.entity.FleshAndBloodCard;
import com.example.CardProjectSpring.service.FleshAndBloodCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
public class FleshAndBloodCardController {

    @Autowired
    private FleshAndBloodCardService fleshAndBloodCardService;

    @GetMapping("/findAllFleshAndBloodCard")
    public List<FleshAndBloodCard> findAllFleshAndBloodCard() {
        return fleshAndBloodCardService.findFleshAndBloodCardList();
    }

    @GetMapping("/findFleshAndBloodCard/{idFleshAndBloodCard}")
    public ResponseEntity<Map<String, FleshAndBloodCard>> findFleshAndBloodCardById(@PathVariable int idFleshAndBloodCard) {
        Map<String, FleshAndBloodCard> hashMap = new HashMap<String, FleshAndBloodCard>();
        try {
            hashMap.put("Carte trouvée", fleshAndBloodCardService.findFleshAndBloodCardById(idFleshAndBloodCard));
        } catch (Exception e) {
            hashMap.put("Erreur à cause de " + e.getMessage(), null);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(hashMap);
        }
        return ResponseEntity.ok(hashMap);
    }


    @PostMapping("/createAllFleshAndBloodCard")
    public ResponseEntity<Map<String, FleshAndBloodCard>> createFleshAndBloodCard(@RequestBody FleshAndBloodCard fleshAndBloodCard) {
        Map<String, FleshAndBloodCard> hashMap = new HashMap<String, FleshAndBloodCard>();
        try {
            hashMap.put("Carte ajoutée", fleshAndBloodCardService.saveFleshAndBloodCard(fleshAndBloodCard));
        } catch (Exception e) {
            hashMap.put("Erreur à cause de " + e.getMessage(), null);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(hashMap);
        }
        return ResponseEntity.ok(hashMap);
    }

    @PutMapping("/updateAllFleshAndBloodCard/{id}")
    public ResponseEntity<Map<String, FleshAndBloodCard>> updateAllFleshAndBloodCard(@PathVariable("idFleshAndBloodCard") int idFleshAndBloodCard,
                                                                     @RequestBody FleshAndBloodCard fleshAndBloodCard) {
        Map<String, FleshAndBloodCard> hashMap = new HashMap<String, FleshAndBloodCard>();
        try {
            hashMap.put("Mise à jour de la carte", fleshAndBloodCardService.updateFleshAndBloodCard(fleshAndBloodCard, idFleshAndBloodCard));
        } catch (Exception e) {
            hashMap.put("Erreur à cause de " + e.getMessage(), null);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(hashMap);
        }
        return ResponseEntity.ok(hashMap);
    }


    @DeleteMapping("/deleteAllFleshAndBloodCard/{idFleshAndBloodCard}")
    public ResponseEntity<String> deleteFleshAndBloodCard(@PathVariable("idFleshAndBloodCard") int idFleshAndBloodCard){
        try{
            fleshAndBloodCardService.deleteFleshAndBloodCardById(idFleshAndBloodCard);
            Map<String, Boolean> response = new HashMap<>();
            response.put("deleted", Boolean.TRUE);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An exception has occured due to " + e.getMessage());
        }
        return ResponseEntity.ok("Carte flesh and blood supprimée");
    }

}
