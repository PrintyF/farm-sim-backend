package com.example.simulation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DurationFormat.Unit;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.simulation.service.SimulationService;

@RestController
@RequestMapping("simulation")
public class SimulationController {

@Autowired
    private SimulationService simulationService;

    @PostMapping("/run")
    public ResponseEntity<String> runSimulation() {
        return ResponseEntity.ok("Simulation completed.");
    }

    @GetMapping("/population")
    public List<Unit> getResults() {
        return null;
    }
}
