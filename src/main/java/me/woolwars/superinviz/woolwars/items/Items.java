package me.woolwars.superinviz.woolwars.items;

import me.woolwars.superinviz.woolwars.Woolwars;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import java.util.ArrayList;
import java.util.List;

public class Items {

    public static ItemStack selectArena() {
        ItemStack selectArena = new ItemStack(Material.NETHER_STAR);
        ItemMeta meta = selectArena.getItemMeta();
        meta.setDisplayName(ChatColor.WHITE + "Выбраться арену");
        selectArena.setItemMeta(meta);
        return selectArena;
    }

    public static ItemStack arena1() {
        ItemStack arena1 = new ItemStack(Material.EMERALD_BLOCK);
        ItemMeta meta = arena1.getItemMeta();
        meta.setDisplayName(ChatColor.WHITE + "Арена 1 [" + Woolwars.playerOnArenaOne.size() + "/2]");
        arena1.setItemMeta(meta);
        return arena1;
    }

    public static ItemStack blueTeam() {
        ItemStack blueTeam = new ItemStack(351, 1, (byte) 4);
        ItemMeta meta = blueTeam.getItemMeta();
        meta.setDisplayName(ChatColor.BLUE + "Синяя команда");
        blueTeam.setItemMeta(meta);
        return blueTeam;
    }

    public static ItemStack redTeam() {
        ItemStack readTeam = new ItemStack(351, 1, (byte) 1);
        ItemMeta meta = readTeam.getItemMeta();
        meta.setDisplayName(ChatColor.RED + "Красная команда");
        readTeam.setItemMeta(meta);
        return readTeam;
    }

    public static ItemStack backToSpawn() {
        ItemStack backToSpawn = new ItemStack(Material.DIAMOND);
        ItemMeta meta = backToSpawn.getItemMeta();
        meta.setDisplayName(ChatColor.WHITE + "Вернуться на спавн");
        backToSpawn.setItemMeta(meta);
        return backToSpawn;
    }

    public static ItemStack selectKit() {
        ItemStack book = new ItemStack(Material.BOOK);
        ItemMeta meta = book.getItemMeta();
        meta.setDisplayName(ChatColor.WHITE + "Выберите кит");
        book.setItemMeta(meta);
        return book;
    }

    //***КИТЫ***\\
    // ЛУЧНИК
    public static ItemStack archer() {
        ItemStack bow = new ItemStack(Material.BOW);
        ItemMeta meta = bow.getItemMeta();
        meta.setDisplayName("Лучник");
        List<String> lore = new ArrayList<>();
        lore.add("Класс лучник из себя представляет");
        lore.add("Стандартный набор,в который входит лук ,дервянный топор");
        meta.setLore(lore);
        bow.setItemMeta(meta);
        return bow;
    }// ЛУЧНИК

    public static ItemStack[] armorRed() {
        ItemStack bootsR = new ItemStack(Material.LEATHER_BOOTS);
        ItemStack leggingsR = new ItemStack(Material.LEATHER_LEGGINGS);
        ItemStack chestplateR = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemStack helmetR = new ItemStack(Material.LEATHER_HELMET);
        ItemMeta meta = bootsR.getItemMeta();
        ItemMeta meta1 = leggingsR.getItemMeta();
        ItemMeta meta2 = chestplateR.getItemMeta();
        ItemMeta meta3 = helmetR.getItemMeta();
        LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta) meta;
        LeatherArmorMeta leatherArmorMeta1 = (LeatherArmorMeta) meta1;
        LeatherArmorMeta leatherArmorMeta2 = (LeatherArmorMeta) meta2;
        LeatherArmorMeta leatherArmorMeta3 = (LeatherArmorMeta) meta3;
        leatherArmorMeta.setColor(Color.RED);
        leatherArmorMeta1.setColor(Color.RED);
        leatherArmorMeta2.setColor(Color.RED);
        leatherArmorMeta3.setColor(Color.RED);
        bootsR.setItemMeta(meta);
        leggingsR.setItemMeta(meta1);
        chestplateR.setItemMeta(meta2);
        helmetR.setItemMeta(meta3);
        ItemStack[] armor = new ItemStack[4];
        armor[3] = helmetR;
        armor[2] = chestplateR;
        armor[1] = leggingsR;
        armor[0] = bootsR;
        return armor;
    }

    public static ItemStack[] armorBlue() {
        ItemStack bootsB = new ItemStack(Material.LEATHER_BOOTS);
        ItemStack leggingsB = new ItemStack(Material.LEATHER_LEGGINGS);
        ItemStack chestplateB = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemStack helmetB = new ItemStack(Material.LEATHER_HELMET);
        ItemMeta meta = bootsB.getItemMeta();
        ItemMeta meta1 = leggingsB.getItemMeta();
        ItemMeta meta2 = chestplateB.getItemMeta();
        ItemMeta meta3 = helmetB.getItemMeta();
        LeatherArmorMeta leatherArmorMeta = (LeatherArmorMeta) meta;
        LeatherArmorMeta leatherArmorMeta1 = (LeatherArmorMeta) meta1;
        LeatherArmorMeta leatherArmorMeta2 = (LeatherArmorMeta) meta2;
        LeatherArmorMeta leatherArmorMeta3 = (LeatherArmorMeta) meta3;
        leatherArmorMeta.setColor(Color.RED);
        leatherArmorMeta1.setColor(Color.RED);
        leatherArmorMeta2.setColor(Color.RED);
        leatherArmorMeta3.setColor(Color.RED);
        bootsB.setItemMeta(meta);
        leggingsB.setItemMeta(meta1);
        chestplateB.setItemMeta(meta2);
        helmetB.setItemMeta(meta3);
        ItemStack[] armor = new ItemStack[4];
        armor[3] = helmetB;
        armor[2] = chestplateB;
        armor[1] = leggingsB;
        armor[0] = bootsB;
        return armor;
    }
}
