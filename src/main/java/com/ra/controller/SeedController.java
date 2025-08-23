package com.ra.controller;

import com.ra.model.Seed;
import com.ra.service.CategoryService;
import com.ra.service.SeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.HandlerMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/seeds")
public class SeedController {
    @Autowired
    private SeedService seedService;
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private HandlerMapping defaultServletHandlerMapping;

    @GetMapping
    public String findAllSeed(Model model, @RequestParam(name = "page",defaultValue="1") int page,
                              @RequestParam(name = "size",defaultValue = "5") int size,
                              @RequestParam(name = "searchName",required = false) String searchName) {
List<Seed> seeds =seedService.findAllAndSearchName(page, size, searchName);
long totalElement = seedService.countAllAndSearchName(searchName);
int totalPages = (int)Math.ceil(totalElement/(double)size);
List<Integer> pages = new ArrayList<Integer>();
for(int i = page;i<=totalPages;i++) {
    pages.add(i);
}
model.addAttribute("searchName",searchName);
model.addAttribute("pages",pages);
model.addAttribute("seeds", seeds);
model.addAttribute("page",page);
model.addAttribute("size",size);
return "listSeed";
     }
}
