package io.adityajoshi.resumebuilder.controller;

import io.adityajoshi.resumebuilder.form.Biodata;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ResumeBuildController {

    @GetMapping("/biodata")
    public String biodataForm(Model model) {
        model.addAttribute("biodata", new Biodata());
        return "biodata";
    }

    @PostMapping("/biodata")
    public String biodataSubmit(@ModelAttribute Biodata biodata, Model model) {
        model.addAttribute("biodata", biodata);
        return "result2";
    }
}
