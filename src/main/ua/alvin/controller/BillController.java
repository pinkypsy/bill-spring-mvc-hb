package main.ua.alvin.controller;

import main.ua.alvin.entity.CountedBillTable;
import main.ua.alvin.entity.FixedBillTable;
import main.ua.alvin.entity.ResultBillTable;
import main.ua.alvin.entity.TariffsTable;
import main.ua.alvin.service.TableService;
import main.ua.alvin.service.TariffsTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bill")
public class BillController {
    AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(TableService.class);

    TableService tableService;

    @RequestMapping("/addIndicationsForm")
    public String addIndications(Model model){

        model.addAttribute("tariffsTable", new TariffsTable());
        model.addAttribute("countedBillTable", new CountedBillTable());
        model.addAttribute("fixedBillTable", new FixedBillTable());

//        model.addAttribute("resultBillTable", new ResultBillTable());

        return "bill-form";
    }

    @RequestMapping("/saveTariffs")
    public String saveTariffs(@ModelAttribute("tariffsTable") TariffsTable tariffsTable){

        tableService = context.getBean("tariffsTableService", TableService.class);

//        tableService.save(tariffsTable);

        return "redirect:/bill/addIndicationsForm";
    }


//    @RequestMapping("/saveIndicationsCounted")
//
//
//    @RequestMapping("/saveFixedValues")

}
