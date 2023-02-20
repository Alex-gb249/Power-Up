package com.alexis.restaurant.infrastructure.input.rest;

import com.alexis.restaurant.application.dto.request.PlateRequestDto;
import com.alexis.restaurant.application.handler.IPlateHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/plate")
@RequiredArgsConstructor
public class PlateRestController {
    private final IPlateHandler plateHandler;

    @PostMapping
    public ResponseEntity<Void> savePlate(@RequestBody PlateRequestDto plateRequestDto) {
        plateHandler.savePlate(plateRequestDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Void> updatePlate(@RequestBody PlateRequestDto plateRequestDto) {
        // TODO: Create handler for update that verify existence
        plateHandler.savePlate(plateRequestDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
