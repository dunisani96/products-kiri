package com.xpressparts.project.config;


import com.xpressparts.project.model.Product;
import com.xpressparts.project.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class ProductsConfig {

    @Bean
    public CommandLineRunner commandLineRunner(ProductRepository productRepository){

        return args -> {
            productRepository.saveAll(Arrays.asList(
                    new Product("Brake Pad Set - BP-1001", "High-performance brake pads for smooth braking", 75.99),
                    new Product("Oil Filter - OF-2231", "Engine oil filter to maintain engine health", 19.49),
                    new Product("Air Filter - AF-5543", "Air filter for improved engine performance", 29.99),
                    new Product("Spark Plug - SP-9002", "Premium spark plug for better combustion", 12.49),
                    new Product("Timing Belt - TB-1029", "Durable timing belt for engine timing control", 49.95),
                    new Product("Fuel Injector - FI-8773", "Precision fuel injector for optimized fuel delivery", 125.75),
                    new Product("Alternator - AL-3011", "High-capacity alternator for consistent power supply", 199.99),
                    new Product("Battery - BAT-4501", "12V car battery with high cranking power", 139.99),
                    new Product("Radiator - RAD-5005", "Efficient radiator for superior cooling", 189.49),
                    new Product("Water Pump - WP-3207", "Water pump for engine cooling system", 89.95),
                    new Product("Exhaust Muffler - EM-8765", "High-performance muffler for quieter exhaust", 220.75),
                    new Product("Headlight Assembly - HA-9803", "Complete headlight assembly with LED lights", 150.45),
                    new Product("Tail Light Assembly - TA-7632", "Tail light assembly with durable design", 135.20),
                    new Product("Wiper Blade Set - WB-2410", "Premium wiper blades for clear visibility", 24.99),
                    new Product("Clutch Kit - CK-1155", "Complete clutch kit for smooth gear changes", 350.00),
                    new Product("Shock Absorber - SA-6040", "Heavy-duty shock absorbers for a smooth ride", 109.99),
                    new Product("Starter Motor - SM-4018", "Starter motor for reliable engine starts", 179.95),
                    new Product("Fuel Pump - FP-2217", "Electric fuel pump for efficient fuel delivery", 149.50),
                    new Product("Brake Disc - BD-9010", "Ventilated brake discs for improved stopping power", 99.99),
                    new Product("Power Steering Pump - PS-3152", "Power steering pump for easier maneuverability", 189.89)
            ));
        };
    }


}
