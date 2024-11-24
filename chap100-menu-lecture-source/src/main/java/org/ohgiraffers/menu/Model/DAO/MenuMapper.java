package org.ohgiraffers.menu.Model.DAO;

import org.apache.ibatis.annotations.Mapper;
import org.ohgiraffers.menu.Model.DTO.MenuDTO;

import java.util.List;

@Mapper
public interface menuMapper {

    List<MenuDTO> menuAll();
}
