package com.sahil.lr.ui.menu;

import com.sahil.lr.actions.menu.DesertMenu;
import com.sahil.lr.actions.menu.Menu;
import org.junit.Test;

import static org.junit.Assert.*;

public class DesertMenuTest {

    @Test
    public void testShowMenu() throws Exception {
        Menu menu = new DesertMenu();
        menu.showMenu();
        assertEquals(11, menu.getCommands().size());
    }
}