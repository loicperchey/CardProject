package com.example.CardProjectSpring.controller;

import com.example.CardProjectSpring.entity.FleshAndBloodCard;
import com.example.CardProjectSpring.service.FleshAndBloodCardService;
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
public class FleshAndBloodCardController {

    @Autowired
    private FleshAndBloodCardService fleshAndBloodCardService;

    @GetMapping("/findFleshAndBloodCard")
    public ResponseEntity<Map<String, List<FleshAndBloodCard>>> findAllFleshAndBloodCard() {
        Map<String, List<FleshAndBloodCard>> hashMap = new HashMap<>();
        try {
            hashMap.put("Catalogue des cartes de Flesh and Blood chargé", fleshAndBloodCardService.findFleshAndBloodCard());
        } catch (Exception e) {
            hashMap.put("Erreur : les cartes ne sont pas trouvées à cause de " + e.getMessage(), null);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(hashMap);
        }
        return ResponseEntity.ok(hashMap);
    }

    @GetMapping("/findFleshAndBloodCardById/{idFleshAndBloodCard}")
    public ResponseEntity<Map<String, FleshAndBloodCard>> findAdministratorById(@PathVariable Integer idFleshAndBloodCard) {
        Map<String, FleshAndBloodCard> hashMap = new HashMap<>();
        try {
            hashMap.put("Carte de Flesh and Blood trouvée", fleshAndBloodCardService.findFleshAndBloodCardById(idFleshAndBloodCard));
        } catch (Exception e) {
            hashMap.put("Erreur : la carte n'a pas été trouvée à cause de " + e.getMessage(), null);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(hashMap);
        }
        return ResponseEntity.ok(hashMap);
    }

    @GetMapping("/findFleshAndBloodCardByName/{name}")
    public ResponseEntity<Map<String, FleshAndBloodCard>> findAdministratorByName(@PathVariable String name) {
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

    @PutMapping("/updateFleshAndBloodCard/{idFleshAndBloodCard}")
    public ResponseEntity<Map<String, FleshAndBloodCard>> updateFleshAndBloodCard(@PathVariable("idFleshAndBloodCard") Integer idFleshAndBloodCard,
                                                                                 @RequestBody FleshAndBloodCard fleshAndBloodCard) {
        Map<String, FleshAndBloodCard> hashMap = new HashMap<>();
        try {
            hashMap.put("Carte modifiée",
                    fleshAndBloodCardService.updateFleshAndBloodCard(fleshAndBloodCard, idFleshAndBloodCard));
        } catch (Exception e) {
            hashMap.put("Erreur : la carte n'a pas été modifiée à cause de " + e.getMessage(), null);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(hashMap);
        }
        return ResponseEntity.ok(hashMap);
    }
//ça fonctionne

    @DeleteMapping("/deleteFleshAndBloodCard/{idFleshAndBloodCard}")
    public ResponseEntity<String> deleteFleshAndBloodCard(@PathVariable Integer idFleshAndBloodCard){
        try{
            fleshAndBloodCardService.deleteFleshAndBloodCardById(idFleshAndBloodCard);
            Map<String, Boolean> response = new HashMap<>();
            response.put("deleted", Boolean.TRUE);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An exception has occured due to " + e.getMessage());
        }
        return ResponseEntity.ok("Carte supprimée");
    }
}
