package org.ohgiraffers.menu.Model.Service;

import org.ohgiraffers.menu.Model.DTO.MenuDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {

    private final org.ohgiraffers.menu.Model.DAO.menuMapper menuMapper;

    public MenuService(org.ohgiraffers.menu.Model.DAO.menuMapper menuMapper) {

        this.menuMapper = menuMapper;
    }

    public List<MenuDTO> menuAll() {

       return menuMapper.menuAll();
    }
}
