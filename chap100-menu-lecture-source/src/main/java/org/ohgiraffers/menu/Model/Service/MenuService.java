package org.ohgiraffers.menu.Model.Service;

import org.ohgiraffers.menu.Model.DAO.MenuMapper;
import org.ohgiraffers.menu.Model.DTO.MenuDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {

    private final MenuMapper menuMapper;

    public MenuService(MenuMapper menuMapper) {

        this.menuMapper = menuMapper;
    }

    public List<MenuDTO> menuAll() {

       return menuMapper.menuAll();
    }
}
