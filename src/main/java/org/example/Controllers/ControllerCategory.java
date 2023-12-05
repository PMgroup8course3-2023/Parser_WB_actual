package org.example.Controllers;

import DB_Objects.Category.CategoryTable;
import org.example.Services.ServiceCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerCategory {

    @Autowired
    private ServiceCategory jsonService;

    @GetMapping("/readJson")
    public CategoryTable readJson() {
        return jsonService.readJson("https://catalog.wb.ru/menu/v10/api?lang=ru&locale=by&country=by&location=by");
    }
}
