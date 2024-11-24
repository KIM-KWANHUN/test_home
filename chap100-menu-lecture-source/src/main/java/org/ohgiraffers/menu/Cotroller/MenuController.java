package org.ohgiraffers.menu.Cotroller;

import org.ohgiraffers.menu.Model.DTO.MenuDTO;
import org.ohgiraffers.menu.Model.Service.MenuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("menu/list")
public class MenuController {

    private MenuService menuService;

    public MenuController(MenuService menuService) {

        this.menuService = menuService;
    }

    @GetMapping("/list")
    public String menuAll(Model model){

        List<MenuDTO> menu = menuService.menuAll();

        return "";
    }
}
